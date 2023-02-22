package Practica1.Ejercicio6;

public class When extends UserStoryExpression {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Quiero")){
            context.output=context.output+"When ";
            context.input = context.input.substring(6);
        }
    }
}
