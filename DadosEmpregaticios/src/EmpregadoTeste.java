
/**
 *Lista 2, Questão 4
 *Professor: Aldo Henrique
 *Disciplina: LPOO
 *
 * @author Jorge
 */
public class EmpregadoTeste {

    public static void main(String[] args) {

        Empregado emp1 = new Empregado("João", "Braga", 1272 * 12);
        Empregado emp2 = new Empregado("Jorge", "Braga", 998 * 12);

        System.out.printf("Salário anual do Empregado 1 : %.2f%n", emp1.getSalario());
        System.out.printf("Salário anual do Empregado 2 : %.2f%n", emp2.getSalario());

        emp1.setSalario(emp1.getSalario() * 1.1);
        emp2.setSalario(emp2.getSalario() * 1.1);

        System.out.printf("Salário anual do Empregado 1 com 10 porcento de aumento: %.2f%n", emp1.getSalario());
        System.out.printf("Salário anual do Empregado 2 com 10 porcento de aumento: %.2f%n", emp2.getSalario());
    }
}
