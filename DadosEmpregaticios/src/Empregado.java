
/**
 *Lista 2, Questão 4
 *Professor: Aldo Henrique
 *Disciplina: LPOO
 *
 * @author Jorge
 */
public class Empregado {

    private String primeiroNome;
    private String ultimoNome;
    private double salario;

    public Empregado(String primeiroNome, String ultimoNome, double salario) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        if (salario >= 0.0) {
            this.salario = salario;
        }
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setUltimoNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setLastName(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
