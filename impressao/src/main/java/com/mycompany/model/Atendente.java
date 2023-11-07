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
public class Atendente extends Pessoa {
    private String cartaoPonto;
    
    @OneToMany(mappedBy = "veterinario", cascade = CascadeType.ALL)
    private List<Impressora> impressora;


    public Atendente(String nome, String senha, String email, String cartaoID) {
        super(nome, senha, email);
        this.cartaoPonto = cartaoPonto;
    }

    public Atendente() {
        super();
        this.cartaoPonto = "";
    }
    
}
