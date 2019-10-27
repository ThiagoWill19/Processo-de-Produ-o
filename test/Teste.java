

import app.dao.RegistroProducaoDAO;


import java.sql.Date;
import models.Funcionario;
import models.FuncionarioRelacionado;
import models.OrdemServico;


import models.RegistroProducao;
import services.FuncionarioRelacionadoService;
import services.FuncionarioService;
import services.OrdemServicoService;
import services.Registradora;
import services.ServicoService;



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
        
    
        Registradora r =  new Registradora();
        System.out.println(r.apertureChecker(2, 1));
        
       
       
        OrdemServico os =  new OrdemServico();
        OrdemServicoService oss = new OrdemServicoService();
        FuncionarioRelacionadoService frs = new FuncionarioRelacionadoService();
        os = oss.findById(1);
        os.setFr(frs.findById(os.getId()));
        System.out.println(os.getFr());
        
      
        
    }

}
