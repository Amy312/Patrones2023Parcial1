package Practica1.Ejercicio7;

import java.util.List;

public class IteratorList implements Iterator{
    private List<String> names;
    private List<String> ci;
    private int position = 0;

    public IteratorList(List<String> ci, List<String> names) {
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