package Practica1.Ejercicio4;

public class Ingles implements ICurso{
    @Override
    public void inscribir(Estudiante estudiante) {
        System.out.println("El estudiante " + estudiante.getNombre() + " se inscribio a la materia de Inglés");

    }
}
