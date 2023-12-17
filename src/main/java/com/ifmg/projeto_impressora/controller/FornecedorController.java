/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.controller;

import com.ifmg.projeto_impressora.model.Fornecedor;
import com.ifmg.projeto_impressora.model.dao.FornecedorDAO;
import com.ifmg.projeto_impressora.model.exceptions.FornecedorException;
import com.ifmg.projeto_impressora.model.valid.ValidateFornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Otavio
 */
public class FornecedorController {
    private FornecedorDAO repositorio;

    public FornecedorController() {
        this.repositorio = new FornecedorDAO();
    }

    public Fornecedor buscarProprietarioPorId(Integer id) {
        if (id == null) {
            return null;
        }
        Fornecedor fornecedor = (Fornecedor) repositorio.find(id);
        return fornecedor;
    }

    public String buscarFornecedorString() {
        List<Fornecedor> forn = repositorio.findAll();

        String fornecedorIdNomeString = "";
        for (Fornecedor forne : forn) {
            fornecedorIdNomeString += forne.getId() + " - " + forne.getNome() + "\n";
        }

        return fornecedorIdNomeString;
    }

    public void cadastrarFornecedor(String nome, String preco) {
        ValidateFornecedor valid = new ValidateFornecedor();
        Fornecedor novoFornecedor = valid.validaCamposEntrada(nome, preco);

        if (repositorio.findByNome(novoFornecedor.getNome()) != null) {
            throw new FornecedorException("Error: Esse fornecedor já existe");
        }
        repositorio.save(novoFornecedor);
    }

    public void atualizarFornecedor (int idFornecedor, String nome, String preco) {
        ValidateFornecedor valid = new ValidateFornecedor();
        Fornecedor novoFornecedor = valid.validaCamposEntrada(nome, preco);

        novoFornecedor.setId(idFornecedor);
        repositorio.save(novoFornecedor);
    }

    public void atualizarTabela(JTable grd) {
        Util.jTableShow(grd, new TMCadFornecedor(repositorio.findAll()), null);
    }

    public void excluirFornecedor(Fornecedor fornecedor) {
        if (fornecedor != null) {
            repositorio.delete(fornecedor);
        } else {
            throw new FornecedorException("Error: Fornecedor inexistente.");
        }
    }
}
