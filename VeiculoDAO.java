
package com.unipe.seguradora.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.unipe.seguradora.modelo.Veiculo;


public class VeiculoDAO {

    Connection con;
    
    public VeiculoDAO() {
        con = ConectaBD.getConnection();
    }
    
    public void create(Veiculo p) {

        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO veiculo (placa,modelo,chassi,ano,fabricante)VALUES(?,?,?,?,?)");
            stmt.setString(1, p.getPlaca());
            stmt.setString(2, p.getModelo());
            stmt.setString(3, p.getChassi());
            
            stmt.setString(4, p.getAno());
            stmt.setString(5, p.getFabricante());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConectaBD.closeConnection(con, stmt);
        }

    }

    public List<Veiculo> read() {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Veiculo> veiculos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Veiculo veiculo = new Veiculo();

                veiculo.setId(rs.getInt("id"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setChassi(rs.getString("chassi"));
                veiculo.setAno(rs.getString("ano"));
                veiculo.setFabricante(rs.getString("fabricante"));
                veiculos.add(veiculo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConectaBD.closeConnection(con, stmt, rs);
        }

        return veiculos;

    }
    
    public List<Veiculo> readForDesc(String desc) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Veiculo> veiculos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo WHERE placa LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Veiculo veiculo = new Veiculo();

                veiculo.setId(rs.getInt("id"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setChassi(rs.getString("chassi"));
                veiculo.setChassi(rs.getString("ano"));
                veiculo.setChassi(rs.getString("fabricante"));
                veiculos.add(veiculo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConectaBD.closeConnection(con, stmt, rs);
        }

        return veiculos;

    }

    public void update(Veiculo p) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE veiculo SET placa = ? ,modelo = ?,chassi = ? WHERE id = ?");
            stmt.setInt(0, p.getId());
            stmt.setString(1, p.getPlaca());
            stmt.setString(2, p.getModelo());
            stmt.setString(3, p.getChassi());
            stmt.setString(4, p.getAno());
            stmt.setString(5, p.getFabricante());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConectaBD.closeConnection(con, stmt);
        }

    }
    public void delete(Veiculo p) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM veiculo WHERE id = ?");
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
