/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipe.seguradora.persistencia;

import com.unipe.seguradora.modelo.Registro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Brauner
 */
public class RegistroDAO {
    
        Connection con;
    
    public RegistroDAO() {
        
        con = ConectaBD.getConnection();
        
    }
    
    public void create(Registro p) {

        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO registro (cliente_id,veiculo_id,Seguro_id)VALUES(?,?,?)");
            stmt.setString(1, p.getCliente_id());
            stmt.setString(2, p.getVeiculo_id());
            stmt.setString(3, p.getSeguro_id());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConectaBD.closeConnection(con, stmt);
        }

    }

    public List<Registro> read() {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Registro> Registro = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM registro");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Registro Registros = new Registro();

                Registros.setId(rs.getInt("id"));
                Registros.setCliente_id(rs.getString("cliente_id"));
                Registros.setVeiculo_id(rs.getString("veiculo_id"));
                Registros.setSeguro_id(rs.getString("seguro_id"));
                Registro.add(Registros);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConectaBD.closeConnection(con, stmt, rs);
        }

        return Registro;

    }
    public List<Registro> readForDesc(String desc) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Registro> Registro = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM registro WHERE cliente_id LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Registro Registros = new Registro();

                Registros.setId(rs.getInt("id"));
                Registros.setCliente_id(rs.getString("cliente_id"));
                Registros.setVeiculo_id(rs.getString("veiculo_id"));
                Registros.setSeguro_id(rs.getString("seguro_id"));
                Registro.add(Registros);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConectaBD.closeConnection(con, stmt, rs);
        }

        return Registro;

    }

    public void update(Registro p) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE registro SET cliente_id = ? ,veiculo_id = ?,seguro_id = ? WHERE id = ?");
            stmt.setInt(0, p.getId());
            stmt.setString(1, p.getCliente_id());
            stmt.setString(2, p.getVeiculo_id());
            stmt.setString(3, p.getSeguro_id());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConectaBD.closeConnection(con, stmt);
        }

    }
    public void delete(Registro p) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM registro WHERE id = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConectaBD.closeConnection(con, stmt);
        }

    }


    
    
}
