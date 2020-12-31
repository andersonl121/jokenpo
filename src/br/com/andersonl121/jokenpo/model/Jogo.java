/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andersonl121.jokenpo.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anderson
 */
public class Jogo {

    private static Jogador jogador1;
    private static Jogador jogador2;
    private static List<Rodada> rodadas = new ArrayList<Rodada>();

    public Jogo(Jogador jogador1, Jogador jogador2) {
        Jogo.jogador1 = jogador1;
        Jogo.jogador2 = jogador2;

    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        Jogo.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        Jogo.jogador2 = jogador2;
    }

    public static List<Rodada> getRodadas() {
        return rodadas;
    }

    public static void setRodadas(List<Rodada> rodadas) {
        Jogo.rodadas = rodadas;
    }

    

    public int getPontosJogador(Jogador jogador) {
        int pontos = 0;
        for (Rodada rodada : rodadas) {
            if (rodada != null) {
                if (jogador.equals(rodada.getGanhadorRodada())) {
                    pontos = pontos+1;
                }
            }

        }
        return pontos;
    }

}
