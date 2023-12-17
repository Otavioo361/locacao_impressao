/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author gusta
 */
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class Proprietario extends Pessoa {
    private String cpf;
    private Integer limiteFatura;
    
    @OneToMany(mappedBy = "proprietario", cascade = CascadeType.ALL)
    private List<Fatura> faturas;
    @OneToMany(mappedBy = "proprietario", cascade = CascadeType.ALL)
    private List<Impressora> impressora;
    
    public Proprietario(){
        super();
        this.cpf = "";
    }

    public Proprietario(String cpf, String nome, String senha, String email, Integer limiteFatura) {
        super(nome, senha, email);
        this.cpf = cpf;
    }
    
}
