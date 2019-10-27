/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import java.sql.Date;
import java.time.LocalDate;
import models.Funcionario;
import models.OrdemServico;
import models.RegistroProducao;

/**
 *
 * @author thiago
 */
public class Registradora {

    // busca os dados  verifica se existemno banco e se a O.S esta com status fechado,
    //chama openProcess para abrir um processo;
    //retorna um status String para verificar no Log/Console;
    public String apertureChecker(int idFun, int idOrdem) {

        FuncionarioService fs = new FuncionarioService();
        OrdemServicoService osService = new OrdemServicoService();

        Funcionario funcionario = new Funcionario();
        OrdemServico os = new OrdemServico();

        funcionario = fs.findById(idFun);

        if (funcionario != null) {

            os = osService.findById(idOrdem);

            if (os != null) {

                if (!os.isStatus()) {

                    if (openProcess(funcionario, os)) {
                        return "Processo aberto na O.S: " + os.getId() + " por " + funcionario.getNome();
                    } else {
                        return "Não foi possivel iniciar processo!";
                    }

                } else if (closeProcess(funcionario, os)) {
                    return "Processo fechado na O.S: " + os.getId() + " por " + funcionario.getNome();
                } else {
                    return "Não foi possivel fechar processo!\nVerifique se a ID do funcionario é a mesma que abriu.";
                }

            } else {
                return "O.S não encontrada";
            }

        } else {
            return "Funcionário não encontrado";
        }

    }

    public boolean openProcess(Funcionario f, OrdemServico os) {

        OrdemServicoService osService = new OrdemServicoService();

        os.setIdUltimoAcesso(f.getId());

        // identifica a função, registra a etapa do processo correto na O.S
        switch (f.getFuncao()) {
            case SERRADOR:
                os.setProcesso("Processo de serra");
                break;
            case MONTADOR:
                os.setProcesso("Processo de montagem");
                break;
            case EMBORRACHADOR:
                os.setProcesso("Processo de acabamento");
                break;
            case MOTORISTA:
                os.setProcesso("Processo de entrega");
                break;
            default:
                os.setProcesso("Não foi possivel localizar o processo!");
        }

        os.setStatus(true);

        //Atualiza a O.S no banco e abre um processo de produção 
        if (osService.update(os)) {

            RegistroProducao rp = new RegistroProducao();
            RegistroProducaoService rpService = new RegistroProducaoService();

            rp.setIdF(f.getId());
            rp.setIdOS(os.getId());
            rp.setInicio(Date.valueOf(LocalDate.now()));

            if (rpService.insert(rp)) {
                return true; // registra o processo de produção no banco, se algo der errado retorna false, acompanhar erro no log;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }

    public boolean closeProcess(Funcionario f, OrdemServico os) {
        
        RegistroProducao rp = new RegistroProducao();
        RegistroProducaoService rpService = new RegistroProducaoService();
        OrdemServicoService osSetvice =  new OrdemServicoService();
        
        if (os.getIdUltimoAcesso() == f.getId()) {

            

            switch (f.getFuncao()) {
                case SERRADOR:
                    os.setProcesso("Aguardando Montagem");
                    break;
                case MONTADOR:
                    os.setProcesso("Aguardando Acabamento");
                    break;
                case EMBORRACHADOR:
                    os.setProcesso("Aguardando Motorista");
                    break;
                case MOTORISTA:
                    os.setProcesso("Servico Entregue");
                    break;
                default:
                    os.setProcesso("Não foi possivel localizar o processo!");
            }
            
            os.setStatus(false);
            
            if(osSetvice.update(os)){
                
                rp.setIdF(f.getId());
                rp.setIdOS(os.getId());
                rp.setTermino(Date.valueOf(LocalDate.now()));
                
                if(rpService.update(rp.getIdF(), rp.getIdOS(), rp.getTermino())){
                    return true;
                    
                }else return false;
                
            }return false;

        } else {
            return false;
        }

    }
    
    
    
}
