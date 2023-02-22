package Practica1.Ejercicio8;

public class Cliente {
    private String nombre;
    private int deuda = 0;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void addDeuda(int prestamo){
        System.out.println("Se añadio Bs  " + prestamo + " a la deuda del cliente " + nombre);
        this.deuda+= prestamo;
    }
}
