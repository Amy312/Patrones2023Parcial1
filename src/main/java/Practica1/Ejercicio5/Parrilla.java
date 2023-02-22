package Practica1.Ejercicio5;

public class Parrilla {

    private String tipoDeCarne;
    private String saborRefresco;
    private String guarniciones;

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public Parrilla setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
        return this;

    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public Parrilla setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
        return this;

    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public Parrilla setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
        return this;
    }

    public void showInfo(){
        System.out.println("Tipo de Carne: " + getTipoDeCarne());
        System.out.println("Sabor de Refresco: " + getSaborRefresco());
        System.out.println("Guarniciones: " + getGuarniciones());

    }
}
