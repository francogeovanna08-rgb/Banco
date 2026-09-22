/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author geovanna62993406
 */
public class contaBancaria {
  private double saldo;
  private String titular; 
  
  public contaBancaria (String titular){
      this.titular = titular;
      this.saldo = 00.00;
  }
  public void depositar (double valor){
     this.saldo = 
     this.saldo + valor;
     
    }    
  public String getTitular(){
    return this.titular;
  }
    public double getSaldo(){
       return this.saldo;
    }   
    public void setTitular (String titular){
        this.titular = titular;
    }
      public void sacar (double valor){
        if (valor > 0 && valor <= this.saldo){
         this.saldo = this.saldo - valor;
     }else{   
     System.out.println("saque nao permitido!!!");
 }         
}
  public void extratoBancario (){
System.out.println("saldo: " + this.saldo);
}
}
