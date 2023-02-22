package Practica1.Ejercicio2;

public class AppMain {
    public static void main(String[] args){

        Docente d1 = new Docente("Jose", "Carrasco");
        d1.setSueldo(5000);
        d1.setCarga_Horaria(80);
        d1.setCurso_Educacion_Superior(true);
        d1.setAccesoPlataforma(true);
        d1.setMarcadoBiometrico(false);
        d1.setMarcadoHoraEntrada("08:00");
        d1.setMarcadoHoraSalida("18:00");

        d1.showInfo();

        Docente d2 = d1.clone();
        d2.setNombre("Marco");
        d2.setApellido("Rojas");
        d2.showInfo();

        Docente d3 = d1.clone();
        d3.setNombre("Jhosep");
        d3.setApellido("Ochoa");
        d3.showInfo();

        Docente d4 = d1.clone();
        d4.setNombre("Ander");
        d4.setApellido("Cayllan");
        d4.showInfo();

        Docente d5 = d1.clone();
        d5.setNombre("Hugo");
        d5.setApellido("Apaza");
        d5.showInfo();

        Docente d6 = d1.clone();
        d6.setNombre("Pablo");
        d6.setApellido("Quispe");
        d6.showInfo();

        Docente d7 = d1.clone();
        d7.setNombre("Jorge");
        d7.setApellido("Ayala");
        d7.showInfo();

        Docente d8 = d1.clone();
        d8.setNombre("Sergio");
        d8.setApellido("Ayala");
        d8.showInfo();

        Docente d9 = d1.clone();
        d9.setNombre("Javier");
        d9.setApellido("Cabrera");
        d9.showInfo();

        Docente d10 = d1.clone();
        d10.setNombre("Enrique");
        d10.setApellido("vicente");
        d10.showInfo();

        Docente d11 = d1.clone();
        d11.setNombre("Rodrigo");
        d11.setApellido("Pacheco");
        d11.showInfo();

        Docente d12 = d1.clone();
        d12.setNombre("Johann");
        d12.setApellido("De La Torre");
        d12.showInfo();

        Docente d13 = d1.clone();
        d13.setNombre("Luis");
        d13.setApellido("Revilla");
        d13.showInfo();

        Docente d14 = d1.clone();
        d14.setNombre("Ambar");
        d14.setApellido("Rojas");
        d14.showInfo();

        Docente d15 = d1.clone();
        d15.setNombre("Josue");
        d15.setApellido("Ceja");
        d15.showInfo();
    }
}
