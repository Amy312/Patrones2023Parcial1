package Practica1.Ejercicio5;

public class DirectorParrilla {

    private ParrillaBuilder parrillaBuilder;

    public Parrilla getParrilla(){
         return parrillaBuilder.getParrilla();
    }

    public void setParrilla(ParrillaBuilder parrillaBuilder){
        this.parrillaBuilder = parrillaBuilder;
    }

    public void buildParrilla(){
        this.parrillaBuilder.createParrilla();
        this.parrillaBuilder.buildGuarniciones();
        this.parrillaBuilder.buildTipoDeCarne();
        this.parrillaBuilder.buildSaborRefresco();

    }
}
