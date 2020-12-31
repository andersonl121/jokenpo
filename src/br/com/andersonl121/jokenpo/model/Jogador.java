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
public class Jogador {
    
    private String nome;
    
    public Jogador(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public boolean equals(Object o){
        if (o == null) {
            return false;
        }

        if (o.getClass() != this.getClass()) {
            return false;
        }
        
        final Jogador j =   (Jogador) o;
        
        if(!this.nome.equals(j.nome)){
            return false;
        }
        System.out.println("Its Equals");
        return true;
    }
    
    
    
}
