/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

/**
 *
 * @author Otavio
 */
public class Atendente extends Pessoa {
    private String cartaoPonto;
    
    @OneToMany(mappedBy = "Atendente", cascade = CascadeType.ALL)
    private List<Impressora> impressora;


    public Atendente(String nome, String senha, String email,Integer tipoDeAcesso, String cartaoID) {
        super(nome, senha, email, 3);
        this.cartaoPonto = cartaoPonto;
    }

    public Atendente() {
        super();
        this.cartaoPonto = "";
    }
    
}
