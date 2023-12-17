/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Otavio
 */
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class Tecnico extends Pessoa {
    private LocalDate dataInicioContrato;
    @OneToMany(mappedBy = "locatario", cascade = CascadeType.PERSIST)
    private List<Impressora> impressora = new ArrayList<>();

    public Tecnico() {
        super();
        this.dataInicioContrato = null;
    }

    public Tecnico(String nome, String senha, String email, LocalDate dataInicioContrato) {
        super(nome, senha, email);
        this.dataInicioContrato = dataInicioContrato;
    }
}
