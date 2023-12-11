/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author Otavio
 */
@Data
@Entity
public class Local {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double tamanho;
    private String tipo;
    @OneToOne(mappedBy = "baia")
    private Impressora impressora;
    
    public Local(){
        this.id = -1;
        this.tamanho = -1.0;
        this.tipo = "";
    }
    
    public Local (Double tamanho, String tipo){
        this.id = null;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }
}
