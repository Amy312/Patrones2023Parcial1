package Practica1.Ejercicio8;

public class Vivienda {

    private Cliente cliente;

    public Vivienda(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addVivienda(int prestamo){
        if(Cuenta.getInstance().useSaldo(prestamo)){
            cliente.addDeuda(prestamo);
        }
    }
}
