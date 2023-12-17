/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model;

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
    private String nomeEmpresa;

    public Administrador() {
        super();
        this.nomeEmpresa = "";
    }

    public Administrador(String nomeEmpresa, String nome, String senha, String email) {
        super(nome, senha, email);
        this.nomeEmpresa = nomeEmpresa;
    }
}
