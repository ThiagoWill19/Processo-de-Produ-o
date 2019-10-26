

import app.dao.RegistroProducaoDAO;


import java.sql.Date;


import models.RegistroProducao;



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
        
        RegistroProducao rp =  new RegistroProducao();
        RegistroProducaoDAO rpd = new RegistroProducaoDAO();

        /*
        rp.setIdF(1);
        rp.setIdOS(1);
        rp.setInicio(Date.valueOf(LocalDate.now()));
        rp.setTermino(Date.valueOf(LocalDate.now()));
        */
        
        
        
        System.out.println(rpd.update(1, 1, (Date)Date.valueOf("2019-10-30")));
      
        
    }

}
