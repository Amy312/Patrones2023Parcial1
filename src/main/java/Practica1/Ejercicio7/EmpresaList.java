package Practica1.Ejercicio7;


import java.util.ArrayList;
import java.util.List;

public class EmpresaList implements IAgregate{
    private List<String> names;
    private List<String> ci;

    public EmpresaList() {
        this.names = new ArrayList<>();
        this.ci = new ArrayList<>();
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<String> getCi() {
        return ci;
    }

    public void setCi(List<String> ci) {
        this.ci = ci;
    }

    public void addEmployer(String ci, String name){
        this.ci.add(ci);
        this.names.add(name);
    }

    @Override
    public IteratorList createIterator() {
        return new IteratorList(this.ci, this.names);
    }
}
