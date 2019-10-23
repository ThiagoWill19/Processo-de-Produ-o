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
import models.Funcionario;
import models.enums.Funcao;

/**
 *
 * @author thiago
 */
public class FuncionarioDAO {

    PreparedStatement stmt = null;
    ResultSet rs = null;
    Connection conn = null;

    private final String LIST = "SELECT * FROM funcionario";
    private final String LISTBYID = "SELECT * FROM funcionario WHERE id = ?";
    private final String LISTBYNAME = "SELECT * FROM funcionario WHERE nome = ?";

    public List<Funcionario> findAll() throws Exception {

        List<Funcionario> list = new ArrayList<>();

        conn = ModuloConexao.connector();

        if (conn != null) {

            try {

                stmt = conn.prepareStatement(LIST);
                rs = stmt.executeQuery();
                while (rs.next()) {

                    Funcionario f = new Funcionario();

                    f.setId(rs.getInt(1));
                    f.setNome(rs.getString(2));
                    f.setFuncao(Funcao.valueOf(rs.getString(3).toUpperCase()));

                    list.add(f);
                }

                return list;

            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }

        } else {
            return null;
        }

    }

    public Funcionario findById(int id) throws Exception {

        Funcionario funcionario = new Funcionario();

        conn = ModuloConexao.connector();

        if (conn != null) {
            try {
                stmt = conn.prepareStatement(LISTBYID);
                stmt.setString(1, id + "");
                rs = stmt.executeQuery();

                while (rs.next()) {
                    funcionario.setId(rs.getInt(1));
                    funcionario.setNome(rs.getString(2));
                    funcionario.setFuncao(Funcao.valueOf(rs.getString(3).toUpperCase()));
                }

                return funcionario;

            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        } else {
            return null;
        }
        
    }    

    public Funcionario findByName(String nome) throws Exception {

        Funcionario funcionario = new Funcionario();

        conn = ModuloConexao.connector();

        if (conn != null) {
            try {
                stmt = conn.prepareStatement(LISTBYNAME);
                stmt.setString(1, nome);
                rs = stmt.executeQuery();

                while (rs.next()) {
                    funcionario.setId(rs.getInt(1));
                    funcionario.setNome(rs.getString(2));
                    funcionario.setFuncao(Funcao.valueOf(rs.getString(3).toUpperCase()));
                }

                return funcionario;

            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        } else {
            return null;
        }
    }

}


