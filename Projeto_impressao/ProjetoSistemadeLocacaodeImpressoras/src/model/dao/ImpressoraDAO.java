package model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Impressora;
import model.exceptions.ImpressoraException;
import view.FrImpressora;

public class ImpressoraDAO extends DAO {

    private List<Impressora> lst;

    public ImpressoraDAO() {
        super("ListagemImpressoras.csv");
        this.lst = new ArrayList<>();
    }

    public boolean save(Impressora impressora) {
        this.lst.add(impressora);

        String texto = this.lstImpressoraToCSV();

        super.save(texto);
        return true;
    }

    public Impressora findByNumeroDeSerie(String numeroDeSerie) {

        for (Impressora imp : this.lst) {
            if (imp.getNumeroDeSerie().equals(numeroDeSerie)) {
                return imp;
            }
        }

        return null;
    }

    @Override
    public Object find(Object obj) {
        Impressora impressora = (Impressora) obj;

        for (Impressora imp : this.lst) {
            if (imp.equals(impressora)) {
                return imp;
            }
        }

        return null;
    }

    @Override
    public boolean delete(Object obj) {

        Impressora impressoraProcurada = (Impressora) obj;

        for (int i = 0; i <= this.lst.size() - 1; i++) {
            Impressora imp = this.lst.get(i);
            if (imp.getNumeroDeSerie().equals(impressoraProcurada.getNumeroDeSerie())) {
                this.lst.remove(i);

                String texto = this.lstImpressoraToCSV();
                super.save(texto);
                return true;
            }
        }

        return false;
    }

    public void update(String numeroDeSerieOriginal, Impressora novoImpressora) {
        Impressora impressoraOriginal = (Impressora) this.findByNumeroDeSerie(numeroDeSerieOriginal);
        if (impressoraOriginal == null) {
            throw new ImpressoraException("Error update - Impressora inexistente.");
        }

        impressoraOriginal.copy(novoImpressora);

        String texto = this.lstImpressoraToCSV();
        super.save(texto);
    }

    public List<Impressora> findAll() {
        this.lst = loadArquivo();

        if (this.lst == null) {
            return new ArrayList<Impressora>();
        } else {
            return this.lst;
        }
    }

    private String lstImpressoraToCSV() {
        String texto = "";
        Impressora imp = new Impressora();
        texto = imp.cabecalho();

        for (Impressora impressora : this.lst) {
            texto = texto + impressora.atributoToCSV();
        }

        return texto;
    }

    private List<Impressora> loadArquivo() {
        FileReader f = null;
        try {
            f = new FileReader(this.pathArquivo);//"ListagemProfessores.csv");
            Scanner arquivoLido = new Scanner(f);
            arquivoLido.useDelimiter("\n");

            List<Impressora> lista = new ArrayList<>();
            String linhaLida = arquivoLido.next();
            while (arquivoLido.hasNext()) {
                linhaLida = arquivoLido.next();

                Impressora impressora = new Impressora();
                impressora.CSVToAtributo(linhaLida);
                lista.add(impressora);
            }
            return lista;
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrImpressora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(FrImpressora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
