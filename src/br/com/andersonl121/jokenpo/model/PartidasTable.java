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
public class PartidasTable {
    
    private int id;
    private String nomeJogador1;
    private String nomeJogador2;
    private int ptsJogador1;
    private int ptsJogador2;

    public PartidasTable(String nomeJogador1, String nomeJogador2, int ptsJogador1, int ptsJogador2) {
        this.nomeJogador1 = nomeJogador1;
        this.nomeJogador2 = nomeJogador2;
        this.ptsJogador1 = ptsJogador1;
        this.ptsJogador2 = ptsJogador2;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeJogador1() {
        return nomeJogador1;
    }

    public void setNomeJogador1(String nomeJogador1) {
        this.nomeJogador1 = nomeJogador1;
    }

    public String getNomeJogador2() {
        return nomeJogador2;
    }

    public void setNomeJogador2(String nomeJogador2) {
        this.nomeJogador2 = nomeJogador2;
    }

    public int getPtsJogador1() {
        return ptsJogador1;
    }

    public void setPtsJogador1(int ptsJogador1) {
        this.ptsJogador1 = ptsJogador1;
    }

    public int getPtsJogador2() {
        return ptsJogador2;
    }

    public void setPtsJogador2(int ptsJogador2) {
        this.ptsJogador2 = ptsJogador2;
    }
    
    
    
}
