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
public class TituloNacionalidade {
    private List<Titulo> titulo;
    private List<Pais> pais;

    public List<Titulo> getTitulo() {
        return titulo;
    }

    public void setTitulo(List<Titulo> titulo) {
        this.titulo = titulo;
    }

    public List<Pais> getPais() {
        return pais;
    }

    public void setPais(List<Pais> pais) {
        this.pais = pais;
    }
}
