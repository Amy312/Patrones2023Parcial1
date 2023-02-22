package Practica1.Ejercicio7;


import java.util.HashMap;

public class AppMain {
    public static void main(String[] args){
        EmpresaStack empresaStack = new EmpresaStack();
        empresaStack.addEmployer("1","Marco");
        empresaStack.addEmployer("2","Marco2");
        empresaStack.addEmployer("3","Marco4");
        empresaStack.addEmployer("4","Marco3");
        empresaStack.addEmployer("5","Marco5");

        EmpresaList empresaList = new EmpresaList();
        empresaList.addEmployer("6","Juan");
        empresaList.addEmployer("7","Juan2");
        empresaList.addEmployer("8","Juan3");
        empresaList.addEmployer("9","Juan4");
        empresaList.addEmployer("10","Juan5");

        EmpresaArrays empresaArrays = new EmpresaArrays();
        empresaArrays.addEmployer("11","Luis");
        empresaArrays.addEmployer("12","Luis2");
        empresaArrays.addEmployer("13","Luis3");
        empresaArrays.addEmployer("14","Luis4");
        empresaArrays.addEmployer("15","Luis5");

        EmpresaVector empresaVector = new EmpresaVector();
        empresaVector.addEmployer("16","Javier");
        empresaVector.addEmployer("17","Javier2");
        empresaVector.addEmployer("18","Javier3");
        empresaVector.addEmployer("19","Javier4");
        empresaVector.addEmployer("20","Javier5");

        Iterator iterator;
        iterator = empresaArrays.createIterator();

        HashMap<String, String> lista = new HashMap<>();
        String[] datos = new String[2];

        while (iterator.hasNext()){
            int i=0;
            for (String word :String.valueOf(iterator.next()).split(" ")){
                datos[i] = word;
                i++;
            }
            lista.put(datos[0], datos[1]);
        }

        iterator = empresaStack.createIterator();

        while (iterator.hasNext()){
            int i=0;
            for (String word :String.valueOf(iterator.next()).split(" ")){
                datos[i] = word;
                i++;
            }
            lista.put(datos[0], datos[1]);
        }

        iterator = empresaList.createIterator();

        while (iterator.hasNext()){
            int i=0;
            for (String word :String.valueOf(iterator.next()).split(" ")){
                datos[i] = word;
                i++;
            }
            lista.put(datos[0], datos[1]);
        }

        iterator = empresaVector.createIterator();

        while (iterator.hasNext()){
            int i=0;
            for (String word :String.valueOf(iterator.next()).split(" ")){
                datos[i] = word;
                i++;
            }
            lista.put(datos[0], datos[1]);
        }

        for(String key: lista.keySet()){
            if(key!=null){
                System.out.println("- " + key + " , " + lista.get(key));

            }
        }

    }
}
