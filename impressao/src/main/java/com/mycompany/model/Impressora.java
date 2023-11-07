/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Otavio
 */
public class Impressora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String marca;
    
    @OneToMany(mappedBy = "pk.impressora", cascade = CascadeType.ALL)
    private List<ImpressoraServico> impressoraServico = new ArrayList<>();
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Cliente cliente;
    @ManyToOne(cascade = CascadeType.PERSIST)   
    private Atendente atendente;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Local local;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "Impressora_Tinta"
            , joinColumns = @JoinColumn(name = "impressora_id")
            , inverseJoinColumns = @JoinColumn(name = "tinta_id"))
    private List <Tinta> alimentos = new ArrayList<>();
    public Impressora(){
        this.id = -1;
        this.marca = "";       
        this.cliente = new Cliente();        
        this.atendente = new Atendente();        
        this.local = new Local();
        
        
        
    }
}
