package exercicio2;

public class Cerveja extends Bebida{
    private double teorAlcoolico;

    public Cerveja() {
    }

    public Cerveja(String descricao, double preco, int quantidadeEstoque, double teorAlcoolico) {
        super(descricao, preco, quantidadeEstoque);
        this.teorAlcoolico = teorAlcoolico;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public void mostrarDados(){
        System.out.println( "Cerveja [ " +
                "descrição = " + this.getDescricao() + " | " +
                "preço = " + this.getPreco() + " | " +
                "quantidade de estoque = " + this.getQuantidadeEstoque() + " | " +
                "teor alcoolico = " + teorAlcoolico +
                " ]");
    }

}
