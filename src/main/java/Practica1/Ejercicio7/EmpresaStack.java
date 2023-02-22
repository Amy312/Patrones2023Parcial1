package Practica1.Ejercicio7;

import java.util.Stack;

public class EmpresaStack implements IAgregate {

    private Stack<String> names;
    private Stack<String> ci;

    public EmpresaStack() {
        this.names = new Stack<>();
        this.ci = new Stack<>();
    }

    public Stack<String> getNames() {
        return names;
    }

    public void setNames(Stack<String> names) {
        this.names = names;
    }

    public Stack<String> getCi() {
        return ci;
    }

    public void setCi(Stack<String> ci) {
        this.ci = ci;
    }

    public void addEmployer(String ci, String name){
        this.ci.push(ci);
        this.names.push(name);
    }

    @Override
    public IteratorStack createIterator() {
        return new IteratorStack(this.ci, this.names);
    }
}
