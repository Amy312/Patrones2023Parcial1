package Practica1.Ejercicio3;

public class KitEscolar implements IKit{
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuaderno cuaderno;

    public KitEscolar(){}
    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }

    @Override
    public void showKit() {
        System.out.println("-- Kit Escolar -- ");
        this.cuaderno.showInfo();
        this.mochila.showInfo();
        this.deportivo.showInfo();
        System.out.println();
    }
}
