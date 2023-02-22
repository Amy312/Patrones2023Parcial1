package Practica1.Ejercicio6;

public class Copy extends UserStoryExpression {

    private String word;
    public Copy(String wordInput) {
        super();
        word = wordInput;
    }

    @Override
    public void interpreter(Context context) {
            context.output = context.output + word + " ";
            context.input = context.input.substring(word.length());


    }
}
