/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.math.BigInteger;

/**
 *
 * @author brunogiammella
 */
public class Cidade {
    private BigInteger estado_id;
    private String nome;

    public BigInteger getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(BigInteger estado_id) {
        this.estado_id = estado_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
