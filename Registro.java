/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipe.seguradora.modelo;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import com.unipe.seguradora.persistencia.RegistroDAO;

/**
 *
 * @author Brauner
 */
public class Registro {
    
    private int id;
    private String cliente_id;
    private String veiculo_id;
    private String seguro_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getVeiculo_id() {
        return veiculo_id;
    }

    public void setVeiculo_id(String veiculo_id) {
        this.veiculo_id = veiculo_id;
    }

    public String getSeguro_id() {
        return seguro_id;
    }

    public void setSeguro_id(String seguro_id) {
        this.seguro_id = seguro_id;
    }

    public Object setCliente_id(RegistroDAO dao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCliente_id(Type String) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
