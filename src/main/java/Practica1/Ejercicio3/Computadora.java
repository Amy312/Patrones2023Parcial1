package Practica1.Ejercicio3;

public class Computadora {
    private String marca;
    private String os;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void showInfo() {
        System.out.println("Computadora: ");
        System.out.println("- Marca: " + getMarca());
        System.out.println("- OS: " + getOs());
    }
}
