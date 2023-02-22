package Practica1.Ejercicio3;

public class Mochila {
    private int nBolsillos;
    private String tamano;

    public int getnBolsillos() {
        return nBolsillos;
    }

    public void setnBolsillos(int nBolsillos) {
        this.nBolsillos = nBolsillos;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void showInfo() {
        System.out.println("Mochila: ");
        System.out.println("- Número de bolsillos: " + getnBolsillos());
        System.out.println("- Tamaño: " + getTamano() + "\n");
    }
}
