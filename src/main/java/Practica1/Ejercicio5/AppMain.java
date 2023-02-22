package Practica1.Ejercicio5;

public class AppMain {
    public static void main(String[] args){
        DirectorParrilla directorParrilla = new DirectorParrilla();
        Cliente cliente = new Cliente("Josue");

        Bife bife = new Bife();
        directorParrilla.setParrilla(bife);
        directorParrilla.buildParrilla();

        Parrilla p1 = directorParrilla.getParrilla();
        cliente.comprarParrilla(p1);

        Lomito lomito = new Lomito();
        directorParrilla.setParrilla(lomito);
        directorParrilla.buildParrilla();

        Parrilla p2 = directorParrilla.getParrilla();
        cliente.comprarParrilla(p2);

        Tira tira = new Tira();
        directorParrilla.setParrilla(tira);
        directorParrilla.buildParrilla();

        Parrilla p3 = directorParrilla.getParrilla();
        cliente.comprarParrilla(p3);
    }

}
