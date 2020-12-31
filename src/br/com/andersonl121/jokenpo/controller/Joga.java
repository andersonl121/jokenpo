package br.com.andersonl121.jokenpo.controller;

import br.com.andersonl121.jokenpo.model.JogadaEnum;
import br.com.andersonl121.jokenpo.model.Jogador;
import br.com.andersonl121.jokenpo.model.Jogo;
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
public final class Joga {

    private static JogadaEnum jogada;
    private static Jogador jogador;
    
    

    public Joga(JogadaEnum jogada, Jogador jogador) {
        Joga.jogada = jogada;
        Joga.jogador = jogador;
    }

    public Joga(Jogador jogador) {
        Joga.jogador = jogador;
        Joga.jogada = gerarJogadaAleatoria();
    }
    
    public void Jogar(){
        Jogo.getRodadas().get(Jogo.getRodadas().size()-1);
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
