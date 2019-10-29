
import app.dao.RegistroProducaoDAO;

import java.sql.Date;
import java.util.Scanner;
import models.Funcionario;
import models.FuncionarioRelacionado;
import models.OrdemServico;

import models.RegistroProducao;
import models.Servico;
import services.FuncionarioRelacionadoService;
import services.FuncionarioService;
import services.GerenciadoraOS;
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
    public static void main(String[] args) {
         
        
        GerenciadoraOS gos =  new GerenciadoraOS();
        System.out.println(gos.buscarPorId(1));
         


    }

}
