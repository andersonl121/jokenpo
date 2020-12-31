package br.com.andersonl121.jokenpo.controller;

import br.com.andersonl121.jokenpo.model.JogadaEnum;
import br.com.andersonl121.jokenpo.model.Jogador;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anderson
 */
public final class Jogar {

    final private JogadaEnum jogada;
    final private Jogador jogador;

    public Jogar(JogadaEnum jogada, Jogador jogador) {
        this.jogada = jogada;
        this.jogador = jogador;
    }

    public Jogar(Jogador jogador) {
        this.jogador = jogador;
        this.jogada = gerarJogadaAleatoria();
    }

    public JogadaEnum gerarJogadaAleatoria() {
        Random random = new Random();

        int jogadaComputador = random.nextInt(3) + 1;

        switch (jogadaComputador) {
            case 1:
                System.out.println("Computador Jogou Pedra");
                return JogadaEnum.PEDRA;
            case 2:
                System.out.println("Computador Jogou Papel");
                return JogadaEnum.PAPEL;
            case 3:
                System.out.println("Computador Jogou Tesoura");
                return JogadaEnum.TESOURA;
        }
        return null;
    }

}
