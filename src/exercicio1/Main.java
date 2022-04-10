package exercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Dudu", "Atacante", 7);
        Jogador j2 = new Jogador("Raphael Veiga", "Meio-campista", 23);
        Jogador j3 = new Jogador("Jorge", "Lateral-esquerdo", 6);
        Jogador j4 = new Jogador("Mayke", "Lateral-direito", 12);
        Jogador j5 = new Jogador("Luan", "Zagueiro", 13);
        Jogador j6 = new Jogador("Mbappé", "Atacante", 7);
        Jogador j7 = new Jogador("Xavi", "Meio-campista", 34);
        Jogador j8 = new Jogador("Luan", "Lateral-esquerdo", 13);
        Jogador j9 = new Jogador("Nuno", "Lateral-direito", 25);
        Jogador j10 = new Jogador("Marquinhos", "Zagueiro", 5);
        List<Jogador> jogadores1 = new ArrayList<>();
        jogadores1.add(j1);
        jogadores1.add(j2);
        jogadores1.add(j3);
        jogadores1.add(j4);
        jogadores1.add(j5);
        List<Jogador> jogadores2 = new ArrayList<>();
        jogadores2.add(j6);
        jogadores2.add(j7);
        jogadores2.add(j8);
        jogadores2.add(j9);

        Partida p1 = new Partida("09/04/2022", "18:00", 0, 0);
        p1.atualizarResultado(1, 3);
        List<Partida> partidas = new ArrayList<>();
        partidas.add(p1);


        Time t1 = new Time("Brasil", 5);
        t1.setJogadores(jogadores1);
        t1.setPartidas(partidas);
        Time t2 = new Time("França", 5);
        t2.setJogadores(jogadores2);
        t2.adicionarJogador(j10);
        t2.setPartidas(partidas);
        p1.setTime1(t1);
        p1.setTime2(t2);


        j1.setTime(t1);
        j2.setTime(t1);
        j3.setTime(t1);
        j4.setTime(t1);
        j5.setTime(t1);

        j6.setTime(t2);
        j7.setTime(t2);
        j8.setTime(t2);
        j9.setTime(t2);
        j10.setTime(t2);

        Estadio e = new Estadio("Estádio 1", "Paris", partidas);
        System.out.println("Time 1 - jogadores: ");
        for (int i = 0; i < t1.getJogadores().size(); i++){
            System.out.println(t1.getJogadores().get(i));
        }

        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("Time 2 - jogadores: ");
        for (int i = 0; i < t2.getJogadores().size(); i++){
            System.out.println(t2.getJogadores().get(i));
        }

        System.out.println("--------------------------------------------------------------------------------------");


        System.out.println("Resultado da partida: " + p1.getPlacarTime1() + "-" + p1.getPlacarTime2());

    }
}
