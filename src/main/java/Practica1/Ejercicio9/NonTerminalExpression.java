package Practica1.Ejercicio9;



import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression extends NumeroExpression {
    private List<NumeroExpression> userStory = new ArrayList<>();
    private Context context;

    public NonTerminalExpression (String input){
        context = new Context(input.replace(" ",""));
        for (String number :input.split(" ")){
            int n = Integer.parseInt(number);
            switch (n){
                case 1, 2, 3:
                    userStory.add(new I(n));
                    break;
                case 5, 6, 7, 8:
                    userStory.add(new V(n));
                    break;
                case 10:
                    userStory.add(new X(n));
                    break;
                default:
                    userStory.add(new IVX(n));
                    break;
            }

        }
    }

    public String outputMessage(){
        for (NumeroExpression expression:userStory){
            expression.interpreter(context);
        }
        return context.output;
    }


    @Override
    public void interpreter(Context context) {

    }
}
