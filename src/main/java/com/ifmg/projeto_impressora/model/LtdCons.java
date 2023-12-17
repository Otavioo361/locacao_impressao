/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Otavio
 */
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class LtdCons extends Pessoa {
    private String cnpj;
    
    @OneToMany(mappedBy = "ltdCons", cascade = CascadeType.ALL)
    private List<Impressora> impressora;


    public LtdCons(String nome, String senha, String email, String crmv) {
        super(nome, senha, email);
        this.cnpj = cnpj;
    }

    public LtdCons() {
        super();
        this.cnpj = "";
    }
}
