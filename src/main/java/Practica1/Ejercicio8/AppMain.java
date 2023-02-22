package Practica1.Ejercicio8;

public class AppMain {
    public static void main(String[] args) throws InterruptedException {
        Cliente c1 = new Cliente("Josue");
        Cliente c2 = new Cliente("Javier");
        Cliente c3 = new Cliente("Joaquin");
        Cliente c4 = new Cliente("Jose");

        Cuenta.getInstance().addSaldo(10000);

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Credito credito = new Credito(c1);
                credito.addCredito(1000);

            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Vivienda vivienda = new Vivienda(c4);
                vivienda.addVivienda(1000);


            }
        });

        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Financiamento financiamento = new Financiamento(c2);
                financiamento.addFianciamiento(4000);

            }
        });

        Thread th4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Negocio negocio = new Negocio(c3);
                negocio.addNegocio(4500);
            }
        });

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        Thread.sleep(3000);
        Cuenta.getInstance().finish();


    }
}
