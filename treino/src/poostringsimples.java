import java.util.Scanner;
public class poostringsimples {
    public static class Pessoa {
        String nome;
        int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

    public void exibirpessoa() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
    }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        Pessoa P = new Pessoa(nome, idade);
        P.exibirpessoa();
    }


}
