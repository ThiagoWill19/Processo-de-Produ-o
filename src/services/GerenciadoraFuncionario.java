
/**
 * Classe para gerenciar dados de funcionários armazenados no banco
 * Chamada por uma GUI 
 * A intenção é manter a GUI mais limpa o possivel e nao chamar diretamente
 * da classe de servico;
*/

package services;

import java.util.ArrayList;
import java.util.List;
import models.Funcionario;

/**
 *
 * @author thiago
 */
public class GerenciadoraFuncionario {
    
    private FuncionarioService funcionarioService = new FuncionarioService();
    private ServicoService ss =  new ServicoService();
    
    
   //Busca todos funcionários do banco e adiciona em uma lista; 
    public List<Funcionario> listarFuncionarios(){
        
        List<Funcionario> list =  new ArrayList<>();
        
        list = funcionarioService.findAll();
        
        return list;
        
    }
    
    public Funcionario buscar(int id){
        
        Funcionario f;

        f = funcionarioService.findById(id);
        if(f.getId() != null){
            f.setServicos(ss.findById(f.getId()));
            return f;
            
        }else return null;
        
    }
    
}
