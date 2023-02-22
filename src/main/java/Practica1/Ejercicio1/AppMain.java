package Practica1.Ejercicio1;


public class AppMain {
    public static void main(String[] args){

        Cajero cajero = new Cajero("Ramiro", "54768");

        Estudiante est1 = new Estudiante("Marco");
        Estudiante est2 = new Estudiante("Juan");
        Estudiante est3 = new Estudiante("Jose");
        Estudiante est4 = new Estudiante("Mario");
        Estudiante est5 = new Estudiante("Joaquin");

        Ventanilla.getInstance().showSaldo();
        cajero.addSaldo(100, est1);
        Ventanilla.getInstance().showSaldo();

        cajero.addSaldo(2164, est2);
        Ventanilla.getInstance().showSaldo();

        cajero.addSaldo(1000, est3);
        Ventanilla.getInstance().showSaldo();

        cajero.addSaldo(2160, est4);

        cajero.addSaldo(364, est5);
        Ventanilla.getInstance().showSaldo();

        Ventanilla.getInstance().finish();









    }
}
