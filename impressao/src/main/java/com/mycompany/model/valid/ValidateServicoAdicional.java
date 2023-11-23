/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.valid;

import com.mycompany.model.ServicoAdicional;
import com.mycompany.model.exceptions.ServicoAdicionalException;

/**
 *
 * @author Otavio
 */
public class ValidateServicoAdicional {
    public ServicoAdicional validaCamposEntrada(String servico, String preco) {
        ServicoAdicional serAdicional = new ServicoAdicional();
        if (servico.isEmpty()) {
            throw new ServicoAdicionalException("Error - Campo vazio: 'serviço'.");
        }
        serAdicional.setServico(servico);
        if (preco.isEmpty()) {
            throw new ServicoAdicionalException("Error - Campo vazio: 'preco'.");
        }
        try {
            Double.parseDouble(preco);
        } catch (NumberFormatException ex) {
            throw new ServicoAdicionalException("Error - 'preco' não é um valor numérico.");
        }
        serAdicional.setPreco(Double.parseDouble(preco));

        return serAdicional;
    }
}