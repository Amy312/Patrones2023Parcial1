package Practica1.Ejercicio7;


public class IteratorArrays implements Iterator{
    private String[] ci;
    private String[] names;

    private int position = 0;

    public IteratorArrays(String[] ci, String[] names) {
        this.ci = ci;
        this.names = names;
    }

    @Override
    public Object next() {
        String nota = this.ci[position] + " " + this.names[position];
        position++;
        return nota;
    }

    @Override
    public boolean hasNext() {
        return this.names.length != 0 && position <this.names.length;
    }
}
