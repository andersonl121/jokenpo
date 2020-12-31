/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andersonl121.jokenpo.model;

/**
 *
 * @author Anderson
 */
public class Jogo {

    private Jogador jogador1;
    private Jogador jogador2;
    private Rodada[] rodadas = new Rodada[10];

    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;

    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public Rodada[] getRodadas() {
        return rodadas;
    }

    public void setRodadas(Rodada[] rodadas) {
        this.rodadas = rodadas;
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
