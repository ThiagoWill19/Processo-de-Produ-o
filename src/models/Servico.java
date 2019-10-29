/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.text.SimpleDateFormat;
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
    private final SimpleDateFormat dataFormatada =  new SimpleDateFormat("dd-MM-yyyy HH:MM");
   
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

    public String getDataInicio() {
       
        return  dataFormatada.format(dataInicio);
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
               
        return  dataFormatada.format(dataTermino);
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    @Override
    public String toString() {
        return "Servico{" + "idOs=" + idOs + ", empresa=" + empresa + ", dataInicio=" + dataInicio + ", dataTermino=" + dataTermino + '}'+"\n";
    }
    
    
}
