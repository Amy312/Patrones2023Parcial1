package Practica1.Ejercicio9;


public class I extends NumeroExpression{
    private int number;
    public I(int number) {
        this.number = number;
    }

    @Override
    public void interpreter(Context context) {
        for(int i=0; i<number; i++){
            context.output = context.output + "I";

        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);


    }

}
