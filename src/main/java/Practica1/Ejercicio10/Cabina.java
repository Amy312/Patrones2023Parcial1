package Practica1.Ejercicio10;



import java.util.HashMap;
import java.util.Map;

public class Cabina {
    private static Cabina instance = null;
    private int saldo = 0;
    private Map<Vehiculo, Integer> registro = new HashMap<Vehiculo, Integer>();

    private Cabina(){
        System.out.println("Abre cuenta de fondos");
    }


    private synchronized static void create() {
        if (instance == null)
            instance = new Cabina();
    }

    public static Cabina getInstance() {
        if (instance == null)
            create();
        return instance;
    }

    public synchronized void addSaldo(int pago, Vehiculo vehiculo){
            saldo+= pago;
            registro.put(vehiculo, pago);
            System.out.println("Se agregó el pago satisfactoriamente de Bs " + pago);
    }

    public void saldoActual(){
        System.out.println("El saldo actual es de Bs " + saldo);
    }

    public void revisarRegistro(){
        System.out.println("---Registros---");
        if(registro.size()==0){
            System.out.println("No hay registros");
        }else{
            for(Vehiculo key: registro.keySet()){
                System.out.println("- " + key.showInfo() + " - Bs " + registro.get(key));
            }
        }
        System.out.println();

    }

    public void finish(){
        System.out.println("Cuenta tiene  Bs " + this.saldo);
    }
}
