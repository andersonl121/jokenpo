/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andersonl121.jokenpo.controller;

import br.com.andersonl121.jokenpo.model.PartidasTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Anderson
 */
public class PartidasDAO {

    Connection conn;

    public PartidasDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean insertPartidas(PartidasTable pt) throws SQLException {

        String sql = "INSERT INTO partidas (nomeJogador1,nomeJogador2,ptsJogador1,ptsJogador2) values (?,?,?,?)";
        boolean status = false;
        
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, pt.getNomeJogador1());
            pst.setString(2, pt.getNomeJogador2());
            pst.setInt(3, pt.getPtsJogador1());
            pst.setInt(4, pt.getPtsJogador2());

            pst.execute();

            conn.close();
            status = true;
        
        return status;

    }

}
