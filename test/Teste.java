
import app.dao.FuncionarioDAO;
import app.dao.OrdemServicoDAO;
import java.util.ArrayList;
import java.util.List;
import models.Funcionario;
import models.OrdemServico;

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

        OrdemServico os =  new OrdemServico();
        List<OrdemServico> list = new ArrayList<>();
        OrdemServicoDAO dao = new OrdemServicoDAO();

        try {

            os =  dao.findByName("Itapevi");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(os.getId());
        System.out.println(os.getEmpresa());
        System.out.println(os.getCliente());
        System.out.println(os.getProcesso());
        System.out.println(os.getIdUltimoAcesso());
        

    }

}
