/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipe.seguradora.modelo;

/**
 *
 * @author Brauner
 */
public class Seguro {
    
    private int id;
    private String valor;
    private String descricao;
    private String vigencia;

    public Seguro() {
        
    }

    public Seguro(String descricao, String valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
    
    
    
}
