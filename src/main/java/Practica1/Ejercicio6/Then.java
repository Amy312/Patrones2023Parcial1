package Practica1.Ejercicio6;

public class Then extends UserStoryExpression {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Para")){
            context.output=context.output+"Then ";
            context.input = context.input.substring(4);
        }
    }
}
