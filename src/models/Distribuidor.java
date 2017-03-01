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
public class Distribuidor {
    private Bairro bairro_id;
    private String razao_social;
    private int cnpj;
    private String pessoa_contato;
    private String rua;
    private String numero;
    private String complemento;
    private int cep;

    public Bairro getBairro_id() {
        return bairro_id;
    }

    public void setBairro_id(Bairro bairro_id) {
        this.bairro_id = bairro_id;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getPessoa_contato() {
        return pessoa_contato;
    }

    public void setPessoa_contato(String pessoa_contato) {
        this.pessoa_contato = pessoa_contato;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
