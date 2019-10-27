/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import app.dao.RegistroProducaoDAO;
import java.sql.Date;
import models.RegistroProducao;

/**
 *
 * @author thiago
 */
public class RegistroProducaoService {

    private RegistroProducaoDAO rpd = new RegistroProducaoDAO();

    public boolean insert(RegistroProducao rp) {

        if (rpd.insert(rp)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean update(int idFun, int idOrdem, Date dataTermino) {

        if (rpd.update(idFun, idOrdem, dataTermino)) {
            return true;
        } else {
            return false;
        }

    }

}
