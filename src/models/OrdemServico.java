/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author thiago
 */
public class OrdemServico {
   
    private Integer id;
    private String empresa;
    private String cliente;
    private String processo;
    private boolean status;
    private Integer idUltimoAcesso;
    private List<FuncionarioRelacionado> fr = new ArrayList<>();
    
    public OrdemServico(){
        
    }

    public OrdemServico(Integer id, String empresa, String cliente, String processo, boolean status, Integer idUltimoAcesso) {
        this.id = id;
        this.empresa = empresa;
        this.cliente = cliente;
        this.processo = processo;
        this.status = status;
        this.idUltimoAcesso = idUltimoAcesso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProcesso() {
        return processo;
    }

    public void setProcesso(String processo) {
        this.processo = processo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getIdUltimoAcesso() {
        return idUltimoAcesso;
    }

    public void setIdUltimoAcesso(Integer idUltimoAcesso) {
        this.idUltimoAcesso = idUltimoAcesso;
    }

    public List<FuncionarioRelacionado> getFr() {
        return fr;
    }

    public void setFr(List<FuncionarioRelacionado> fr) {
        this.fr = fr;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrdemServico other = (OrdemServico) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
