package Practica1.Ejercicio5;

public class Lomito extends ParrillaBuilder{
    @Override
    public void buildTipoDeCarne() {
        this.parrilla.setTipoDeCarne("Lomo");
    }

    @Override
    public void buildSaborRefresco() {
        this.parrilla.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        this.parrilla.setGuarniciones("Arroz");
    }
}