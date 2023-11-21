/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.valid;

import com.mycompany.model.Cliente;

/**
 *
 * @author JonathasOliveira
 */
public class ValidateCliente {

    public Cliente validaCamposEntrada(String nome, String senha, String email, String cpf) throws ClienteException {
        Cliente cliente = new Cliente();

        if (nome.isEmpty())
            throw new ClienteException("Error - Campo vazio: 'nome'.");
        cliente.setNome(nome);

        if (senha.isEmpty())
            throw new ClienteException("Error - Campo vazio: 'senha'.");
        cliente.setSenha(senha);

        if (email.isEmpty())
            throw new ClienteException("Error - Campo vazio: 'email'.");
        cliente.setEmail(email);

        if (cpf.isEmpty())
            throw new ClienteException("Error - Campo vazio: 'cpf'.");
        cliente.setCpf(cpf);

        return cliente;
    }
}