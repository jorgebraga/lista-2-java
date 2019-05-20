
/**
 *Lista 2, Questão 5
 *Professor: Aldo Henrique
 *Disciplina: LPOO
 *
 * @author Jorge
 */
public class Data {

    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void exibeData() {
        System.out.printf("%d/%d/%d\n",
                this.dia, this.mes, this.ano);
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
