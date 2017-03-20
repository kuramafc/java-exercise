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
public class Fita {
    private Titulo titulo;
    private int serie;
    private String estado;
    private String dataAquisicao;

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
}
