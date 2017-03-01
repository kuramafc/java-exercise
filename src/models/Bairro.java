/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author brunogiammella
 */
public class Bairro {
    private Cidade cidade_id;
    private String nome;

    public Cidade getCidade_id() {
        return cidade_id;
    }

    public void setCidade_id(Cidade cidade_id) {
        this.cidade_id = cidade_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
