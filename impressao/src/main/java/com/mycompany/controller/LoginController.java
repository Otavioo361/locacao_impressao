/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.model.Login;
import com.mycompany.model.Pessoa;
import com.mycompany.model.dao.LoginDao;
import javax.security.auth.login.LoginException;

/**
 *
 * @author mateu
 */
public class LoginController {
    private LoginDao repositorio;
    
    public LoginController(){
        repositorio = new LoginDao();
    }
    
    public Pessoa findLogin(String email, String senha) throws LoginException{
        Pessoa loginNovo = repositorio.find(email, senha);
        if(repositorio.find(email, senha) == null){
            throw new LoginException("Erro! EMAIL OU SENHA INVÁLIDOS");
        }
        return loginNovo;
    }
    
}
