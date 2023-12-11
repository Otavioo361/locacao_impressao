
package com.mycompany.model;


import com.mycompany.mode.Pk.ImpressoraServicoId;

import java.util.Date;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;

@EqualsAndHashCode
@Data
@Entity
@Table(name = "impressora_servico")
@AssociationOverrides({
    @AssociationOverride(name = "pk.impressora",
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
    public Impressora getImpressora() {
        return getPk().getImpressora();
    }

    public void setEquino(Impressora impressora) {
        getPk().setImpressora(impressora);
    }

    @Transient
    public ServicoAdicional getServicoAdicional() {
        return getPk().getServicoAdicional();
    }

    public void setServicoAdicional(ServicoAdicional servicoadicional) {
        getPk().setServicoAdicional(servicoadicional);
    }
    
}
