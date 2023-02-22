package Practica1.Ejercicio9;

public class IVX extends NumeroExpression{
    private int number;
    public IVX(int number) {
        this.number = number;
    }

    @Override
    public void interpreter(Context context) {
        if(number == 4){
            context.output = context.output + "IV ";
        } else {
            context.output = context.output + "IX ";
        }

        context.input = context.input.substring(1);


    }
}
