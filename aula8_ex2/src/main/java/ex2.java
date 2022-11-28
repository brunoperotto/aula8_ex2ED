/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author T-Gamer
 */
public class ex2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Pilha pilha = new Pilha();
    String n,c;
    
    n = JOptionPane.showInputDialog("Informe uma palavra ou frase: ");
    c = JOptionPane.showInputDialog("Informe uma chave C: ");
    
    for(int i=0; i<n.length(); i++){
        String m = Character.toString(n.charAt(i));
            if(m.equalsIgnoreCase(c)){
                pilha.push(m);
                pilha.pop();
            }
            else{
                pilha.push(m);
            }
    }
    System.out.println("A porra da chave é: "+c);
    
    pilha.imprimir();
    }
}
