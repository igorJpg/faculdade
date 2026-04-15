import java.util.Scanner;

class Bancopronto {

    static class ContaBancaria {
        String titular;
        double saldo;

        public ContaBancaria(String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        public void depositar(double valor) {
            this.saldo += valor;
            System.out.println("R$ " + valor + " depositado com sucesso!");
        }

        public void sacar(double valor) {
            if (valor > saldo) {
                System.out.println("Saldo insuficiente!");
            } else {
                this.saldo -= valor;
                System.out.println("R$ " + valor + " sacado com sucesso!");
            }
        }

        public void exibirSaldo() {
            System.out.println("Titular: " + titular + " | Saldo: R$ " + saldo);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Qual o saldo inicial? ");
        double saldoInicial = input.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, saldoInicial);

        System.out.println("=============================");
        conta.exibirSaldo();
        System.out.println("(1) Depositar  (2) Sacar");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.print("Quanto deseja depositar? ");
                double deposito = input.nextDouble();
                conta.depositar(deposito);
            }
            case 2 -> {
                System.out.print("Quanto deseja sacar? ");
                double saque = input.nextDouble();
                conta.sacar(saque);
            }
            default -> System.out.println("Opção inválida!");
        }

        conta.exibirSaldo();
        input.close();
    }
}
