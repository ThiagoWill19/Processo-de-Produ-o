
import app.dao.RegistroProducaoDAO;

import java.sql.Date;
import java.util.Scanner;
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
    public static void main(String[] args) {

        Registradora r = new Registradora();
        Scanner scann = new Scanner(System.in);
        String status = "";
        int idFun, nOS;

        while (true) {
            System.out.println("------PROCESSO DE PRODUÇÃO MATRIZBRASIL------");
            System.out.println("\n\n");
            System.out.print("ID Funcionário: ");
            idFun = scann.nextInt();
            System.out.print("N° O.S: ");
            nOS = scann.nextInt();

            try {
               status = r.apertureChecker(idFun, nOS); 
            } catch (java.lang.NullPointerException e) {
                System.out.println(e);
            }
            

            System.out.println("\n");
            System.out.println(status);
            System.out.println("\n\n\n");

        }

    }

}
