/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.RegistroProducao;

/**
 *
 * @author thiago
 */
public class RegistroProducaoDAO {

    PreparedStatement stmt = null;
    ResultSet rs = null;
    Connection conn = null;
    
    private final String INSERT = "INSERT INTO funcionario_ordemservico VALUES (null, ?, ?, ?, ?)";
    private final String UPDATE = "UPDATE funcionario_ordemservico SET data_termino = ? WHERE id_fun = ? AND id_ordem = ?";
    
    public boolean insert(RegistroProducao rp){
        
        conn= ModuloConexao.connector();
        
        if(conn != null){
            
            try {
                
                stmt =  conn.prepareStatement(INSERT);
                stmt.setDate(1, (Date) rp.getInicio());
                stmt.setDate(2,(Date) rp.getTermino());
                stmt.setInt(3, rp.getIdF());
                stmt.setInt(4, rp.getIdOS());
                
                stmt.execute();
                return true;
                
            } catch (Exception e) {
                System.out.println("Erro ao inserir registro: "+ e.getMessage());
                
            }
            
        }
        
        return false;
        
    }
    
    public boolean update(int idFun, int idOrdem, Date datatermino){
        
        conn =  ModuloConexao.connector();
        
        if(conn != null){
            
            try {
                
                stmt = conn.prepareStatement(UPDATE);
                stmt.setDate(1, datatermino);
                stmt.setInt(2, idFun);
                stmt.setInt(3, idOrdem);
                
                stmt.execute();
                return true;
                
            } catch (Exception e) {
                System.out.println("Erro ao atualizar registro! ERRO: "+e.getMessage());
            }
            
        }
        
        return false;
        
    }

}
