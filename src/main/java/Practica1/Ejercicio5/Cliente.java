package Practica1.Ejercicio5;

public class Cliente {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void comprarParrilla(Parrilla parrilla){
        System.out.println("El cliente compró: ");
        parrilla.showInfo();
        System.out.println();
    }
}
