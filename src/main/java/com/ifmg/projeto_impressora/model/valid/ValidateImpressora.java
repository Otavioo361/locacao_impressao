/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.model.valid;

import com.ifmg.projeto_impressora.model.Local;
import com.ifmg.projeto_impressora.model.LtdCons;
import com.ifmg.projeto_impressora.model.Impressora;
import com.ifmg.projeto_impressora.model.Proprietario;
import com.ifmg.projeto_impressora.model.Tecnico;
import com.ifmg.projeto_impressora.model.exceptions.ImpressoraException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Otavio
 */
public class ValidateImpressora {
    public Impressora validaCamposEntrada(String nome, String Marca, 
            String dataFabricacao, Proprietario prop, LtdCons ltdcons,
            Local local, Tecnico tecnico) {

        Impressora impressora = new Impressora();

        if (nome.isEmpty()) {
            throw new ImpressoraException("Error - Campo vazio: 'nome'.");
        }
        impressora.setNome(nome);              
        impressora.getTecnico();
        if (dataFabricacao.isEmpty()) {
            throw new ImpressoraException("Error - Campo vazio: 'data de inicio de contrato'.");
        }

        impressora.setDataFabricacao(LocalDate.parse(dataFabricacao));

        impressora.setProprietario(prop);
        impressora.setLtdCons(ltdcons);
        impressora.setLocal(local);
        

        return impressora;
    }
}
