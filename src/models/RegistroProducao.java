/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;

/**
 *
 * @author thiago
 */
public class RegistroProducao {
    
    private Integer idF;
    private Integer idOS;
    private Date inicio;
    private Date termino;
    
    public RegistroProducao(){
        
        
    }

    public Integer getIdF() {
        return idF;
    }

    public void setIdF(Integer idF) {
        this.idF = idF;
    }

    public Integer getIdOS() {
        return idOS;
    }

    public void setIdOS(Integer idOS) {
        this.idOS = idOS;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getTermino() {
        return termino;
    }

    public void setTermino(Date termino) {
        this.termino = termino;
    }
    
    
    
}
