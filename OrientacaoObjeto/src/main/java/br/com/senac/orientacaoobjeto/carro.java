/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.orientacaoobjeto;

/**
 *
 * @author geovanna62993406
 */
public class carro {
    String cor;
    String modelo;
    double velocidade;
    //MODELO E VELOCIDADE
    public static void main (String[] args){
    //modelo cor e velocidade
    String modelo1 = "bmw";
    String cor1 = "azul";
    double velocidade1 = 170.00;
    
    String modelo2 = "byd";
    String cor2 = "preto";
    double velocidade2 = 150.00;
    
    System.out.println (modelo1);
    System.out.println (cor1);
    System.out.println (velocidade1);    

        carro carroGeovanna = new carro ();
        
        carroGeovanna.cor = "azul";
        carroGeovanna.modelo = "bmw";
        carroGeovanna.velocidade = 0;
         
        carro carro2 = new carro ();
        carro2.cor = "preta";
        carro2.modelo = "byd";
        carro2.velocidade = 0;
        
      
      }
  
}
