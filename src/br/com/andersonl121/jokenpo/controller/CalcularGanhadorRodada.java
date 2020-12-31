/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andersonl121.jokenpo.controller;

import br.com.andersonl121.jokenpo.model.JogadaEnum;
import br.com.andersonl121.jokenpo.model.Jogador;
import br.com.andersonl121.jokenpo.model.Jogo;
import br.com.andersonl121.jokenpo.model.Rodada;

/**
 *
 * @author Anderson
 */
public class CalcularGanhadorRodada {

    Jogo jogo;
    int rodada;

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }


    public CalcularGanhadorRodada(Jogo jogo,int rodada) {
        this.jogo = jogo;
        this.rodada = rodada;
    }

    public Jogador calculaGanhador() {
        if (jogo.getRodadas()[this.rodada].getJogada1() == JogadaEnum.PEDRA && jogo.getRodadas()[this.rodada].getJogada2() == JogadaEnum.TESOURA) {

            return jogo.getJogador1();

        }

        if (jogo.getRodadas()[this.rodada].getJogada1() == JogadaEnum.TESOURA && jogo.getRodadas()[this.rodada].getJogada2() == JogadaEnum.PAPEL) {

            return jogo.getJogador1();

        }

        if (jogo.getRodadas()[this.rodada].getJogada1() == JogadaEnum.PAPEL && jogo.getRodadas()[this.rodada].getJogada2() == JogadaEnum.PEDRA) {

            return jogo.getJogador1();

        }

        if (jogo.getRodadas()[this.rodada].getJogada2() == JogadaEnum.PEDRA && jogo.getRodadas()[this.rodada].getJogada1() == JogadaEnum.TESOURA) {

            return jogo.getJogador2();

        }

        if (jogo.getRodadas()[this.rodada].getJogada2() == JogadaEnum.TESOURA && jogo.getRodadas()[this.rodada].getJogada1() == JogadaEnum.PAPEL) {

            return jogo.getJogador2();

        }

        if (jogo.getRodadas()[this.rodada].getJogada2() == JogadaEnum.PAPEL && jogo.getRodadas()[this.rodada].getJogada1() == JogadaEnum.PEDRA) {

            return jogo.getJogador2();

        }
        System.out.println("Returned null");
        return null;
    }

}
