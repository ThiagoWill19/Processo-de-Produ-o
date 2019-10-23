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
import models.OrdemServico;

/**
 *
 * @author thiago
 */
public class OrdemServicoDAO {

    PreparedStatement stmt = null;
    ResultSet rs = null;
    Connection conn = null;
    
    private final String LIST = "SELECT * FROM ordemservico";
    private final String LISTBYID = "SELECT * FROM ordemservico WHERE id = ?";
    private final String LISTBYNAME = "SELECT * FROM ordemservico WHERE empresa = ?";

    
    
    public List<OrdemServico> findAll() throws Exception {

        conn = ModuloConexao.connector();
        
        List<OrdemServico> list = new ArrayList<>();
        
        if(conn != null){
            
            try {
                
                stmt = conn.prepareStatement(LIST);
                rs = stmt.executeQuery();
                while(rs.next()){
                    
                    OrdemServico os = new OrdemServico();
                    
                    os.setId(rs.getInt(1));
                    os.setEmpresa(rs.getString(2));
                    os.setCliente(rs.getString(3));
                    os.setProcesso(rs.getString(4));
                    os.setIdUltimoAcesso(rs.getInt(5));
                    
                    list.add(os);
                }
                
                return list;
                
            } catch (Exception e) {
                
                throw new Exception(e.getMessage());
            }
            
        }else return null;
        
    }
    
    
    public OrdemServico findById(int id) throws Exception{
        
        OrdemServico os =  new OrdemServico();
        conn = ModuloConexao.connector();
        
        if(conn != null){
            
            try {
                
                stmt =  conn.prepareStatement(LISTBYID);
                stmt.setInt(1, id);
                rs =  stmt.executeQuery();
                while(rs.next()){
                                     
                    os.setId(rs.getInt(1));
                    os.setEmpresa(rs.getString(2));
                    os.setCliente(rs.getString(3));
                    os.setProcesso(rs.getString(4));
                    os.setIdUltimoAcesso(rs.getInt(5));
                    
                }
                
                return os;
                
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
            
        }else return null;
        
    }

     public OrdemServico findByIName(String name) throws Exception{
        
        OrdemServico os =  new OrdemServico();
        conn = ModuloConexao.connector();
        
        if(conn != null){
            
            try {
                
                stmt =  conn.prepareStatement(LISTBYNAME);
                stmt.setString(1, name);
                rs =  stmt.executeQuery();
                while(rs.next()){
                                     
                    os.setId(rs.getInt(1));
                    os.setEmpresa(rs.getString(2));
                    os.setCliente(rs.getString(3));
                    os.setProcesso(rs.getString(4));
                    os.setIdUltimoAcesso(rs.getInt(5));
                    
                }
                
                return os;
                
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
            
        }else return null;
        
    }
    
}
