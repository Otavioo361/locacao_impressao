/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mode.Pk;

import com.mycompany.model.Impressora;
import com.mycompany.model.ServicoAdicional;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Otavio
 */
@EqualsAndHashCode
@Data
@Embeddable
//primary key
public class ImpressoraServicoId {
     @ManyToOne
    private Impressora impressora;
    @ManyToOne
    private ServicoAdicional servicoAdicional;
}
