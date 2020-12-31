/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andersonl121.jokenpo.controller;

import br.com.andersonl121.jokenpo.model.JogadaEnum;
import br.com.andersonl121.jokenpo.model.Jogador;
import br.com.andersonl121.jokenpo.model.Jogo;

/**
 *
 * @author Anderson
 */
public class CalculoGanhadorRodada {

    Jogo jogo;
    int rodada;

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }


    public CalculoGanhadorRodada(Jogo jogo,int rodada) {
        this.jogo = jogo;
        this.rodada = rodada;
    }

    public Jogador calculaGanhador() {
        if (Jogo.getRodadas().get(this.rodada).getJogada1() == JogadaEnum.PEDRA && Jogo.getRodadas().get(this.rodada).getJogada2() == JogadaEnum.TESOURA) {

            return Jogo.getJogador1();

        }

        if (Jogo.getRodadas().get(this.rodada).getJogada1() == JogadaEnum.TESOURA && Jogo.getRodadas().get(this.rodada).getJogada2() == JogadaEnum.PAPEL) {

            return Jogo.getJogador1();

        }

        if (Jogo.getRodadas().get(this.rodada).getJogada1() == JogadaEnum.PAPEL && Jogo.getRodadas().get(this.rodada).getJogada2() == JogadaEnum.PEDRA) {

            return Jogo.getJogador1();

        }

        if (Jogo.getRodadas().get(this.rodada).getJogada2() == JogadaEnum.PEDRA && Jogo.getRodadas().get(this.rodada).getJogada1() == JogadaEnum.TESOURA) {

            return Jogo.getJogador2();

        }

        if (Jogo.getRodadas().get(this.rodada).getJogada2() == JogadaEnum.TESOURA && Jogo.getRodadas().get(this.rodada).getJogada1() == JogadaEnum.PAPEL) {

            return Jogo.getJogador2();

        }

        if (Jogo.getRodadas().get(this.rodada).getJogada2() == JogadaEnum.PAPEL && Jogo.getRodadas().get(this.rodada).getJogada1() == JogadaEnum.PEDRA) {

            return Jogo.getJogador2();

        }
        
        return null;
    }

}
