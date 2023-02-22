package Practica1.Ejercicio10;

public class Administrador {
    private String nombre;

    public Administrador(String nombre) {
        this.nombre = nombre;
    }

    public void revisarSaldo(){
        Cabina.getInstance().saldoActual();
    }

    public void revisarRegistro(){
        Cabina.getInstance().revisarRegistro();
    }
}
