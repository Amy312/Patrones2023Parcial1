package Practica1.Ejercicio3;

public class KitColegialCreator extends CreatorKit{
    @Override
    public KitColegial create() {
        KitColegial kit = new KitColegial();
        Computadora computadora = new Computadora();
        computadora.setMarca("Lenovo13");
        computadora.setOs("Windows");

        Libro libro = new Libro();
        libro.setTipo("Educativo");
        libro.setAutor("Santillana");

        Mochila mochila = new Mochila();
        mochila.setnBolsillos(5);
        mochila.setTamano("30cm");

        kit.setComputadora(computadora);
        kit.setLibro(libro);
        kit.setMochila(mochila);

        return kit;
    }
}
