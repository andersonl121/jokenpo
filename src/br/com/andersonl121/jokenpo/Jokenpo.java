/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andersonl121.jokenpo;

import br.com.andersonl121.jokenpo.controller.CalcularGanhadorJogo;
import br.com.andersonl121.jokenpo.controller.CalcularGanhadorRodada;
import br.com.andersonl121.jokenpo.model.JogadaEnum;
import br.com.andersonl121.jokenpo.model.Jogador;
import br.com.andersonl121.jokenpo.model.Jogo;

/**
 *
 * @author Anderson
 */
public class Jokenpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jogo jogo = new Jogo(new Jogador("Nome"),new Jogador("Computador"));
        
        //Faz a jogada por rodadas
        for(int i = 0; i<10;i++){
            jogo.getRodadas()[i].setJogada1(JogadaEnum.PEDRA);
            jogo.getRodadas()[i].setJogada2(JogadaEnum.PEDRA);
            
            //Calcula ganhador da rodada
            jogo.getRodadas()[i].setGanhadorRodada(new CalcularGanhadorRodada(jogo,i).calculaGanhador());
            System.out.println("Ganhador da Rodada: "+jogo.getRodadas()[i].getGanhadorRodada().getNome());
        }
        
        //Calcula ganhador do jogo
        Jogador vencedor = new CalcularGanhadorJogo(jogo).calculaGanhador();
        
        
        
    }
    
}
