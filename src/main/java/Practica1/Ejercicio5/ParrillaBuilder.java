package Practica1.Ejercicio5;

public abstract class ParrillaBuilder {

    protected Parrilla parrilla;

    public Parrilla getParrilla() {
        return parrilla;
    }

    public void createParrilla(){
        parrilla = new Parrilla();
    }

    public abstract void buildTipoDeCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();


}
