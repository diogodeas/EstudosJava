/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author diogo
 */
public class Forca {

    private String[] letrasSeparadas = new String[7];
    private String[] letraAuxiliar = new String[7];
    private String palavra;

    NewClass classe = new NewClass();

    public String[] getLetrasSeparadas() {
        return letrasSeparadas;
    }

    public void setLetrasSeparadas(String[] letrasSeparadas) {
        this.letrasSeparadas = letrasSeparadas;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void inicializa() {
        palavra = classe.sortearPalavras();
    }
}
