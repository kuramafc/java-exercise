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
public class Titulo {
    private Classe classe_id;
    private Categoria categoria_id;
    private Distribuidor distribuidor_id;
    private String nome;
    private String nome_original;
    private String sinopse;
    private int ano;

    public Classe getClasse_id() {
        return classe_id;
    }

    public void setClasse_id(Classe classe_id) {
        this.classe_id = classe_id;
    }

    public Categoria getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Categoria categoria_id) {
        this.categoria_id = categoria_id;
    }

    public Distribuidor getDistribuidor_id() {
        return distribuidor_id;
    }

    public void setDistribuidor_id(Distribuidor distribuidor_id) {
        this.distribuidor_id = distribuidor_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_original() {
        return nome_original;
    }

    public void setNome_original(String nome_original) {
        this.nome_original = nome_original;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
