package Practica1.Ejercicio3;

public class Libro {
    private String tipo;
    private String autor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void showInfo() {
        System.out.println("Libro: ");
        System.out.println("- Tipo: " + getTipo());
        System.out.println("- Autor: " + getAutor() + "\n");
    }
}
