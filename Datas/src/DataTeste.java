
/**
 *Lista 2, Questão 5
 *Professor: Aldo Henrique
 *Disciplina: LPOO
 *
 * @author Jorge
 */
public class DataTeste {

    public static void main(String[] args) {
        Data nascimento = new Data(9, 8, 1984);
        Data hoje = new Data(20, 5, 2019);

        System.out.println("Nasci em:");
        nascimento.exibeData();
        System.out.println("\nEste código foi escrito em:");
        hoje.exibeData();
    }
}
