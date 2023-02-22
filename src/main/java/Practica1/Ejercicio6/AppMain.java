package Practica1.Ejercicio6;

public class AppMain {
    public static void main(String[] args){
        String message = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias ";

        NonTerminalExpression text = new NonTerminalExpression(message);
        String translate = text.outputMessage();
        System.out.println(translate);
    }
}
