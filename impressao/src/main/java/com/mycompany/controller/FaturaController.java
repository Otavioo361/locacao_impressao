/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.controller.tableModel.TMClienteFatura;
import com.mycompany.model.Cliente;
import com.mycompany.model.Fatura;
import com.mycompany.model.dao.ClienteDAO;
import com.mycompany.model.dao.FaturaDAO;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Otavio
 */
public class FaturaController {

    private FaturaDAO repositorio;
    private ClienteDAO repClient;

    public FaturaController() {
        this.repositorio = new FaturaDAO();
        this.repClient = new ClienteDAO();
    }
    
    public void atualizarTabelaFaturas(JTable grd, Integer id) {
        Util.jTableShow(grd, new TMClienteFatura(repositorio.findAll()), null);
    }
    
    public void atualizarFatura(Fatura fatura) {
        if(fatura.getFoiPaga() == null || fatura.getFoiPaga() == false){
            fatura.setFoiPaga(true);
        }else if(LocalDate.now().isBefore(fatura.getDiaMaxPagamento())
                && fatura.getFoiPaga() == true){
            fatura.setFoiPaga(null);
        }else{
            fatura.setFoiPaga(false);
        }        
        
        repositorio.save(fatura);
    }
    
    public void atualizaFaturaNaoPaga(){
        
        List<Fatura> faturas = repositorio.findAll();
        
        for (Fatura fatura : faturas) {
            if(LocalDate.now().isAfter(fatura.getDiaMaxPagamento())
                    && fatura.getFoiPaga() == null){
                fatura.setFoiPaga(false);
                repositorio.save(fatura);
            }
        }
        
    }

    public void criarFatura() {

        List<Cliente> clientes = repClient.findAll();

        for (Cliente cliente : clientes) {

            Integer cliente_id = cliente.getId();

            Integer diaFechaFatura = cliente.getLimiteFatura() + 1;

            if (diaFechaFatura == LocalDate.now().getDayOfMonth()) {

                boolean flag = true;
                for (Fatura fatura : cliente.getFaturas()) {
                    if (fatura.getCreate_at() != null && LocalDate.now().isEqual(fatura.getCreate_at())) {
                        flag = false;
                    }
                }                

                    Fatura fatura = new Fatura(null, totalFatura, cliente,
                            LocalDate.now().plusDays(30), LocalDate.now());

                    String msg = "Valor: " + fatura.getValor() + "\n"
                            + "Criação: " + fatura.getCreate_at() + "\n"
                            + "Vencimento: " + fatura.getDiaMaxPagamento() + "\n"
                            + "Cliente: " + fatura.getCliente().getCpf();                   

                    repositorio.save(fatura);
                }
            }

        }

    }

