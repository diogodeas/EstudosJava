/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class JogoDaVelha {
    private String [][] tabuleiro;
    int contador1;
    public JogoDaVelha(){
        this.tabuleiro = new String [3][3];
    }
    public void Jogar(){
        
    }
    
    public void verificarVencedor(javax.swing.JTextField[][] variavel) {
        int i, j, contador = 0;
            
        contador1++;
        try{
            for(i=0; i<3; i++){
                for(j=0; j<3; j++){
                    if(variavel[i][j].getText().compareTo("")!=0){
                        //verifica linha
                        if(variavel[i][j].getText().compareTo(variavel[i][j+1].getText())==0 && 
                        variavel[i][j].getText().compareTo(variavel[i][j+2].getText())==0) {
                            JOptionPane.showMessageDialog(null, "Jogador "+ variavel[i][j].getText() + " ganhou!");
                            contador++;
                            return;
                        } 
                        //verifica coluna
                        if(variavel[i][j].getText().compareTo(variavel[i+1][j].getText())==0 && 
                        variavel[i][j].getText().compareTo(variavel[i+2][j].getText())==0) {
                            JOptionPane.showMessageDialog(null, "Jogador "+ variavel[i][j].getText() + " ganhou!");
                            contador++;
                        }
                        //diagonal principal
                        if(variavel[i][j].getText().compareTo(variavel[i+1][j+1].getText())==0 && 
                        variavel[i][j].getText().compareTo(variavel[i+2][j+2].getText())==0) {
                            JOptionPane.showMessageDialog(null, "Jogador "+ variavel[i][j].getText() + " ganhou!");
                            contador++;
                        }
                        //diagonal secundária
                        if(variavel[i][j+2].getText().compareTo(variavel[i+1][j+1].getText())==0 && 
                        variavel[i][j+2].getText().compareTo(variavel[i+2][j].getText())==0 && variavel[i][j+2].getText().compareTo("")!=0) {
                            JOptionPane.showMessageDialog(null, "Jogador "+ variavel[i+1][j+1].getText() + " ganhou!");
                            contador++;
                        }
                        //deu velha
                        System.out.println ("valor do contador: "+contador);
                        System.out.println("valor da ocupação nos espaços: "+ contador1);
                        if(contador1 == 9 && contador == 0){
                             JOptionPane.showMessageDialog(null, "Deu velha!");
                        }  
                    }
                }
            }
        }catch(ArrayIndexOutOfBoundsException exception){
            /*Tratar excessão em relação
            ao extrapolar o tamanho da matriz de 
            Textfield;
            */
            
        }
    }
} 
   