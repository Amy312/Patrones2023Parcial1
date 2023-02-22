package Practica1.Ejercicio3;

public class Deportivo {
    private String talla;
    private String color;
    private int nPrendas;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getnPrendas() {
        return nPrendas;
    }

    public void setnPrendas(int nPrendas) {
        this.nPrendas = nPrendas;
    }

    public void showInfo() {
        System.out.println("Deportivo: ");
        System.out.println("- Número de prendas: " + getnPrendas());
        System.out.println("- Talla: " + getTalla());
        System.out.println("- Color: " + getColor());

    }
}
