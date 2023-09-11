package model.valid;

import model.Impressora;
import model.exceptions.ImpressoraException;

public class ValidateImpressora {

    public Impressora validaCamposEntrada(String nomeImpressora, String numeroDeSerie) {
        Impressora impressora = new Impressora();
        if (nomeImpressora.isEmpty()) {
            throw new ImpressoraException("Error - Campo vazio: 'nome'.");
        }
        impressora.setNomeImpressora(nomeImpressora);
        if (numeroDeSerie.isEmpty()) {
            throw new ImpressoraException("Error - Campo vazio: 'numero de serie'.");
        }
        impressora.setNumeroDeSerie(numeroDeSerie);

        return impressora;
    }
}
