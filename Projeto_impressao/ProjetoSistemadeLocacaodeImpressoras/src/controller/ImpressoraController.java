
package controller;

import javax.swing.JTable;
import model.Impressora;
import model.dao.ImpressoraDAO;
import model.exceptions.ImpressoraException;
import model.valid.ValidateImpressora;


public class ImpressoraController {
    
     private ImpressoraDAO repositorio;

    public ImpressoraController() {
        repositorio = new ImpressoraDAO();
    }

    public boolean cadastrarImpressora(String nomeImpressora, String numeroDeSerie) {
        ValidateImpressora valid = new ValidateImpressora();
        Impressora novoImpressora = valid.validaCamposEntrada(nomeImpressora, numeroDeSerie);

        if (repositorio.findByNumeroDeSerie(numeroDeSerie) == null) {
            return repositorio.save(novoImpressora);
        } else {
            throw new ImpressoraException("Error - Já existe uma impressora com este 'Numero de serie'.");
        }
    }

    public void atualizarImpressora(String nomeImpressora, String numeroDeSerie) {
        ValidateImpressora valid = new ValidateImpressora();
        Impressora novoimpressora = valid.validaCamposEntrada(nomeImpressora, numeroDeSerie);
        repositorio.update(numeroDeSerie, novoimpressora);
    }

    public Impressora buscarAluno(String numeroDeSerie) {
        return this.repositorio.findByNumeroDeSerie(numeroDeSerie);
    }

    public void atualizarTabela(JTable grd) {
        Util.jTableShow(grd, new TMCadImpressora(repositorio.findAll()), null);
    }

    public void excluirImpressora(String numeroDeSerie) {
       
        
        Impressora impressora = repositorio.findByNumeroDeSerie(numeroDeSerie);
        if (impressora != null) {
            repositorio.delete(impressora);
        } else {
            throw new ImpressoraException("Error - Aluno inexistente.");
        }
    }    
    
}
