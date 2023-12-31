/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package com.mycompany.controller;

import com.mycompany.controller.tableModel.TMCadAdministrador;
import com.mycompany.controller.tableModel.TMCadCliente;
import com.mycompany.model.Administrador;
import com.mycompany.model.Cliente;
import com.mycompany.model.dao.AdministradorDAO;
import com.mycompany.model.dao.ClienteDAO;
import com.mycompany.model.valid.ClienteException;
import com.mycompany.model.valid.ValidateAdministrador;
import com.mycompany.model.valid.ValidateCliente;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author JonathasOliveira
 */
/*public class AdministradorController {
    private AdministradorDAO repositorio;

    public AdministradorController() {
        repositorio = new AdministradorDAO();
    }
    
    public void cadastrarAdministrador(String nome, String senha, String email, String cpf){
        ValidateAdministrador valid = new ValidateAdministrador();
        Administrador novoAdministrador = valid.validaCamposEntrada(nome, senha, email, cpf);
             
        repositorio.save(novoAdministrador);
    }

    
    
    public void atualizarAdministrador(int idAdministrador, String nome, String senha, String email, String cpf){
        ValidateAdministrador valid = new ValidateAdministrador();
        Administrador novoAdministrador = valid.validaCamposEntrada(nome, senha, email, cpf);
        
        novoAdministrador.setId(idAdministrador);
        repositorio.save(novoAdministrador);
    }

    public Administrador buscarAdministrador(String cpf) {
        return repositorio.findByCpf(cpf);
    }

    public void atualizarTabela(JTable grd) {
        List<Administrador> lst = repositorio.findAll();

        TMCadAdministrador tableModel = new TMCadAdministrador(lst);
        grd.setModel(tableModel);
    }

    public void atualizarTabela(JTable grd) {
        Util.jTableShow(grd, new TMCadAdministrador(repositorio.findAll()), null);
    }
    /*public void atualizarTabela(JTable grd, String nome) {
        List<Aluno> lst = repositorio.filterByName(nome);

        TMCadAluno tableModel = new TMCadAluno(lst);
        grd.setModel(tableModel);
    }*/

    /*public void excluirAdministrador(Administrador administrador) throws AdministradorException {
        if (administrador != null) {
            repositorio.delete(administrador);
        } else {
            throw new AdministradorException("Error - Administrador inexistente.");
        }
    }
}*/
