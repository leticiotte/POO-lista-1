package exercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cerveja cerveja = new Cerveja("Cerveja Stella Artois", 5, 100, 0.05);
        Vinho vinho = new Vinho("Tesouro de Pias Mesa", 70, 50, "Uva Cabernet Sauvignon", "Portugal");

        Pizza pizza1 = new Pizza("Pizza marguerita", 50, true);
        Pizza pizza2 = new Pizza("Pizza mussarela", 48, false);
        Ingrediente ingrediente1 = new Ingrediente("Molho de tomate");
        Ingrediente ingrediente2 = new Ingrediente("Mussarela");
        Ingrediente ingrediente3 = new Ingrediente("Tomate");
        Ingrediente ingrediente4 = new Ingrediente("Manjericão");
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizza1);
        ingrediente3.setPizzas(pizzas);
        ingrediente4.setPizzas(pizzas);
        pizzas.add(pizza2);
        ingrediente1.setPizzas(pizzas);
        ingrediente2.setPizzas(pizzas);

        pizza1.setIngredientes(Arrays.asList(ingrediente1, ingrediente2, ingrediente3, ingrediente4));
        pizza2.setIngredientes(Arrays.asList(ingrediente1, ingrediente2));

        cerveja.mostrarDados();
        vinho.mostrarDados();

        System.out.println("\nIngredientes da pizza de marguerita: ");
        for(int i = 0; i < pizza1.getIngredientes().size(); i++){
            System.out.println(" - " + pizza1.getIngredientes().get(i).getNome());
        }

        System.out.println("\nIngredientes da pizza de mussarela: ");
        for(int i = 0; i < pizza2.getIngredientes().size(); i++){
            System.out.println(" - " + pizza2.getIngredientes().get(i).getNome());
        }
    }
}
