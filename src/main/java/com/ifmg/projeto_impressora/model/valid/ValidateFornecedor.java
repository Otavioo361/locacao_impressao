/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model.valid;

import com.ifmg.projeto_impressora.model.Fornecedor;
import com.ifmg.projeto_impressora.model.exceptions.FornecedorException;

/**
 *
 * @author Otavio
 */
public class ValidateFornecedor {

    public Fornecedor validaCamposEntrada(String nome, String preco) {
        Fornecedor fornecedor = new Fornecedor();
        if (nome.isEmpty()) {
            throw new FornecedorException("Error - Campo vazio: 'nome'.");
        }
        fornecedor.setNome(nome);
        if (preco.isEmpty()) {
            throw new FornecedorException("Error - Campo vazio: 'preco'.");
        }

        try {
            Double.parseDouble(preco);
        } catch (NumberFormatException ex) {
            throw new FornecedorException("Error - 'preco' não é um valor numérico.");
        }

        fornecedor.setPreco(Double.parseDouble(preco));

        return fornecedor;
    }
}
