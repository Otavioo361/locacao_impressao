/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author Otavio
 */
@Data
@Entity
public class Tinta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double preco;
    @ManyToMany(mappedBy = "alimentos")
    private List<Impressora> equinos = new ArrayList<>();
    @CreationTimestamp
    private Date timestamp;
    
    
    public Tinta(){
        this.id = -1;
        this.nome = "";
        this.preco = -1.0;

    }
    
    public Tinta(String nome, Double preco){
        this.id = null;
        this.nome = nome;
        this.preco = preco;
    }
}
