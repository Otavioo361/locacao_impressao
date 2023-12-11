/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Otavio
 */
@EqualsAndHashCode
@Data
@Entity
public class ServicoAdicional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servico_adicional_id")
    private Integer id;
    private String servico;
    private Double preco;
    @OneToMany(mappedBy = "pk.servicoAdicional")
    private List<ImpressoraServico> impressoraServico = new ArrayList<>();

    public ServicoAdicional() {
        this.id = -1;
        this.servico = " ";
        this.preco = -1.0;
    }

    public ServicoAdicional(String servico, Double preco) {
        this.id = null;
        this.servico = servico;
        this.preco = preco;
    }

}
