/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;


import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author Otavio
 */
@Data
@Entity
public class Fatura {
      
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean foiPaga;
    private LocalDate create_at;
    private LocalDate diaMaxPagamento;
    private Double valor;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Cliente cliente;
    
    
    public Fatura(){
        this.id = -1;
        this.foiPaga = false;
    }

    public Fatura(Boolean foiPaga, Double valor, Cliente proprietario,
            LocalDate diaMaxPagamento, LocalDate create_at) {
        this.id = null;
        this.foiPaga = foiPaga;
        this.diaMaxPagamento = diaMaxPagamento;
        this.valor = valor;
        this.cliente = proprietario;
        this.create_at = create_at;
    }
    
    
}
