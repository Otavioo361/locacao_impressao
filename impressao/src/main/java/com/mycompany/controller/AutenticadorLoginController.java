/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.model.auth.Autenticador;
import com.mycompany.model.dao.AdministradorDAO;
import com.mycompany.model.dao.ClienteDAO;

/**
 *
 * @author JonathasOliveira
 */
public class AutenticadorLoginController {
    private ClienteDAO repCliente;
    private AdministradorDAO repAdministrador;
    
    public AutenticadorLoginController() {
        repCliente = new ClienteDAO();
        repAdministrador = new AdministradorDAO();
    }
    
    public char autenticarPorEmailSenha(String email, String senha) {
        Integer idCliente = repCliente.getClienteByEmailAndSenha(email, senha);
        if (!(idCliente == 0)) {
            Autenticador.setIdLogado(idCliente);
            return 'c';
        }

        Integer idAdministrador = repAdministrador.getClienteByEmailAndSenha(email, senha);
        if (!(idAdministrador == 0)) {
            Autenticador.setIdLogado(idAdministrador);
            return 'a';
        }
        return 'n';
    }
}
