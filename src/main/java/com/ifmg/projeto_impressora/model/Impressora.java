/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Otavio
 */
@EqualsAndHashCode
@Entity
@Data
public class Impressora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String locatario;
    private String marca;
    private LocalDate dataFabricacao;
    @OneToMany(mappedBy = "pk.impressora", cascade = CascadeType.ALL)
    private List<ImpressoraServico> impressoraServico = new ArrayList<>();    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Proprietario proprietario;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Tecnico tecnico;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private LtdCons ltdCons;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Local local;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "Impressora_Fornecedor"
            , joinColumns = @JoinColumn(name = "impressora_id")
            , inverseJoinColumns = @JoinColumn(name = "fornecedor_id"))
    private List <Fornecedor> fornecedor = new ArrayList<>();
    
    public Impressora(){
        this.id = -1;
        this.nome = "";
        this.locatario = "";
        this.marca = "";
        this.dataFabricacao = null;
        this.proprietario = new Proprietario();
        this.ltdCons = new LtdCons();
        this.local = new Local();
        this.tecnico = new Tecnico();      
    }

    public Impressora(String nome, String locatario, String marca, LocalDate dataFabricacao, 
            Proprietario prop, LtdCons ltdcons, Local local, Tecnico tecnico) {
        this.id = null;
        this.nome = nome;
        this.locatario = locatario;
        this.marca = marca;
        this.dataFabricacao = dataFabricacao;
        this.proprietario = prop;
        this.ltdCons = ltdcons;
        this.local = local;
        this.tecnico = tecnico;
    }
    
}
