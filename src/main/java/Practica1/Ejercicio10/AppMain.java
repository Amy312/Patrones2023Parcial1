package Practica1.Ejercicio10;

public class AppMain {
    public static void main(String[] args){
        Administrador administrador = new Administrador("Ramiro");

        Vehiculo v1 = new Vehiculo("1234", "X-Trail");
        Vehiculo v2 = new Vehiculo("2312", "Peta");
        Vehiculo v3 = new Vehiculo("6543", "Hammer");
        Vehiculo v4 = new Vehiculo("2426", "Mercedes");
        Vehiculo v5 = new Vehiculo("9643", "Jeep");
        Vehiculo v6 = new Vehiculo("0787", "Minbus");

        administrador.revisarRegistro();


        v1.pagarPeaje(5);
        v2.pagarPeaje(34);

        v3.pagarPeaje(21);
        administrador.revisarRegistro();

        v4.pagarPeaje(14);
        v6.pagarPeaje(25);
        v5.pagarPeaje(30);


        administrador.revisarRegistro();
        administrador.revisarSaldo();


    }
}
