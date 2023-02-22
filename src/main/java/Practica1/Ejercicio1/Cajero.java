package Practica1.Ejercicio1;


public class Cajero {

    private String nombre;
    private String codigo;

    public Cajero(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        Ventanilla.getInstance().setCajero(this);
    }

    public void showInfo() {
        System.out.println("El cajero a cargo es: " + this.nombre);
    }

    public void addSaldo(int pago, Estudiante estudiante) {
        System.out.println("Se canceló Bs " + pago + " del estudiante " + estudiante.getNombre());
        Ventanilla.getInstance().addPago(pago);
    }
}
