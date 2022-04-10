package exercicio2;

import java.util.List;

public class Ingrediente {
    private String nome;
    private List<Pizza> pizzas;

    public Ingrediente() {
    }

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    public Ingrediente(String nome, List<Pizza> pizzas) {
        this.nome = nome;
        this.pizzas = pizzas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }


}
