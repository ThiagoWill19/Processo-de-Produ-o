/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import app.dao.FuncionarioRelacionadoDAO;
import java.util.ArrayList;
import java.util.List;
import models.FuncionarioRelacionado;
import models.Servico;

/**
 *
 * @author thiago
 */
public class FuncionarioRelacionadoService {
    
    private FuncionarioRelacionadoDAO frd =  new FuncionarioRelacionadoDAO();
    
    
    
        public List<FuncionarioRelacionado> findById( int id){
        
        List<FuncionarioRelacionado> list =  new ArrayList<>();
        try{
            list = frd.findById(id);
            return list;
            
        }catch(Exception e){
            System.out.println("Erro ao buscar lista de FuncionariosRelacionados a O.S ID: "+ id+ " ERRO: "+e.getMessage());
        }
        return null;
    }
    
}
