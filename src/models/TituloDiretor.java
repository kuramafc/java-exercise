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
public class TituloDiretor {
    private Titulo titulo_id;
    private Diretor diretor_id;

    public Titulo getTitulo_id() {
        return titulo_id;
    }

    public void setTitulo_id(Titulo titulo_id) {
        this.titulo_id = titulo_id;
    }

    public Diretor getDiretor_id() {
        return diretor_id;
    }
    
    public void setDiretor_id(Diretor diretor_id) {
        this.diretor_id = diretor_id;
    }
}
