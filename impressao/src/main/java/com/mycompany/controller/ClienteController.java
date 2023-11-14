/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.controller.tableModel.TMCadCliente;
import com.mycompany.model.Cliente;
import com.mycompany.model.dao.ClienteDAO;
import com.mycompany.model.valid.ClienteException;
import com.mycompany.model.valid.ValidateCliente;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author JonathasOliveira
 */
public class ClienteController {

    private ClienteDAO repositorio;

    public ClienteController() {
        repositorio = new ClienteDAO();
    }

    public void cadastrarCliente(String nome, String senha, String email, String cpf) throws ClienteException {
        ValidateCliente valid = new ValidateCliente();
        Cliente novoCliente = valid.validaCamposEntrada(nome, senha, email, cpf);

        if (repositorio.findByCpf(cpf) == null) {
            repositorio.save(novoCliente);
        } else {
            throw new ClienteException("Error - Já existe um cliente com este 'CPF'.");
        }
    }

    public void atualizarCliente(int idCliente, String nome, String senha, String email, String cpf) throws ClienteException {
        ValidateCliente valid = new ValidateCliente();
        Cliente novoCliente = valid.validaCamposEntrada(nome, senha, email, cpf);
        novoCliente.setId(idCliente);

        repositorio.update(novoCliente);
    }

    public Cliente buscarCliente(String cpf) {
        return repositorio.findByCpf(cpf);
    }

    public void atualizarTabela(JTable grd) {
        List<Cliente> lst = repositorio.findAll();

        TMCadCliente tableModel = new TMCadCliente(lst);
        grd.setModel(tableModel);
    }

    /*public void atualizarTabela(JTable grd, String nome) {
        List<Aluno> lst = repositorio.filterByName(nome);

        TMCadAluno tableModel = new TMCadAluno(lst);
        grd.setModel(tableModel);
    }*/

    public void excluirAluno(Cliente cliente) throws ClienteException {
        if (cliente != null) {
            repositorio.delete(cliente);
        } else {
            throw new ClienteException("Error - Cliente inexistente.");
        }
    }
}
