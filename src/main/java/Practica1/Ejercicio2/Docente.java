package Practica1.Ejercicio2;


public class Docente implements IDocente {
    private int sueldo;
    private int carga_Horaria;
    private boolean curso_Educacion_Superior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String marcadoHoraEntrada;
    private String marcadoHoraSalida;
    private String nombre;
    private String apellido;

    public Docente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCarga_Horaria() {
        return carga_Horaria;
    }

    public void setCarga_Horaria(int carga_Horaria) {
        this.carga_Horaria = carga_Horaria;
    }

    public boolean isCurso_Educacion_Superior() {
        return curso_Educacion_Superior;
    }

    public void setCurso_Educacion_Superior(boolean curso_Educacion_Superior) {
        this.curso_Educacion_Superior = curso_Educacion_Superior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoHoraEntrada() {
        return marcadoHoraEntrada;
    }

    public void setMarcadoHoraEntrada(String marcadoHoraEntrada) {
        this.marcadoHoraEntrada = marcadoHoraEntrada;
    }

    public String getMarcadoHoraSalida() {
        return marcadoHoraSalida;
    }

    public void setMarcadoHoraSalida(String marcadoHoraSalida) {
        this.marcadoHoraSalida = marcadoHoraSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    @Override
    public Docente clone() {
        Docente clone = new Docente(this.nombre, this.apellido);
        clone.setSueldo(this.getSueldo());
        clone.setCarga_Horaria(this.getCarga_Horaria());
        clone.setCurso_Educacion_Superior(this.isCurso_Educacion_Superior());
        clone.setAccesoPlataforma(this.isAccesoPlataforma());
        clone.setMarcadoBiometrico(this.isMarcadoBiometrico());
        clone.setMarcadoHoraEntrada(this.getMarcadoHoraEntrada());
        clone.setMarcadoHoraSalida(this.getMarcadoHoraSalida());
        return clone;
    }

    public void showInfo(){
        System.out.println("Docente: " + getNombre() + " " + getApellido());
        System.out.println("Sueldo: " + getSueldo());
        System.out.println("Carga Horaria: " + getCarga_Horaria());
        System.out.println("Curso Educación superior: " + isCurso_Educacion_Superior());
        System.out.println("Acceso a plataforma: " + isAccesoPlataforma());
        System.out.println("Marcado Biométrico: " + isMarcadoBiometrico());
        System.out.println("Hora de Entrada: " + getMarcadoHoraEntrada());
        System.out.println("Hora de Salida: " + getMarcadoHoraSalida());
        System.out.println();
    }
}
