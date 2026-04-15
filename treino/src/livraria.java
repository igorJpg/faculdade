import java.util.ArrayList;
import java.util.Scanner;
import livrospack.Livro;

class Biblioteca {


    static void listarLivros(ArrayList<livrospack.Livro> livros) {
        System.out.println("=== BIBLIOTECA ===");
        for (int i = 0; i < livros.size(); i++) {
            Livro l = livros.get(i);
            String status = l.disponivel ? "Disponível" : "Emprestado"; // if resumido
            System.out.println((i + 1) + " - " + l.titulo + " | " + l.autor + " | " + status);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();


        livros.add(new Livro("Clean Code", "Robert C. Martin"));
        livros.add(new Livro("O Programador Pragmatico", "Andrew Hunt"));
        livros.add(new Livro("Entendendo Algoritmos", "Aditya Bhargava"));

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("(1) Ver livros  (2) Emprestar  (3) Devolver  (4) Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> listarLivros(livros); // só lista de novo

                case 2 -> {
                    System.out.println("Digite o número do livro:");
                    int escolha = input.nextInt() - 1;
                    Livro livro = livros.get(escolha);
                    if (livro.disponivel) {
                        livro.disponivel = false; //
                        System.out.println("\"" + livro.titulo + "\" emprestado com sucesso!");
                    } else {
                        System.out.println("Este livro já está emprestado!");
                    }
                }

                case 3 -> {
                    System.out.println("Digite o número do livro:");
                    int escolha = input.nextInt() - 1;
                    Livro livro = livros.get(escolha);
                    if (!livro.disponivel) {
                        livro.disponivel = true;
                        System.out.println("\"" + livro.titulo + "\" devolvido com sucesso!");
                    } else {
                        System.out.println("Este livro não está emprestado!");
                    }
                }

                case 4 -> System.out.println("Saindo... Até logo!");

                default -> System.out.println("Opção inválida!");
            }
        }


    }
}