/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.enums;

/**
 *
 * @author thiago
 */
public enum Funcao {
    
    SERRADOR(1,"Serrador"),
    MONTADOR(2,"Montador"),
    EMBORRACHADOR(3,"Emborrachador"),
    MOTORISTA(4,"Motorista");
    
    int cod;
    String funcao;
    
    
    private Funcao(int cod, String funcao){
        this.cod =  cod;
        this.funcao = funcao;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
  
    
}
