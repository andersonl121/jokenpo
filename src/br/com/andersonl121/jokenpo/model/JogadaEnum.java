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
public enum JogadaEnum {
    
    PEDRA(0),PAPEL(1),TESOURA(2);
    
    private final int valor;
    private Jogador jogador;
    
    JogadaEnum(int valor){
       this.valor = valor;
    }
    
    public int getValor(){
        return this.valor;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
       
}
