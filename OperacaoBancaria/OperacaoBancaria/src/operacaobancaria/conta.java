package operacaobancaria;

/**
 * Lista 2, Questão 1 
 * Professor: Aldo Henrique 
 * Disciplina: LPOO
 *@author Jorge
 */
public class conta {

    //atributos (apenas variáveis)
    private int numConta;
    private int agencia;
    private int tipo;
    private float saldo;

    //métodos (ações)
    public void depositar(float valorDeposito) {
        saldo = saldo + valorDeposito;

    }

    public void sacar(float valorSaque) {

    }

    public void imprimeSaldo() {
        System.out.println("Seu saldo é " + saldo);

    }

    public void colocarNumConta(int num) {
        numConta = num;
    }

    public int pegarNumConta() {
        return numConta;
    }

}
