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
public class TituloAtor {
    private Titulo titulo_id;
    private Ator ator_id;

    public Titulo getTitulo_id() {
        return titulo_id;
    }

    public void setTitulo_id(Titulo titulo_id) {
        this.titulo_id = titulo_id;
    }

    public Ator getAtor_id() {
        return ator_id;
    }

    public void setAtor_id(Ator ator_id) {
        this.ator_id = ator_id;
    }
}
