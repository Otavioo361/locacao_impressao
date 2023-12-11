/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

/**
 *
 * @author Otavio
 */
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class Cliente extends Pessoa {
    private String cpf;
    private Double limiteFatura;
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Impressora> faturas;
   @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Impressora> impressora;
   
    public Cliente(){
        super();
        this.cpf = "";
        this.limiteFatura=0.0;
    }

    public Cliente(String cpf, String nome, String senha, String email, Double limiteFatura, Integer tipoDeAcesso) {
        super(nome, senha, email,tipoDeAcesso);
        this.cpf = cpf;
        this.limiteFatura = limiteFatura;
    }

}
