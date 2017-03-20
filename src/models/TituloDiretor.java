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
public class TituloDiretor {
    private List<Titulo> titulo;
    private List<Diretor> diretor;

    public List<Titulo> getTitulo() {
        return titulo;
    }

    public void setTitulo(List<Titulo> titulo) {
        this.titulo = titulo;
    }

    public List<Diretor> getDiretor() {
        return diretor;
    }

    public void setDiretor(List<Diretor> diretor) {
        this.diretor = diretor;
    }
}
