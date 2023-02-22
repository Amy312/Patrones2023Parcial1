package Practica1.Ejercicio3;

public class KitColegial implements IKit{

    private Mochila mochila;
    private Libro libro;
    private Computadora computadora;

    public KitColegial() {}

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void showKit() {
        System.out.println("-- Kit Colegial -- ");
        this.libro.showInfo();
        this.mochila.showInfo();
        this.computadora.showInfo();
        System.out.println();
    }
}
