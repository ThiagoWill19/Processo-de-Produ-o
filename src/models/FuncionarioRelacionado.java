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
public class FuncionarioRelacionado {


    private int idFun;
    private String nome;
    private Date inicio;
    private Date termino;
    private SimpleDateFormat dateF =  new SimpleDateFormat("dd-MM-yyyy HH:MM");
    
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

    public String getInicio() {
        return dateF.format(inicio);
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public String getTermino() {
        return dateF.format(termino);
    }

    public void setTermino(Date termino) {
        this.termino = termino;
    }

    @Override
    public String toString() {
        return "ID: " + idFun + "   NOME: " + nome + "    INÍCIO: " + inicio + "    TÉRMINO: " + termino +"\n\n";
    }
    
    
    
}
