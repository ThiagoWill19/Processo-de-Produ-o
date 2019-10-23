/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;
import models.enums.Funcao;

/**
 *
 * @author thiago
 */
public class Funcionario {

    private Integer id;
    private String nome;
    private Funcao funcao;
    private List<Servico> servicos =  new ArrayList<>();
    
}
