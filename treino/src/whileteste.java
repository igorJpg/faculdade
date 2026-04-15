import java.util.Scanner;
public class whileteste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;


        int opcao;
        do {
            System.out.println("Qual livro deseja comprar");
            System.out.println("1- Aventura");
            System.out.println("2- Ficcao");
            System.out.println("3- Romance");
            System.out.println("0- Finalizar");
            opcao = ler.nextInt();

            if (opcao == 1) {
                contador1++;
            } else if (opcao == 2) {
                contador2++;
            } else if (opcao == 3) {
                contador3++;
            }


        } while (opcao != 0);

        if (contador1 > contador2 && contador1 > contador3) {
            System.out.println("Aventura");
        } else if (contador2 > contador1 && contador2 > contador3) {
            System.out.println("Ficcao");
        } else if (contador3 > contador1 && contador3 > contador2) {
            System.out.println("Romance");
        }


    }
}




