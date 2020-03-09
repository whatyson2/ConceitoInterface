/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

/**
 *
 * @author whaty
 */
public class Atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Vendedor novo = new Vendedor("Carol", 0.03, 15000);
    novo.salario();
    novo.decimoTerceiro();
    
    Supervisor novo2 = new Supervisor("Joana");
    novo2.salario();
    novo2.decimoTerceiro();
    }
    
}
