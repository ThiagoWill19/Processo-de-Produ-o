/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.FuncionarioRelacionado;

/**
 *
 * @author thiago
 */
public class FuncionarioRelacionadoDAO {
    
    Connection conn =  null;
    PreparedStatement stmt =  null;
    ResultSet rs =  null;
    
    private String LIST =  "SELECT fo.id_fun, funcionario.nome, fo.data_inicio, fo.data_Termino FROM funcionario_ordemServico fo"
            + " INNER JOIN funcionario ON funcionario.id = fo.id_fun where id_ordem = ?";
    
    
    public List<FuncionarioRelacionado> findById(int id) throws Exception{
        
        List<FuncionarioRelacionado> list = new ArrayList<>();
        conn =  ModuloConexao.connector();
        
        if(conn != null){
            try {
                stmt = conn.prepareStatement(LIST);
                stmt.setInt(1, id);
                rs= stmt.executeQuery();
                
                while(rs.next()){
                    
                    FuncionarioRelacionado r =  new FuncionarioRelacionado();
                    
                    r.setIdFun(rs.getInt(1));
                    r.setNome(rs.getString(2));
                    r.setInicio(rs.getDate(3));
                    r.setTermino(rs.getDate(4));

                    list.add(r);
                }
                
                return list;
                
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
            
            
            
        }else return null;
        
    }
    
}
