/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model.valid;

import com.ifmg.projeto_impressora.model.Local;

import com.ifmg.projeto_impressora.model.exceptions.LocalException;

/**
 *
 * @author Otavio
 */
public class ValidateLocal {

    public Local validaCamposEntrada(Double tamanho, String tipo) {
        Local baia = new Local(tamanho, tipo);
        if (tamanho == null) {
            throw new LocalException("Error - Campo vazio: 'tamanho'.");
        }
        baia.setTamanho(tamanho);
        if (tipo.isEmpty()) {
            throw new LocalException("Error - Campo vazio: 'tipo'.");
        }
        baia.setTipo(tipo);

        return baia;
    }
}
