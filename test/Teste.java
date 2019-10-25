
import app.dao.FuncionarioDAO;
import app.dao.FuncionarioRelacionadoDAO;
import app.dao.OrdemServicoDAO;
import app.dao.ServicoDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.FuncionarioRelacionado;
import models.OrdemServico;
import models.Servico;

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
    public static void main(String[] args)  {

        OrdemServico os =  new OrdemServico();
        List<FuncionarioRelacionado> list = new ArrayList<>();
        FuncionarioRelacionadoDAO dao =  new FuncionarioRelacionadoDAO();

        try {
            list =  dao.findById(1);
        } catch (Exception ex) {
            ex.getMessage();
        }
        
        System.out.println(list);
        
        

    }

}
