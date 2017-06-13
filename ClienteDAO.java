
package com.unipe.seguradora.persistencia;

import com.unipe.seguradora.modelo.Cliente;
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
public class ClienteDAO {
    
        Connection con;
    
    public ClienteDAO() {
        
        con = ConectaBD.getConnection();
        
    }
    
    public void create(Cliente p) {

        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (matricula,nome,identidade,cpf,estado_civil,sexo,situacao,data_nascimento,data_matricula,profissao,email,telefone,endereco,bairro,cidade,estado,cep,text)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, p.getMatricula());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getIdentidade());
            stmt.setString(4, p.getCpf());
            stmt.setString(5, p.getEstado_civil());
            stmt.setString(6, p.getSexo());
            stmt.setString(7, p.getSituacao());
            stmt.setString(8, p.getData_nascimento());
            stmt.setString(9, p.getData_matricula());
            stmt.setString(10, p.getProfissao());
            stmt.setString(11, p.getEmail());
            stmt.setString(12, p.getTelefone());
            stmt.setString(13, p.getEndereco());
            stmt.setString(14, p.getBairro());
            stmt.setString(15, p.getCidade());
            stmt.setString(16, p.getEstado());
            stmt.setString(17, p.getCep());
            stmt.setString(18, p.getText());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConectaBD.closeConnection(con, stmt);
        }

    }

    public List<Cliente> read() {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> Clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();

                cliente.setId(rs.getInt("id"));
                cliente.setMatricula(rs.getString("matricula"));
                cliente.setNome(rs.getString("nome"));
                cliente.setIdentidade(rs.getString("identidade"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEstado_civil(rs.getString("estado_civil"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setSituacao(rs.getString("situacao"));
                cliente.setData_nascimento(rs.getString("data_nascimento"));
                cliente.setData_matricula(rs.getString("data_matricula"));
                cliente.setProfissao(rs.getString("profissao"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setCep(rs.getString("cep"));
                cliente.setText(rs.getString("text"));
                //----------------------------------------
                Clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConectaBD.closeConnection(con, stmt, rs);
        }

        return Clientes;

    }
    public List<Cliente> readForDesc(String desc) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> Clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE id = ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();

                cliente.setId(rs.getInt("id"));
                cliente.setMatricula(rs.getString("matricula"));
                cliente.setNome(rs.getString("nome"));
                cliente.setIdentidade(rs.getString("identidade"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEstado_civil(rs.getString("estado_civil"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setSituacao(rs.getString("situacao"));
                cliente.setData_nascimento(rs.getString("data_nascimento"));
                cliente.setData_matricula(rs.getString("data_matricula"));
                cliente.setProfissao(rs.getString("profissao"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setCep(rs.getString("cep"));
                cliente.setText(rs.getString("text"));
                //----------------------------------------
                Clientes.add(cliente);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConectaBD.closeConnection(con, stmt, rs);
        }

        return Clientes;

    }

    public void update(Cliente p) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET matricula = ? ,nome = ?,identidade = ? WHERE id = ?");
            stmt.setInt(0, p.getId());
            stmt.setString(1, p.getMatricula());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getIdentidade());
            stmt.setString(4, p.getCpf());
            stmt.setString(5, p.getEstado_civil());
            stmt.setString(6, p.getSexo());
            stmt.setString(7, p.getSituacao());
            stmt.setString(8, p.getData_nascimento());
            stmt.setString(9, p.getData_matricula());
            stmt.setString(10, p.getProfissao());
            stmt.setString(11, p.getEmail());
            stmt.setString(12, p.getTelefone());
            stmt.setString(13, p.getEndereco());
            stmt.setString(14, p.getBairro());
            stmt.setString(15, p.getCidade());
            stmt.setString(16, p.getEstado());
            stmt.setString(17, p.getCep());
            stmt.setString(18, p.getText());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConectaBD.closeConnection(con, stmt);
        }

    }
    public void delete(Cliente p) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE id = ?");
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
