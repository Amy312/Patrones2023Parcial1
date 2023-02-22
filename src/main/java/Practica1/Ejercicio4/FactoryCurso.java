package Practica1.Ejercicio4;

public class FactoryCurso {
    public static ICurso make(String tipoCurso){
        ICurso curso;

        switch (tipoCurso.toLowerCase()){
            case "historia":
                curso = new Historia();
                break;
            case "ingles":
                curso = new Ingles();
                break;
            case "lenguaje":
                curso = new Lenguaje();
                break;
            default:
                curso = new Matematica();
        }
        return curso;
    }
}
