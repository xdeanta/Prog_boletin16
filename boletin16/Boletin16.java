/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16;

/**
 *
 * @author xdeantabelisario
 */
public class Boletin16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IpuedeCantar can, tenor;
        can=new Canario();
        tenor=new Persona();
        can.cantar();
        tenor.cantar();
    }
    
}
