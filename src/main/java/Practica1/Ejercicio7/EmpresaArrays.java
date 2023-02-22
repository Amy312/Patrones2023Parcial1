package Practica1.Ejercicio7;


public class EmpresaArrays implements IAgregate{
    private String[] ci;
    private String[] names;
    private int position = 0;


    public EmpresaArrays() {
        this.ci = new String[10];
        this.names = new String[10];
    }

    public String[] getCi() {
        return ci;
    }

    public void setCi(String[] ci) {
        this.ci = ci;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public void addEmployer(String ci, String name){
        this.ci[position] = ci;
        this.names[position] = name;
        position++;
    }

    @Override
    public IteratorArrays createIterator() {
        return new IteratorArrays(this.ci, this.names);
    }
}
