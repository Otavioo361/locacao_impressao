/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.valid;

import com.mycompany.model.Local;
import com.mycompany.model.exceptions.LocalException;

/**
 *
 * @author Otavio
 */
public class ValidateLocal {
     public Local validaCamposEntrada(Double tamanho, String tipo) {
        Local local = new Local(tamanho, tipo);
        if (tamanho == null) {
            throw new LocalException("Error - Campo vazio: 'tamanho'.");
        }
        local.setTamanho(tamanho);
        if (tipo.isEmpty()) {
            throw new LocalException("Error - Campo vazio: 'tipo'.");
        }
        local.setTipo(tipo);

        return local;
    }
    
}
