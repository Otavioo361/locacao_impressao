/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import jakarta.persistence.AssociationOverride;
import jakarta.persistence.AssociationOverrides;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author Otavio
 */
@EqualsAndHashCode
@Data
@Entity
@Table(name = "impressora_servico")
@AssociationOverrides({
    @AssociationOverride(name = "pk.equino",
            joinColumns = @JoinColumn(name = "impressora_id")),
    @AssociationOverride(name = "pk.servicoAdicional",
            joinColumns = @JoinColumn(name = "servico_adicional_id"))})
public class ImpressoraServico {
    @EmbeddedId
    private ImpressoraServicoId pk = new ImpressoraServicoId();
    private Integer qtd;
    @CreationTimestamp
    private Date timestamp;

    @Transient
    public Impressora getEquino() {
        return getPk().getEquino();
    }

    public void setEquino(Impressora impressora) {
        getPk().setEquino(impressora);
    }

    @Transient
    public ServicoAdicional getServicoAdicional() {
        return getPk().getServicoAdicional();
    }

    public void setServicoAdicional(ServicoAdicional servicoadicional) {
        getPk().setServicoAdicional(servicoadicional);
    }
    
}
