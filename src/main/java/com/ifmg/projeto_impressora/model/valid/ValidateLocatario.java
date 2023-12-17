/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model.valid;

import com.ifmg.projeto_impressora.model.Tecnico;
import com.ifmg.projeto_impressora.model.exceptions.LocatarioException;
import java.time.LocalDate;

/**
 *
 * @author Otavio
 */
public class ValidateLocatario {
    public Tecnico validaCamposEntrada(String nome, String senha, String email, String data){
        Tecnico tecnico = new Tecnico(nome, senha, email, null);
        if (nome.isEmpty()) {
            throw new LocatarioException("Error - Campo vazio: 'nome'.");
        }
        tecnico.setNome(nome);
        if (senha.isEmpty()) {
            throw new LocatarioException("Error - Campo vazio: 'senha'.");
        }
        tecnico.setSenha(senha);
        if (email.isEmpty()) {
            throw new LocatarioException("Error - Campo vazio: 'email'.");
        }
        tecnico.setEmail(email);
        if(data.equals("    -  -  ")){
            throw new LocatarioException("Error - Campo vazio: 'data de inicio de contrato'.");
        }
        tecnico.setDataInicioContrato(LocalDate.parse(data));
        
        
        return tecnico;
    }
}
