/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacaobancaria;

/**
 *
 * @author JORGE
 */
public class conta {
    //atributos (apenas variáveis)
    private int numConta;
    private int agencia;
    private int tipo;
    private float saldo;
    //métodos (acções)
    public void depositar(float valorDeposito){
        saldo = saldo+valorDeposito;
    
}
   public void sacar (float valorSaque){
       
   } 
   public void imprimeSaldo(){
       System.out.println("O saldo é "+ saldo);
       
}
   public void colocarNumConta(int num){
       numConta = num;
   }
   public int pegarNumConta(){
       return numConta;
   }
  
}

