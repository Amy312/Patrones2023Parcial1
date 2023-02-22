package Practica1.Ejercicio3;

public class Cuaderno {
    private String tipo;
    private int nHojas;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getnHojas() {
        return nHojas;
    }

    public void setnHojas(int nHojas) {
        this.nHojas = nHojas;
    }

    public void showInfo() {
        System.out.println("Cuaderno: ");
        System.out.println("- Tipo: " + getTipo());
        System.out.println("- Número de Hojas: " + getnHojas() +"\n");
    }
}
