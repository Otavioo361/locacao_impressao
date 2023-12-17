/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model.Pk;

import com.ifmg.projeto_impressora.model.Impressora;
import com.ifmg.projeto_impressora.model.ServicoAdicional;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Otavio
 */
@EqualsAndHashCode
@Data
@Embeddable
public class ImpressoraServicoId {

    @ManyToOne
    private Impressora impressora;
    @ManyToOne
    private ServicoAdicional servicoAdicional;
    
    
}
