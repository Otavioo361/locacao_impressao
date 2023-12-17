/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_impressora.controller;

import com.ifmg.projeto_impressora.model.Fornecedor;
import com.ifmg.projeto_impressora.model.Local;
import com.ifmg.projeto_impressora.model.Tecnico;
import com.ifmg.projeto_impressora.model.Impressora;
import com.ifmg.projeto_impressora.model.ImpressoraServico;
import com.ifmg.projeto_impressora.model.Proprietario;
import com.ifmg.projeto_impressora.model.ServicoAdicional;
import com.ifmg.projeto_impressora.model.LtdCons;
import com.ifmg.projeto_impressora.model.dao.ImpressoraDAO;
import com.ifmg.projeto_impressora.model.exceptions.ImpressoraException;
import com.ifmg.projeto_impressora.model.valid.ValidateImpressora;
import com.ifmg.projeto_impressora.model.valid.ValidateQtdImpServico;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Otavio
 */
public class ImpressoraController {

    private ImpressoraDAO repositorio;

    public ImpressoraController() {
        this.repositorio = new ImpressoraDAO();
    }

    private Integer getIdDoidNome(String idNome) {
        if (idNome.equals("")) {
            return null;
        }
        String[] novoIdNome = idNome.split(" - ");
        return Integer.parseInt(novoIdNome[0]);
    }

    public void relacionarImpressoraFornecedor(String impressora, String fornecedor) {
        Integer idImpressora = getIdDoidNome(impressora);
        Integer idFornecedor = getIdDoidNome(fornecedor);

        Impressora impressoraO = this.buscarProprietarioPorId(idImpressora);

        FornecedorController fornecedorController = new FornecedorController();
        Fornecedor fornecedorO = fornecedorController.buscarProprietarioPorId(idFornecedor);

        if (!impressoraO.getFornecedor().contains(fornecedorO)) {
            impressoraO.getFornecedor().add(fornecedorO);
            repositorio.save(impressoraO);
        }
    }

    public void relacionarImpressoraServico(String impressora, String servico, String quantidade) {
        Integer idImpressora = getIdDoidNome(impressora);
        Integer idServico = getIdDoidNome(servico);

        ValidateQtdImpServico valid = new ValidateQtdImpServico();

        Integer quantidadeInt = valid.validaQuantidade(quantidade);

        Impressora impressoraO = this.buscarProprietarioPorId(idImpressora);

        ServicoAdicionalController servicoController = new ServicoAdicionalController();
        ServicoAdicional servicoO = servicoController.buscarServicoAdicionalPorId(idServico);

        ImpressoraServico impressoraServico = new ImpressoraServico();

        impressoraServico.setImpressora(impressoraO);
        impressoraServico.setServicoAdicional(servicoO);
        impressoraServico.setQtd(quantidadeInt);

        impressoraO.getImpressoraServico().add(impressoraServico);

        repositorio.save(impressoraO);
    }

    public Impressora buscarProprietarioPorId(Integer id) {
        if (id == null) {
            return null;
        }
        Impressora impressora = (Impressora) repositorio.find(id);
        return impressora;
    }

    public void cadastrarImpressora(String nome, 
            String marca, String dataFabricacao, String prop, String ltdCons,
            String local, String tecnico) {

        System.out.println("ENTROU NO CADASTRAR");

        Integer idProprietario = getIdDoidNome(String.valueOf(prop));
        Integer idTecnico = getIdDoidNome(String.valueOf(tecnico));
        Integer idLocal = null;
        if (!String.valueOf(local).equals("")) {
            idLocal = Integer.parseInt(String.valueOf(local));
        }
        Integer idLtdCons = getIdDoidNome(String.valueOf(ltdCons));

        ProprietarioController propC = new ProprietarioController();
        RelatorioController tecC = new RelatorioController();
        LocalController localC = new LocalController();
        LtdConsController ltdC = new LtdConsController();
        

        Proprietario propO = propC.buscarProprietarioPorId(idProprietario);
        LtdCons ltdO = ltdC.buscarLtdConsPorId(idLtdCons);
        Local localO = localC.buscarLocalPorId(idLocal);
        Tecnico tecO = tecC.buscarTecnicoPorId(idTecnico);

        ValidateImpressora valid = new ValidateImpressora();
        Impressora novoImpressora = valid.validaCamposEntrada(nome,marca, dataFabricacao, propO, ltdO, localO, tecO);

        repositorio.save(novoImpressora);
    }

    public void atualizarImpressora(int idImpressora, String nome,
            String marca, String dataFabricacao, String prop, String ltd,
            String local, String tecnico) {

        System.out.println("ENTROU NO ATUALIZAR");

        Integer idProprietario = getIdDoidNome(String.valueOf(prop));
        Integer idTecnico = getIdDoidNome(String.valueOf(tecnico));
        Integer idLocal = null;
        if (!String.valueOf(local).equals("")) {
            idLocal = Integer.parseInt(String.valueOf(local));
        }
        Integer idLtd = getIdDoidNome(String.valueOf(ltd));

        ProprietarioController propC = new ProprietarioController();
        RelatorioController TecC = new RelatorioController();
        LocalController localC = new LocalController();
        LtdConsController ltdC = new LtdConsController();
        
        

        Proprietario propO = propC.buscarProprietarioPorId(idProprietario);
        LtdCons vetO = ltdC.buscarLtdConsPorId(idLtd);
        Local baiaO = localC.buscarLocalPorId(idLocal);
        Tecnico tecO = TecC.buscarTecnicoPorId(idTecnico);

        ValidateImpressora valid = new ValidateImpressora();
        Impressora novoImpressora = valid.validaCamposEntrada(nome, 
                marca, dataFabricacao, propO, vetO, baiaO, tecO);

        novoImpressora.setId(idImpressora);
        repositorio.save(novoImpressora);
    }

    public void atualizarTabela(JTable grd) {
        Util.jTableShow(grd, new TMCadImpressora(repositorio.findAll()), null);
    }

    public void atualizarTabelaRelacionamentos(JTable grd) {
        Util.jTableShow(grd, new TMShowRelacaoimpForn(repositorio.getLeftJoinFornecedor()), null);
    }

    public void atualizarTabelaRelacionamentosServicos(JTable grd) {
        Util.jTableShow(grd, new TMShowRelacaoimpServico(repositorio.getLeftJoinServicoAdicional()), null);
    }

    public void excluirRelacionamentoAlimentos(Integer impressora_id, Integer fornecedor_id) {
        if (impressora_id != null && fornecedor_id != null) {
            repositorio.deleteRelacionamentoFornecedor(impressora_id, fornecedor_id);            

        } else {
            throw new ImpressoraException("Error: Relacionamento inexistente.");
        }
    }

    public void excluirRelacionamentoServicos(Integer impressora_id, Integer servico_id) {
        if (impressora_id != null && servico_id != null) {
            repositorio.deleteRelacionamentoServicos(impressora_id, servico_id);
            Impressora equinoO = this.buscarProprietarioPorId(impressora_id);
            equinoO.getImpressoraServico().clear();

        } else {
            throw new ImpressoraException("Error: Relacionamento inexistente.");
        }
    }

    public void excluirEquino(Impressora equino) {
        if (equino != null) {
            repositorio.delete(equino);
        } else {
            throw new ImpressoraException("Error: Equino inexistente.");
        }
    }
}
