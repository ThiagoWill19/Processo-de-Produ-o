
import app.dao.FuncionarioDAO;
import java.util.ArrayList;
import java.util.List;
import models.Funcionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thiago
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        List<Funcionario> list = new ArrayList<>();
        FuncionarioDAO f = new FuncionarioDAO();

        try {

            list = f.findAll();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(list);

    }

}
