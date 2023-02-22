package Practica1.Ejercicio7;

import java.util.Stack;

public class IteratorStack implements Iterator{
    private Stack<String> names;
    private Stack<String> ci;
    private int position = 0;

    public IteratorStack(Stack<String> ci, Stack<String> names) {
        this.names = names;
        this.ci = ci;
    }

    @Override
    public Object next() {
        String nota = this.ci.peek() + " "  + this.names.peek();
        this.ci.pop();
        this.names.pop();
        return nota;
    }

    @Override
    public boolean hasNext() {
        return this.names.size() != 0 && position <this.names.size();
    }
}
