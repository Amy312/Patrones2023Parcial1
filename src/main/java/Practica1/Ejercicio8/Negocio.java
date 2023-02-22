package Practica1.Ejercicio8;

public class Negocio {

    private Cliente cliente;

    public Negocio(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addNegocio(int prestamo){
        if(Cuenta.getInstance().useSaldo(prestamo)){
            cliente.addDeuda(prestamo);
        }
    }
}
