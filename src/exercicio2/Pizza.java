package exercicio2;

import java.util.List;

public class Pizza extends Produto{
    private boolean bordaRecheada;
    private List<Ingrediente> ingredientes;

    public Pizza() {
    }

    public Pizza(String descricao, double preco, boolean bordaRecheada) {
        super(descricao, preco);
        this.bordaRecheada = bordaRecheada;
    }

    public Pizza(String descricao, double preco, boolean bordaRecheada, List<Ingrediente> ingredientes) {
        super(descricao, preco);
        this.bordaRecheada = bordaRecheada;
        this.ingredientes = ingredientes;
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void mostrarDados(){
        System.out.println( "Pizza [ " +
                "bordaRecheada=" + bordaRecheada +
                ", ingredientes=" + ingredientes +
                " ]");
    }

}
