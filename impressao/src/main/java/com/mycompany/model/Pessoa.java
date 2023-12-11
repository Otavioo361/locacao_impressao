/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Data;

/**
 *
 * @author Otavio
 */
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String senha;
    @Column(nullable = false, unique = true)
    private String email;
    private Integer tipoDeAcesso;
    
    public Pessoa(){
        this.id = null;
        this.nome = "";
        this.senha = "";
        this.email = "";
        this.tipoDeAcesso = -1;
    }
    
    public Pessoa(String nome, String senha, String email, Integer TipoAcesso){
        this.id = null;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.tipoDeAcesso = TipoAcesso;
    }
}