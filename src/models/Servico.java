/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author thiago
 */
public class Servico {
    
    private Integer idOs;
    private String empresa;
    private Date dataInicio;
    private Date dataTermino;
   
    public Servico(){
        
    }

    public Integer getIdOs() {
        return idOs;
    }

    public void setIdOs(Integer idOs) {
        this.idOs = idOs;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }
    
    
}
