package operacaobancaria;

import java.util.Scanner;

/**
 * Lista 2, Questão 1 
 * Professor: Aldo Henrique 
 * Disciplina: LPOO
 * @author Jorge
 */
public class OperacaoBancaria {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        conta c1 = new conta();
        System.out.println("Entre com o número da conta");
        int n = ler.nextInt();
        c1.colocarNumConta(n);
        c1.depositar(10);
        c1.imprimeSaldo();
        System.out.println("Digite o valor a ser depositado");
        float s = ler.nextFloat();
        c1.depositar(s);
        c1.imprimeSaldo();
    }
}
