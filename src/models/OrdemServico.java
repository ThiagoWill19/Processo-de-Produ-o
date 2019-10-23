/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiago
 */
public class OrdemServico {
   
    private Integer id;
    private String empresa;
    private String cliente;
    private String processo;
    private boolean status;
    private Integer idUltimoAcesso;
    private List<FuncionarioRelacionado> fr = new ArrayList<>();
    
}
