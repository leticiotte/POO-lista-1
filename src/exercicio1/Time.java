package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String pais;
    private int quantidadeTitulos;
    private List<Jogador> jogadores;
    private List<Partida> partidas;

    public Time() {
    }

    public Time(String pais, int quantidadeTitulos) {
        this.pais = pais;
        this.quantidadeTitulos = quantidadeTitulos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getQuantidadeTitulos() {
        return quantidadeTitulos;
    }

    public void setQuantidadeTitulos(int quantidadeTitulos) {
        this.quantidadeTitulos = quantidadeTitulos;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }

    public void adicionarJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }

    @Override
    public String toString() {
        return "Time{" +
                "pais='" + pais + '\'' +
                ", quantidadeTitulos=" + quantidadeTitulos +
                '}';
    }
}
