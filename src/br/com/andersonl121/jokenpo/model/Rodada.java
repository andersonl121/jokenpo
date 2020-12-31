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
public class Rodada {
    
    private int numeroRodada;
    private JogadaEnum jogada1;
    private JogadaEnum jogada2;
    private Jogador ganhadorRodada;

    public int getNumeroRodada() {
        return numeroRodada;
    }

    public void setNumeroRodada(int numeroRodada) {
        this.numeroRodada = numeroRodada;
    }

    public JogadaEnum getJogada1() {
        return jogada1;
    }

    public void setJogada1(JogadaEnum jogada1) {
        this.jogada1 = jogada1;
    }

    public JogadaEnum getJogada2() {
        return jogada2;
    }

    public void setJogada2(JogadaEnum jogada2) {
        this.jogada2 = jogada2;
    }

    public Jogador getGanhadorRodada() {
        return ganhadorRodada;
    }

    public void setGanhadorRodada(Jogador ganhadorRodada) {
        this.ganhadorRodada = ganhadorRodada;
    }
    
    

    
    
    
    
}
