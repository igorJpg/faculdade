import java.util.Scanner;

public class bancoincompleto {

    public class Contabancaria {
        String titular;
        double saldo;

        public Contabancaria(String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        public void depositar(double saldo) {
            this.saldo += saldo;
        }

        public void sacar(double saldo) {
            this.saldo -= saldo;
        }

        public void exibirSaldo() {
            System.out.println(titular + " saldo: " + saldo);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("qual o seu saldo: ");
        int saldo = input.nextInt();

        System.out.println("=============================");
        int exibir = saldo;
        System.out.println("o seu saldo e: " + exibir);
        System.out.println("(1)-deseja depositar ou (2)-sacar");
        int opcao = input.nextInt();
       if  (opcao == 1) {
           System.out.println("quanto deseja depositar?");
           int deposita = input.nextInt();
           System.out.println(deposita + " depositado com sucesso");
           System.out.println(saldo + deposita);
       } else if (opcao == 2) {
           System.out.println("quanto deseja sacar?");
           int sacar = input.nextInt();
           System.out.println(saldo + sacar);
       }

    }
}
