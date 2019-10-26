/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import app.dao.OrdemServicoDAO;
import java.util.ArrayList;
import java.util.List;
import models.OrdemServico;

/**
 *
 * @author thiago
 */
public class OrdemServicoService {
    
    private OrdemServicoDAO ordemServicoDao=  new OrdemServicoDAO();
    
    
    public List<OrdemServico> findAll(){
        
        List<OrdemServico> list =  new ArrayList<>();
        
        try{
            
            list = ordemServicoDao.findAll();
            
            return list;
        
        }catch(Exception e){
            
            System.out.println("Erro ao buscar a lista de O.S:  ERRO: " + e.getMessage());
            
        }
        
        return null;
    }
    
    
        public OrdemServico findById(int id){
        
        OrdemServico os =  new OrdemServico();
        
        try {
            os = ordemServicoDao.findById(id);
             return os;
        } catch (Exception e) {
            
            System.out.println("Erro ao buscar Funcionario n°"+ id+"  ERRO: "+e.getMessage());
        }
        
        return null;
        
    }
        
        
        
         
    public OrdemServico findByName(String name){
        
        OrdemServico os = new OrdemServico();
        
        try {
            os = ordemServicoDao.findByName(name);
            return os;
        } catch (Exception e) {
            System.out.println("Erro ao buscar O.S de: "+ name +"  ERRO: "+e.getMessage());
        }
        return null;
    }
    
    
    
}
