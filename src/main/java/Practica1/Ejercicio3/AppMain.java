package Practica1.Ejercicio3;

public class AppMain {
    public static void main(String[] args){
        KitEscolar ke1 = new KitEscolarCreator().create();
        KitEscolar ke2 = new KitEscolarCreator().create();

        KitColegial kc1 = new KitColegialCreator().create();
        KitColegial kc2 = new KitColegialCreator().create();

        ke1.showKit();
        ke2.showKit();

        kc1.showKit();
        kc2.showKit();

    }
}
