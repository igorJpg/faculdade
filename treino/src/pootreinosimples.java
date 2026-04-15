import java.util.Scanner;
public class pootreinosimples {

    public static int soma(int a, int b){
        return a+b;

    }

    public String nome(String nome) {
        return nome;
    }


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int a = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = ler.nextInt();

        System.out.println("qual o seu nome?");
        String nome = ler.next();

        int resultado = soma(a,b);
        System.out.println("o valor encontrado por " + nome + " foi " + resultado);


    }

}
