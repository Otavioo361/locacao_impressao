package model;

public class Impressora {

    private String nomeImpressora;
    private String numeroDeSerie;

    public void Impressora() {
        this.setNomeImpressora(" ");
        this.setNumeroDeSerie(" ");
    }

    public void copy(Impressora other) {
        this.nomeImpressora = other.getNomeImpressora();
        this.numeroDeSerie = other.getNumeroDeSerie();
    }

    @Override
    public String toString() {
        String txt = "---- Dados da Impressora ------\n"
                + " Nome da Impressora: " + this.nomeImpressora + "\n"
                + " Número de Série: " + this.numeroDeSerie + "\n"
                + "-------------------------------------\n";

        return txt;
    }
    public void CSVToAtributo(String csv){
        String vetor[] = csv.split(";");
        
        this.nomeImpressora = vetor[0];
        this.numeroDeSerie = vetor[1];

    }
    public String cabecalho() {
        return "Nome da Impressora;Numero de Serie\n";
    }

    public String atributoToCSV() {
        String aux = this.nomeImpressora + ";"
                + this.numeroDeSerie + ";";
 
        return aux;
    }

    public String getNomeImpressora() {
        return nomeImpressora;
    }

    public void setNomeImpressora(String nomeImpresora) {
        this.nomeImpressora = nomeImpressora;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

}
