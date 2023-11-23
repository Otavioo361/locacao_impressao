/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.valid;

import com.mycompany.model.Tinta;
import com.mycompany.model.exceptions.TintaException;

/**
 *
 * @author Otavio
 */
public class ValidateTinta {
     public Tinta validaCamposEntrada(String nome, String preco) {
        Tinta alimento = new Tinta();
        if (nome.isEmpty()) {
            throw new TintaException("Error - Campo vazio: 'nome'.");
        }
        alimento.setNome(nome);
        if (preco.isEmpty()) {
            throw new TintaException("Error - Campo vazio: 'preco'.");
        }

        try {
            Double.parseDouble(preco);
        } catch (NumberFormatException ex) {
            throw new TintaException("Error - 'preco' não é um valor numérico.");
        }

        alimento.setPreco(Double.parseDouble(preco));

        return alimento;
    }
}
