package Practica1.Ejercicio1;


public class Ventanilla {


    private static Ventanilla instance = null;
    private Cajero cajero;
    private int saldo = 0;
    private Ventanilla(){
        System.out.println("Abre la ventanilla");

    }



    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
        this.cajero.showInfo();
    }

    private synchronized static void create() {
        if (instance == null)
            instance = new Ventanilla();
    }

    public static Ventanilla getInstance() {
        if (instance == null)
            create();
        return instance;
    }

    public void addPago(int pago){
        this.saldo+= pago;

    }

    public void showSaldo() {
        System.out.println("El saldo actual es de: Bs " + this.saldo);
    }

    public void finish(){
        System.out.println("Ventanilla cerrada \nSe recaudó Bs " + this.saldo);

    }



}
