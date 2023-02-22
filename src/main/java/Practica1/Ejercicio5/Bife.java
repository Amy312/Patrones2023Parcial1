package Practica1.Ejercicio5;

public class Bife extends ParrillaBuilder{
    @Override
    public void buildTipoDeCarne() {
        this.parrilla.setTipoDeCarne("bife");
    }

    @Override
    public void buildSaborRefresco() {
        this.parrilla.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        this.parrilla.setGuarniciones("Papas Fritas");
    }
}
