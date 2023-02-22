package Practica1.Ejercicio9;

public class X extends NumeroExpression{
    private int number;
    public X(int number) {
        this.number = number;
    }

    @Override
    public void interpreter(Context context) {

        context.output = context.output + "X ";
        context.input = context.input.substring(2);


    }
}
