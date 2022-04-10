package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Estadio {
    private String nome;
    private String cidade;
    private List<Partida> partidas;

    public Estadio() {
        this.nome = "";
        this.cidade = "";
        this.partidas = new ArrayList<Partida>();
    }

    public Estadio(String nome, String cidade, List<Partida> partidas) {
        this.nome = nome;
        this.cidade = cidade;
        this.partidas = partidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }

    @Override
    public String toString() {
        return "Estadio{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", partidas=" + partidas +
                '}';
    }
}
