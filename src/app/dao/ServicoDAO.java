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


import models.Servico;

/**
 *
 * @author thiago
 */
public class ServicoDAO {
    
    private Connection conn =  null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    
    private final String LISTBYID = "SELECT fo.id_ordem, ordemservico.empresa, fo.data_inicio,fo.data_termino FROM funcionario_ordemServico fo"
            + " INNER JOIN ordemservico ON fo.id_ordem =  ordemservico.id WHERE id_fun = ?";
    
    public List<Servico> findById( int id) throws Exception{
        
        List<Servico> list =  new ArrayList<>();
        conn = ModuloConexao.connector();
        
        if(conn != null){
            
            try {
                stmt = conn.prepareStatement(LISTBYID);
                stmt.setInt(1, id);
                rs = stmt.executeQuery();
                while(rs.next()){
                    
                   Servico servico = new Servico();
                   servico.setIdOs(rs.getInt(1));
                   servico.setEmpresa(rs.getString(2));
                   servico.setDataInicio(rs.getDate(3));
                   servico.setDataTermino(rs.getDate(4));
                   
                   list.add(servico);
                }
                
                return list;
                
            } catch (Exception e) {
                throw new Exception(e.getMessage());
                
            }
            
        }else return null;
        
    }
    
}
