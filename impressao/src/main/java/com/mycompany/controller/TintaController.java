/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.controller.tableModel.TMCadTinta;
import com.mycompany.model.Tinta;
import com.mycompany.model.dao.TintaDAO;
import com.mycompany.model.exceptions.TintaException;
import com.mycompany.model.valid.ValidateTinta;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Otavio
 */
public class TintaController {
    private TintaDAO repositorio;
    
    public TintaController(){
        this.repositorio = new TintaDAO();
    }
    
    public Tinta buscarClientePorId(Integer id){
        if(id == null){
            return null;
        }
        Tinta tinta = (Tinta) repositorio.find(id);
        return tinta;
    }
    
    public String buscarTintaString(){
        List<Tinta> tintas = repositorio.findAll();
        
        String tintaIdNomeString = "";
        for (Tinta ali : tintas) {
            tintaIdNomeString += ali.getId()+" - "+ali.getNome()+"\n";
        }
        
        return tintaIdNomeString;
    }
    
    public void cadastrarTinta(String nome, String preco){
        ValidateTinta valid = new ValidateTinta();
        Tinta novaTinta = valid.validaCamposEntrada(nome, preco);
        
        if (repositorio.findByNome(novaTinta.getNome()) != null) {
            throw new TintaException("Error: Esse alimento já existe");
        }       
        repositorio.save(novaTinta);
    }
    
    public void atualizarTinta(int idAlimento, String nome, String preco){
        ValidateTinta valid = new ValidateTinta();
        Tinta novaTinta = valid.validaCamposEntrada(nome, preco);
        
        novaTinta.setId(idAlimento);
        repositorio.save(novaTinta);
    }
    
    public void atualizarTabela(JTable grd) {
        Util.jTableShow(grd, new TMCadTinta(repositorio.findAll()), null);
    }
    
    public void excluirAlimento(Tinta tinta){
        if (tinta != null) {
            repositorio.delete(tinta);
        }else{
            throw new TintaException("Error: Tinta inexistente.");
        }
    }
}
