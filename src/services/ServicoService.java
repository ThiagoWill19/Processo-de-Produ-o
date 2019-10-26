/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import app.dao.ServicoDAO;
import java.util.ArrayList;
import java.util.List;
import models.Servico;

/**
 *
 * @author thiago
 */
public class ServicoService {

    private ServicoDAO servicoDao = new ServicoDAO();
    
    public List<Servico> findById( int id){
        
        List<Servico> list =  new ArrayList<>();
        try{
            list = servicoDao.findById(id);
            return list;
            
        }catch(Exception e){
            System.out.println("Erro ao buscar lista de servicos ID: "+ id+ "ERRO: "+e.getMessage());
        }
        return null;
    }
    
    
    
}
