/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import models.OrdemServico;

/**
 *
 * @author thiago
 */
public class GerenciadoraOS {

    private OrdemServicoService oss = new OrdemServicoService();

    public List<OrdemServico> listarOsAberta() {

        List<OrdemServico> list1 = new ArrayList();
        List<OrdemServico> list2 = new ArrayList();

        list1 = oss.findAll();

        for (OrdemServico o : list1) {

            if (o.isStatus() == true) {

                list2.add(o);

            }

        }
        return list2;

    }

    public List<OrdemServico> listarOsFechada() {

        List<OrdemServico> list1 = new ArrayList();
        List<OrdemServico> list2 = new ArrayList();

        list1 = oss.findAll();

        for (OrdemServico o : list1) {

            if (o.isStatus() == false) {

                list2.add(o);

            }

        }
        return list2;

    }

    public OrdemServico buscarPorId(int id) {

        
        FuncionarioRelacionadoService fr = new FuncionarioRelacionadoService();
        OrdemServico os = new OrdemServico();

        os = oss.findById(id);

        if (os.getId() != null) {

            os.setFr(fr.findById(id));
            return os;

     
        } else {
          return null;
        }

    }

}
