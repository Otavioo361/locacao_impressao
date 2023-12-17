/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model.valid;

import com.ifmg.projeto_impressora.model.LtdCons;
import com.ifmg.projeto_impressora.model.exceptions.LtdConsException;

/**
 *
 * @author Otavio
 */
public class ValidateLtdCons {
    public LtdCons validaCamposEntrada(String nome, String senha, String email, String cnpj){
        LtdCons veterinario = new LtdCons(nome, senha, email, cnpj);
        if (nome.isEmpty()) {
            throw new LtdConsException("Error - Campo vazio: 'nome'.");
        }
        veterinario.setNome(nome);
        if (senha.isEmpty()) {
            throw new LtdConsException("Error - Campo vazio: 'senha'.");
        }
        veterinario.setSenha(senha);
        if (email.isEmpty()) {
            throw new LtdConsException("Error - Campo vazio: 'email'.");
        }
        veterinario.setEmail(email);
        if (cnpj.isEmpty()) {
            throw new LtdConsException("Error - Campo vazio: 'cnpj'.");
        }
        veterinario.setCnpj(cnpj);
        
        
        return veterinario;
    }
}
