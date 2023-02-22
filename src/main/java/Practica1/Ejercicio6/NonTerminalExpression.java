package Practica1.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression extends UserStoryExpression {
    private List<UserStoryExpression> userStory = new ArrayList<>();
    private Context context;

    public NonTerminalExpression (String input){
        context = new Context(input.replace(" ",""));
        for (String wordInput :input.split(" ")){

            switch (wordInput){
                case "Como":
                    userStory.add(new Given());
                    break;
                case "Quiero":
                    userStory.add(new When());
                    break;
                case "Para":
                    userStory.add(new Then());
                    break;
                default:
                    userStory.add(new Copy(wordInput));
                    break;
            }

        }
    }

    public String outputMessage(){
        for (UserStoryExpression expression:userStory){
            expression.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}
