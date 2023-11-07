/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 *
 * @author Otavio
 */
public class Cliente extends Pessoa {
     private String cpf;
    private Integer limiteFatura;
    
    @OneToMany(mappedBy = "proprietario", cascade = CascadeType.ALL)
    private List<Impressora> faturas;
    @OneToMany(mappedBy = "proprietario", cascade = CascadeType.ALL)
    private List<Impressora> equinos;
    
    public Cliente(){
        super();
        this.cpf = "";
    }

    public Cliente(String cpf, String nome, String senha, String email, Integer limiteFatura) {
        super(nome, senha, email);
        this.cpf = cpf;
    }

}
