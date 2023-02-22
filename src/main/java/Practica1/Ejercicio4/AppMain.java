package Practica1.Ejercicio4;

public class AppMain {
    public static void main(String[] args){
        Estudiante es1 = new Estudiante("Marco", "6746321");
        Estudiante es2 = new Estudiante("Luis", "2321812");
        Estudiante es3 = new Estudiante("Alan", "8482612");
        Estudiante es4 = new Estudiante("Johann", "10240134");
        Estudiante es5 = new Estudiante("Victor", "1024321");

        String materia = "ingles";
        Ingles ingles = (Ingles) FactoryCurso.make(materia);
        ingles.inscribir(es1);

        materia = "historia";
        Historia historia = (Historia) FactoryCurso.make(materia);
        historia.inscribir(es2);

        materia = "lenguaje";
        Lenguaje lenguaje = (Lenguaje) FactoryCurso.make(materia);
        lenguaje.inscribir(es3);

        materia = "matematica";
        Matematica matematica = (Matematica) FactoryCurso.make(materia);
        matematica.inscribir(es4);

        materia = "ingles";
        ingles.inscribir(es5);
    }
}
