package Practica1.Ejercicio3;

public class KitEscolarCreator extends CreatorKit{
    @Override
    public KitEscolar create() {
        KitEscolar kit = new KitEscolar();
        Cuaderno cuaderno = new Cuaderno();
        cuaderno.setnHojas(100);
        cuaderno.setTipo("Carta");

        Deportivo deportivo = new Deportivo();
        deportivo.setnPrendas(5);
        deportivo.setTalla("M");
        deportivo.setColor("Azul");

        Mochila mochila = new Mochila();
        mochila.setnBolsillos(5);
        mochila.setTamano("30cm");

        kit.setCuaderno(cuaderno);
        kit.setDeportivo(deportivo);
        kit.setMochila(mochila);

        return kit;
    }
}
