/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.controller;

import com.ifmg.projeto_impressora.model.Fornecedor;
import com.ifmg.projeto_impressora.model.Impressora;
import com.ifmg.projeto_impressora.model.ImpressoraServico;
import com.ifmg.projeto_impressora.model.Fatura;
import com.ifmg.projeto_impressora.model.Proprietario;
import com.ifmg.projeto_impressora.model.dao.FaturaDAO;
import com.ifmg.projeto_impressora.model.dao.ProprietarioDAO;
import com.ifmg.projeto_impressora.model.email.FaturaEmail;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Otavio
 */
public class FaturaController {

    private FaturaDAO repositorio;
    private ProprietarioDAO repProp;

    public FaturaController() {
        this.repositorio = new FaturaDAO();
        this.repProp = new ProprietarioDAO();
    }

    public void atualizarTabelaFaturas(JTable grd, Integer id) {
        Util.jTableShow(grd, new TMProprietarioFatura(repositorio.findAll()), null);
    }

    public void atualizarFatura(Fatura fatura) {
        if (fatura.getFoiPaga() == null || fatura.getFoiPaga() == false) {
            fatura.setFoiPaga(true);
        } else if (LocalDate.now().isBefore(fatura.getDiaMaxPagamento())
                && fatura.getFoiPaga() == true) {
            fatura.setFoiPaga(null);
        } else {
            fatura.setFoiPaga(false);
        }

        repositorio.save(fatura);
    }

    public void atualizaFaturaNaoPaga() {

        List<Fatura> faturas = repositorio.findAll();

        for (Fatura fatura : faturas) {
            if (LocalDate.now().isAfter(fatura.getDiaMaxPagamento())
                    && fatura.getFoiPaga() == null) {
                fatura.setFoiPaga(false);
                repositorio.save(fatura);
            }
        }

    }

    public void criarFatura() {

        List<Proprietario> proprietarios = repProp.findAll();

        for (Proprietario proprietario : proprietarios) {

            Integer proprietario_id = proprietario.getId();

            Integer diaFechaFatura = proprietario.getLimiteFatura() + 1;

            if (diaFechaFatura == LocalDate.now().getDayOfMonth()) {

                boolean flag = true;
                for (Fatura fatura : proprietario.getFaturas()) {
                    if (fatura.getCreate_at() != null && LocalDate.now().isEqual(fatura.getCreate_at())) {
                        flag = false;
                    }
                }

                if (flag) {
                    LocalDate dataIni = LocalDate.now().minusDays(31);
                    LocalDate dataFim = LocalDate.now().plusDays(1);

                    System.out.println(dataIni);
                    System.out.println(dataFim);

                    Object[] totalFornecedor = repositorio.getTotalvalorFaturaFornecedorPorProprietario(
                            proprietario_id, dataIni, dataFim);
                    

                    Object[] totalServico = repositorio.getTotalvalorFaturaServicoPorProprietario(
                            proprietario_id, dataIni, dataFim);

                    Double totalFornecedorDouble = 0.0;
                    Double totalServicoDouble = 0.0;
                    if (totalFornecedor == null) {
                        totalFornecedorDouble = 0.0;
                    } else {
                        totalFornecedorDouble = (Double) totalFornecedor[2];
                    }

                    if (totalServico == null) {
                        totalServicoDouble = 0.0;
                    } else {
                        totalServicoDouble = (Double) totalServico[2];
                    }

                    Double totalFatura = totalFornecedorDouble + totalServicoDouble;

                    Fatura fatura = new Fatura(null, totalFatura, proprietario,
                            LocalDate.now().plusDays(30), LocalDate.now());

                    String msg = "Valor: " + fatura.getValor() + "\n"
                            + "Criação: " + fatura.getCreate_at() + "\n"
                            + "Vencimento: " + fatura.getDiaMaxPagamento() + "\n"
                            + "Proprietario: " + fatura.getProprietario().getCpf();

                    FaturaEmail faturaEmail = new FaturaEmail(
                            fatura.getProprietario().getEmail(), msg);

                    repositorio.save(fatura);
                }
            }

        }

    }
}
