/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import app.dao.FuncionarioDAO;
import java.util.ArrayList;
import java.util.List;
import models.Funcionario;

/**
 *
 * @author thiago
 */
public class FuncionarioService {
    
    private FuncionarioDAO funcionarioDao = new FuncionarioDAO();
    
    
    
    public List<Funcionario> findAll(){
        
        List<Funcionario> list =  new ArrayList<>();
        
        try{
            
            list = funcionarioDao.findAll();
            
            return list;
        
        }catch(Exception e){
            
            System.out.println("Erro ao buscar a lista de Funcionários:  ERRO: " + e.getMessage());
            
        }
        
        return null;
    }
    
    
    
    public Funcionario findById(int id){
        
        Funcionario f =  new Funcionario();
        f = null;
        try {
            f = funcionarioDao.findById(id);
            return f;
            
        } catch (Exception e) {
            
            System.out.println("Erro ao buscar Funcionario n°"+ id+"  ERRO: ");
        }
        
        return f;
        
    }
    
    
    
    public Funcionario findByName(String name){
        
        Funcionario f = new Funcionario();
        
        try {
            f = funcionarioDao.findByName(name);
            return f;
        } catch (Exception e) {
            System.out.println("Erro ao buscar Funcionario: "+ name +"  ERRO: "+e.getMessage());
        }
        return null;
    }
    
    
    
}
