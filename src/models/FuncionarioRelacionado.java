/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author thiago
 */
public class FuncionarioRelacionado {


    private int idFun;
    private String nome;
    private Data inicio;
    private Data termino;
    
    public FuncionarioRelacionado(){
        
    }

    public int getIdFun() {
        return idFun;
    }

    public void setIdFun(int idFun) {
        this.idFun = idFun;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getInicio() {
        return inicio;
    }

    public void setInicio(Data inicio) {
        this.inicio = inicio;
    }

    public Data getTermino() {
        return termino;
    }

    public void setTermino(Data termino) {
        this.termino = termino;
    }
    
    
    
}
