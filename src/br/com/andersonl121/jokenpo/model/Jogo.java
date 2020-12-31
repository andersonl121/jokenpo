/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andersonl121.jokenpo.model;

import br.com.andersonl121.jokenpo.controller.PartidasDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.andersonl121.jokenpo.utils.ConnectionFactory;

/**
 *
 * @author Anderson
 */
public class Jogo {

    private static Jogador jogador1;
    private static Jogador jogador2;
    private static int ptsJogador1;
    private static int ptsJogador2;
    private static List<Rodada> rodadas = new ArrayList();

    private static PartidasTable PartidasTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Jogo(Jogador jogador1, Jogador jogador2) {
        Jogo.jogador1 = jogador1;
        Jogo.jogador2 = jogador2;

    }

    public static Jogador getJogador1() {
        return jogador1;
    }

    public static void setJogador1(Jogador jogador1) {
        Jogo.jogador1 = jogador1;
    }

    public static Jogador getJogador2() {
        return jogador2;
    }

    public static void setJogador2(Jogador jogador2) {
        Jogo.jogador2 = jogador2;
    }

    public static int getPtsJogador1() {
        return ptsJogador1;
    }

    public static void setPtsJogador1(int ptsJogador1) {
        Jogo.ptsJogador1 = ptsJogador1;
    }

    public static int getPtsJogador2() {
        return ptsJogador2;
    }

    public static void setPtsJogador2(int ptsJogador2) {
        Jogo.ptsJogador2 = ptsJogador2;
    }

    public static List<Rodada> getRodadas() {
        return rodadas;
    }

    public static void setRodadas(List<Rodada> rodadas) {
        Jogo.rodadas = rodadas;
    }

    public int getPontosJogador(Jogador jogador) {
        int pontos = 0;
        for (Rodada rodada : rodadas) {
            if (rodada != null) {
                if (jogador.equals(rodada.getGanhadorRodada())) {
                    pontos = pontos + 1;
                }
            }

        }
        return pontos;
    }

    public static void novoJogo() {
        Jogo.rodadas = new ArrayList();
        Jogo.jogador1 = new Jogador("");
        Jogo.jogador2 = new Jogador("");
        Jogo.ptsJogador1 = 0;
        Jogo.ptsJogador2 = 0;
    }

    public static boolean salvarJogo() {
        PartidasTable pt = new PartidasTable(Jogo.getJogador1().getNome(), Jogo.getJogador2().getNome(), Jogo.getPtsJogador1(), Jogo.getPtsJogador2());
        boolean status = false;
        try {
            PartidasDAO dao = new PartidasDAO(new ConnectionFactory().getConnection());

            status = dao.insertPartidas(pt);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao salvar dados da partida:\n "+ex);
        }

        return status;
    }

}
