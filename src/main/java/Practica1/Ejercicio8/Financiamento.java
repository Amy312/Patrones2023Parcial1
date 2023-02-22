package Practica1.Ejercicio8;

public class Financiamento {

    private Cliente cliente;

    public Financiamento(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addFianciamiento(int prestamo){
        if(Cuenta.getInstance().useSaldo(prestamo)){
            cliente.addDeuda(prestamo);
        }
    }
}
