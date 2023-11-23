/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.valid;

import com.mycompany.model.Administrador;

/**
 *
 * @author JonathasOliveira
 */
public class ValidateAdministrador {
    public Administrador validaCamposEntrada(String nome, String senha, String email, String cpf) throws AdministradorException {
        Administrador administrador = new Administrador();

        if (nome.isEmpty())
            throw new AdministradorException("Error - Campo vazio: 'nome'.");
        administrador.setNome(nome);

        if (senha.isEmpty())
            throw new AdministradorException("Error - Campo vazio: 'senha'.");
        administrador.setSenha(senha);

        if (email.isEmpty())
            throw new AdministradorException("Error - Campo vazio: 'email'.");
        administrador.setEmail(email);

        if (cpf.isEmpty())
            throw new AdministradorException("Error - Campo vazio: 'cpf'.");
        administrador.setNomeEmpresa(cpf);

        return administrador;
    }
}
