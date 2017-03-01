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
public class TituloNacionalidade {
    private Titulo titulo_id;
    private Pais pais_id;

    public Titulo getTitulo_id() {
        return titulo_id;
    }

    public void setTitulo_id(Titulo titulo_id) {
        this.titulo_id = titulo_id;
    }

    public Pais getPais_id() {
        return pais_id;
    }

    public void setPais_id(Pais pais_id) {
        this.pais_id = pais_id;
    }
}
