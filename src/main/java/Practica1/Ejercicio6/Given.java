package Practica1.Ejercicio6;

public class Given extends UserStoryExpression {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Como")){
            context.output=context.output+"Given ";
            context.input = context.input.substring(4);
        }
    }
}
