/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

/**
 *
 * @author Otavio
 */
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class Administrador extends Pessoa {
    private String cpf;
    
    public Administrador(){
        super();
        this.cpf = "";
    }

    public Administrador(String cpf, String nome, String senha, String email) {
        super(nome, senha, email);
        this.cpf = cpf;
    }
}