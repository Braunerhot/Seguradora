
package com.unipe.seguradora.persistencia;

import com.unipe.seguradora.modelo.Seguro;
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
public class SeguroDAO {
    
    Connection con;
    
    public SeguroDAO() {
        
        con = ConectaBD.getConnection();
        
    }
    
    public void create(Seguro p) {

        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO seguro (descricao,valor,vigencia)VALUES(?,?,?)");
            stmt.setString(1, p.getDescricao());
            stmt.setString(2, p.getValor());
            stmt.setString(3, p.getVigencia());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso !");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConectaBD.closeConnection(con, stmt);
        }

    }

    public List<Seguro> read() {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Seguro> Seguro = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM seguro");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Seguro Seguros = new Seguro();

                Seguros.setId(rs.getInt("id"));
                Seguros.setDescricao(rs.getString("descricao"));
                Seguros.setValor(rs.getString("valor"));
                Seguros.setVigencia(rs.getString("vigencia"));
                Seguro.add(Seguros);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConectaBD.closeConnection(con, stmt, rs);
        }

        return Seguro;

    }
    public List<Seguro> readForDesc(String desc) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Seguro> Seguro = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM seguro WHERE descricao LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Seguro Seguros = new Seguro();

                Seguros.setId(rs.getInt("id"));
                Seguros.setDescricao(rs.getString("descricao"));
                Seguros.setValor(rs.getString("valor"));
                Seguros.setVigencia(rs.getString("vigencia"));
                Seguro.add(Seguros);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConectaBD.closeConnection(con, stmt, rs);
        }

        return Seguro;

    }

    public void update(Seguro p) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE seguro SET descricao = ? ,valor = ?,vigencia = ? WHERE id = ?");
            stmt.setInt(0, p.getId());
            stmt.setString(1, p.getDescricao());
            stmt.setString(2, p.getValor());
            stmt.setString(3, p.getVigencia());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConectaBD.closeConnection(con, stmt);
        }

    }
    public void delete(Seguro p) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM seguro WHERE id = ?");
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
