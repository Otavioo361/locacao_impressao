/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.controller.tableModel.TMCadServicoAdicional;
import com.mycompany.model.ServicoAdicional;
import com.mycompany.model.dao.ServicoAdicionalDAO;
import com.mycompany.model.exceptions.ServicoAdicionalException;
import com.mycompany.model.valid.ValidateServicoAdicional;
import com.mycompany.controller.Util;

import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Otavio
 */
public class ServicoAdicionalController {
    private ServicoAdicionalDAO repositorio;
        public ServicoAdicionalController(){
        this.repositorio = new ServicoAdicionalDAO();
    }
    
    public ServicoAdicional buscarServicoAdicionalPorId(Integer id){
        if(id == null){
            return null;
        }
        ServicoAdicional servico = (ServicoAdicional) repositorio.find(id);
        return servico;
    }
    
    public String buscarServicoAdicionalString(){
        List<ServicoAdicional> servicosAdicionais = repositorio.findAll();
        
        String alimentoIdNomeString = "";
        for (ServicoAdicional servico : servicosAdicionais) {
            alimentoIdNomeString += servico.getId()+" - "+servico.getServico()+"\n";
        }
        
        return alimentoIdNomeString;
    }
    
    public void cadastrarServico(String servico, String preco){
        ValidateServicoAdicional valid = new ValidateServicoAdicional();
        ServicoAdicional novoSerAdicional = valid.validaCamposEntrada(servico, preco);
            
        repositorio.save(novoSerAdicional);
    }
    
    public void atualizarServico(int idSerAdicional, String servico, String preco){
        ValidateServicoAdicional valid = new ValidateServicoAdicional();
        ServicoAdicional novoSerAdicional = valid.validaCamposEntrada(servico, preco);
        
        novoSerAdicional.setId(idSerAdicional);
        repositorio.save(novoSerAdicional);
    }
    
    public void atualizarTabela(JTable grd) {
        List lst = repositorio.findAll();
        TMCadServicoAdicional tableModel = new TMCadServicoAdicional(lst);
        Util.jTableShow(grd, new TMCadServicoAdicional(repositorio.findAll()),null );
    }
    
    public void excluirServico(ServicoAdicional servicoAdicional){
        if (servicoAdicional != null) {
            repositorio.delete(servicoAdicional);
        }else{
            throw new ServicoAdicionalException("Error: Local inexistente.");
        }
    }
}
