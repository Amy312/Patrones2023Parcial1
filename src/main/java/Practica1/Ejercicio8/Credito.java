package Practica1.Ejercicio8;

public class Credito {
    private Cliente cliente;

    public Credito(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addCredito(int prestamo){
        if(Cuenta.getInstance().useSaldo(prestamo)){
            cliente.addDeuda(prestamo);
        }
    }
}
