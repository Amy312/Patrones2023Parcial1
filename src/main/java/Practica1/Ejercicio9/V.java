package Practica1.Ejercicio9;

public class V extends NumeroExpression{
    private int number;
    public V(int number) {
        this.number = number;
    }

    @Override
    public void interpreter(Context context) {
        context.output = context.output + "V";

        for(int i=0; i<number-5; i++){
            context.output = context.output + "I";

        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);


    }
}
