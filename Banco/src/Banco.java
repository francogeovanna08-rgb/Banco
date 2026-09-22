/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author geovanna62993406
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        contaBancaria contal = new contaBancaria ("Geovanna");
        
        contal.depositar(100.00);
        
         contal.extratoBancario();
         
          contal.sacar(0.5);
          
          contal.extratoBancario();
          
          System.out.println(contal.getTitular());
          System.out.println(contal.getSaldo());
          
         contal.setTitular("Geovanna");
         
          System.out.println(contal.getTitular());
    }
     }
