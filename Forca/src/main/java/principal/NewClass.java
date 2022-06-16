/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class NewClass {

    int aleatorio;
    private ArrayList<String> variavel;
    private String palavra;

    public String getPalavra() {
        return palavra;
    }

    public String sortearPalavras() {
        Path local = Paths.get("src/palavras.txt");
        try {
            variavel = new ArrayList<>(Files.readAllLines(local));
            SecureRandom random = new SecureRandom();
            int sorteador = random.nextInt(94);
            palavra = variavel.get(sorteador);
        } catch (Exception notFound) {
            System.out.println("Não foi encontrado arquivo");
            //olhar
        }
        return palavra;
    }
    
}
