package Practica1.Ejercicio7;

import java.util.Vector;

public class EmpresaVector implements IAgregate{
    private Vector<String> ci;
    private Vector<String> names ;

    public EmpresaVector() {
        this.ci = new Vector<>();
        this.names = new Vector<>();
    }

    public Vector<String> getCi() {
        return ci;
    }

    public void setCi(Vector<String> ci) {
        this.ci = ci;
    }

    public Vector<String> getNames() {
        return names;
    }

    public void setNames(Vector<String> names) {
        this.names = names;
    }

    public void addEmployer(String ci, String name){
        this.ci.add(ci);
        this.names.add(name);
    }

    @Override
    public IteratorVector createIterator() {
        return new IteratorVector(this.names, this.ci);
    }
}
