/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andersonl121.jokenpo.controller;

import br.com.andersonl121.jokenpo.model.Jogador;
import br.com.andersonl121.jokenpo.model.Jogo;
import br.com.andersonl121.jokenpo.model.Rodada;

/**
 *
 * @author Anderson
 */
public class CalcularGanhadorJogo {

    private Jogo jogo;
    private int pontosJogador1 = 0;
    private int pontosJogador2 = 0;
    
    
    public CalcularGanhadorJogo(Jogo jogo){
        this.jogo = jogo;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public int getPontosJogador1() {
        return pontosJogador1;
    }

    public void setPontosJogador1(int pontosJogador1) {
        this.pontosJogador1 = pontosJogador1;
    }

    public int getPontosJogador2() {
        return pontosJogador2;
    }

    public void setPontosJogador2(int pontosJogador2) {
        this.pontosJogador2 = pontosJogador2;
    }

    public Jogador calculaGanhador() {

        for (Rodada rodada : jogo.getRodadas()) {
            if (rodada.getGanhadorRodada().equals(jogo.getJogador1())) {
                pontosJogador1 = pontosJogador1+1;
            } else if (rodada.getGanhadorRodada().equals(jogo.getJogador2())) {
                pontosJogador2 = pontosJogador2+1;
            }
        }

        if (pontosJogador1 > pontosJogador2) {
            return jogo.getJogador1();
        } else if (pontosJogador2 > pontosJogador1) {
            return jogo.getJogador2();
        }

        return null;

    }

}
