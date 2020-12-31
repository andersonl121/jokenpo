/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andersonl121.jokenpo.controller;

import br.com.andersonl121.jokenpo.model.JogadaEnum;
import br.com.andersonl121.jokenpo.model.Jogador;
import br.com.andersonl121.jokenpo.model.Rodada;

/**
 *
 * @author Anderson
 */
public class CalcularGanhadorRodada {

    Rodada rodada;

    public Rodada getRodada() {
        return rodada;
    }

    public void setRodada(Rodada rodada) {
        this.rodada = rodada;
    }

    public CalcularGanhadorRodada(Rodada rodada) {
        this.rodada = rodada;
    }

    public Jogador calculaGanhador() {
        if (rodada.getJogada1() == JogadaEnum.PEDRA && rodada.getJogada2() == JogadaEnum.TESOURA) {

            return rodada.getJogada1().getJogador();

        }

        if (rodada.getJogada1() == JogadaEnum.TESOURA && rodada.getJogada2() == JogadaEnum.PAPEL) {

            return rodada.getJogada1().getJogador();

        }

        if (rodada.getJogada1() == JogadaEnum.PAPEL && rodada.getJogada2() == JogadaEnum.PEDRA) {

            return rodada.getJogada1().getJogador();

        }

        if (rodada.getJogada2() == JogadaEnum.PEDRA && rodada.getJogada1() == JogadaEnum.TESOURA) {

            return rodada.getJogada2().getJogador();

        }

        if (rodada.getJogada2() == JogadaEnum.TESOURA && rodada.getJogada1() == JogadaEnum.PAPEL) {

            return rodada.getJogada2().getJogador();

        }

        if (rodada.getJogada2() == JogadaEnum.PAPEL && rodada.getJogada1() == JogadaEnum.PEDRA) {

            return rodada.getJogada2().getJogador();

        }

        return null;
    }

}
