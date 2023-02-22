package Practica1.Ejercicio9;


public class AppMain {
    public static void main(String[] args){
        String message = "1 2 3 4 5 6 7 8 9 10 1 8 6 5 4";

        NonTerminalExpression text = new NonTerminalExpression(message);
        String translate = text.outputMessage();
        System.out.println(message);
        System.out.println(translate);
    }
}
