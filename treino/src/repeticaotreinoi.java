import java.util.Scanner;
import java.util.ArrayList;
public class repeticaotreinoi {
    static void main(String[] args) {

        // variaveis
        int dia;
        int gastoDia;
        dia = 0;
        int total;
        total = 0;
        // variaveis

       ArrayList<String> contador1 = new ArrayList<>();
       contador1.add("segunda");
       contador1.add("terca");
       contador1.add("quarta");
       contador1.add("quinta");
       contador1.add("sexta");
       contador1.add("sabado");
       contador1.add("domingo");

        Scanner ler = new Scanner(System.in);
        System.out.println("qual é seu orçamento da semana? ");
        int gastoSeman = ler.nextInt();

        do {
            System.out.println("Quanto foi gasto na " + contador1.get(dia) + " ?");
            gastoDia = ler.nextInt();
            total += gastoDia;
            dia++;

        } while (dia != 7);

        System.out.println("O valor de seu orcamento da semana era de " + gastoSeman);
        System.out.println("pela semanas foi gasto: " + total);

        if  (total > gastoSeman && total == gastoSeman) {
            System.out.println("voce passou do seu orcamento");
        } else  {
            System.out.println("voce esta dentro do seu orcamento");
        }
        ler.close();
    }
}
