package Practica1.Ejercicio10;

public class Vehiculo {
    private String placa;
    private String modelo;

    public Vehiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public void pagarPeaje(int pago){
        Cabina.getInstance().addSaldo(pago, this);
    }


    public String showInfo() {
        return ("Placa: " + placa + ", modelo: " + modelo);
    }
}
