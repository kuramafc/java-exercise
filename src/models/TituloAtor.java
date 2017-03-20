/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author brunogiammella
 */
public class TituloAtor {
    private List<Titulo> titulo;
    private List<Ator> ator;

    public List<Titulo> getTitulo() {
        return titulo;
    }

    public void setTitulo(List<Titulo> titulo) {
        this.titulo = titulo;
    }

    public List<Ator> getAtor() {
        return ator;
    }

    public void setAtor(List<Ator> ator) {
        this.ator = ator;
    }
}
