
import java.util.Scanner;

/**
 *Lista 2, Questão 3
 *Professor: Aldo Henrique
 *Disciplina: LPOO
 *@author Jorge
 */
public class FaturaTeste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digita o número: ");
        String num = scan.nextLine();
        System.out.println("Insira a descrição do produto: ");
        String desc = scan.nextLine();
        System.out.println("Quantidade de peças do pedido:");
        int quant = scan.nextInt();
        System.out.println("Valor unitário: ");
        double valor = scan.nextDouble();
        Fatura fat = new Fatura(quant, valor);
        fat.setNum(num);
        fat.setDesc(desc);
        System.out.println("Número: " + fat.getNum()
                + "\nDescrição: " + fat.getDescricao()
                + "\nQuantidade: " + fat.getQuant()
                + "\nValor: " + fat.getPreco());
        System.out.println();
        System.out.println("Valor total da fatura: " + fat.GetTotalFatura());
    }
}
