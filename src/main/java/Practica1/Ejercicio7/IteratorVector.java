package Practica1.Ejercicio7;

import java.util.Vector;

public class IteratorVector implements Iterator{

    private Vector<String> names;
    private Vector<String> ci;
    private int position = 0;

    public IteratorVector(Vector<String> names, Vector<String> ci) {
        this.names = names;
        this.ci = ci;
    }

    @Override
    public Object next() {
        String nota = this.ci.get(position) + " " + this.names.get(position);
        position++;
        return nota;
    }

    @Override
    public boolean hasNext() {
        return this.names.size() != 0 && position <this.names.size();
    }
}
