import java.util.Scanner;

public class Repti {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contador = 0;
        int somaMedia = 0;
        int notas[] = new int[3];
        String[] ordem = {"primeira", "segunda", "terceira"};

        System.out.println("Informe o seu nome");
        String nome = ler.next();


        do {
            System.out.println("Resultado da " + ordem[contador] + " prova: ");
            notas[contador] = ler.nextInt();

            somaMedia += notas[contador];

            contador++;
        } while (contador < 3);

        System.out.println("Suas notas:");
        System.out.println("primeira prova: " + notas[0]);
        System.out.println("segunda prova:  " + notas[1]);
        System.out.println("terceira prova: " + notas[2]);


        System.out.println(contador);
        double media = (double) somaMedia / 3;
        System.out.println("sua media da etapa foi: " + media);
        if (media >= 6) {
            System.out.println( nome + " passou");
        } else {
            System.out.println( nome + " nao passou");
        }


    }
}

