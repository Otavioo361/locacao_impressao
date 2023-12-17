/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.controller;

import com.ifmg.projeto_impressora.model.Impressora;
import com.ifmg.projeto_impressora.model.LtdCons;
import com.ifmg.projeto_impressora.model.dao.LtdConsDAO;
import com.ifmg.projeto_impressora.model.exceptions.LtdConsException;
import com.ifmg.projeto_impressora.model.valid.ValidateLtdCons;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Otavio
 */
public class LtdConsController {
    private LtdConsDAO repositorio;
    
    public LtdConsController(){
        this.repositorio = new LtdConsDAO();
    }
    
    public String buscarImpressoraString(Integer id){
        LtdCons cons = (LtdCons) repositorio.find(id);
        List<Impressora> impressoras = cons.getImpressora();
        
        String impressoraIdNomeString = "";
        for (Impressora impressora : impressoras) {
            impressoraIdNomeString += impressora.getId()+" - "+impressora.getNome()+"\n";
        }
        
        return impressoraIdNomeString;
    }
    
    public String buscarLtdsString(){
        List<LtdCons> ltds = repositorio.findAll();
        
        String ltdConsIdNomeString = "";
        for (LtdCons ltd :ltds ) {
            ltdConsIdNomeString += ltd.getId()+" - "+ ltd.getNome()+"\n";
        }
        
        return ltdConsIdNomeString;
    }
    
    public LtdCons buscarLtdConsPorId(Integer id){
        if(id == null){
            return null;
        }
        LtdCons vet = (LtdCons) repositorio.find(id);
        return vet;
    }
    
    public void cadastrarLtdCons(String nome, String senha, String email, String cnpj){
        ValidateLtdCons valid = new ValidateLtdCons();
        LtdCons novoVeterinario = valid.validaCamposEntrada(nome, senha, email, cnpj);
             
        repositorio.save(novoVeterinario);
    }
    
    public void atualizarLtdCons(int idLtdCons, String nome, String senha, String email, String cnpj){
        ValidateLtdCons valid = new ValidateLtdCons();
        LtdCons novoLtdCons = valid.validaCamposEntrada(nome, senha, email, cnpj);
        
        novoLtdCons.setId(idLtdCons);
        repositorio.save(novoLtdCons);
    }
    
    public void atualizarTabela(JTable grd) {
        Util.jTableShow(grd, new TMCadLtdCons(repositorio.findAll()), null);
    }
    
    public void atualizarTabelaImpressora(JTable grd, Integer id) {
        LtdCons cons = (LtdCons) repositorio.find(id);
        List<Impressora> impressora = cons.getImpressora();
         Util.jTableShow(grd, new TMCadImpressora(impressora), null);
    }
    
    public void excluirVeterinario(LtdCons ltdcons){
        if (ltdcons != null) {
            repositorio.delete(ltdcons);
        }else{
            throw new LtdConsException("Error: Empresa inexistente.");
        }
    }
}
