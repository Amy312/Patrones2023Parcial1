package Practica1.Ejercicio8;



public class Cuenta {

    private static Cuenta instance = null;
    private int saldo;
    private boolean inicioMes;
    private Cuenta(){
        System.out.println("Abre cuenta de fondos");
        inicioMes = true;
    }


    private synchronized static void create() {
        if (instance == null)
            instance = new Cuenta();
    }

    public static Cuenta getInstance() {
        if (instance == null)
            create();
        return instance;
    }

    public synchronized void addSaldo(int pago){
        if(inicioMes){
            saldo+= pago;
            System.out.println("Se agregó el deposito satisfactoriamente");
            inicioMes = false;
        } else{
            System.out.println("No se pudo añadir el dinero porque no es principio de mes");
        }

    }

    public synchronized boolean useSaldo(int prestamo){
        if(prestamo<=this.saldo){
            System.out.println("Se puede realizar el préstamo de Bs " + prestamo);
            this.saldo-=prestamo;
            return true;
        }else{
            System.out.println("No se pudo realizar el préstamo de Bs " + prestamo);
            return false;
        }
    }

    public void finish(){
        System.out.println("Cuenta de fondos tiene  Bs " + this.saldo);

    }
}
