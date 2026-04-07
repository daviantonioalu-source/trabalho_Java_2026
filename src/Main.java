import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PilhaArray pilha = new PilhaArray(10);
        FilaArray fila = new FilaArray(10);

        int opcao = 0;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Pilha");
            System.out.println("2 - Fila");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            if (opcao == 1) {

                int opPilha = 0;

                do {
                    System.out.println("\n--- PILHA ---");
                    System.out.println("1 - Adicionar produto");
                    System.out.println("2 - Remover produto");
                    System.out.println("3 - Ver topo");
                    System.out.println("4 - Mostrar pilha");
                    System.out.println("5 - Voltar");
                    System.out.print("Escolha: ");

                    opPilha = sc.nextInt();

                    if (opPilha == 1) {
                        System.out.print("Código: ");
                        int codigo = sc.nextInt();

                        System.out.print("Descrição: ");
                        sc.nextLine(); // limpar
                        String descricao = sc.nextLine();

                        System.out.print("Preço: ");
                        double preco = sc.nextDouble();

                        System.out.print("Quantidade: ");
                        int qtd = sc.nextInt();

                        Produto p = new Produto(codigo, descricao, preco, qtd);
                        pilha.push(p);

                    } else if (opPilha == 2) {
                        Produto p = pilha.pop();
                        System.out.println("Removido: " + p);

                    } else if (opPilha == 3) {
                        System.out.println("Topo: " + pilha.peek());

                    } else if (opPilha == 4) {
                        pilha.display();

                    } else if (opPilha == 5) {
                        System.out.println("Voltando pro menu...");

                    } else {
                        System.out.println("Opção inválida");
                    }

                } while (opPilha != 5);

            } else if (opcao == 2) {

                int opFila = 0;

                do {
                    System.out.println("\n--- FILA ---");
                    System.out.println("1 - Adicionar produto");
                    System.out.println("2 - Chamar produto");
                    System.out.println("3 - Ver primeiro");
                    System.out.println("4 - Mostrar fila");
                    System.out.println("5 - Voltar");
                    System.out.print("Escolha: ");

                    opFila = sc.nextInt();

                    if (opFila == 1) {
                        System.out.print("Código: ");
                        int codigo = sc.nextInt();

                        System.out.print("Descrição: ");
                        sc.nextLine();
                        String descricao = sc.nextLine();

                        System.out.print("Preço: ");
                        double preco = sc.nextDouble();

                        System.out.print("Quantidade: ");
                        int qtd = sc.nextInt();

                        Produto p = new Produto(codigo, descricao, preco, qtd);
                        fila.enqueue(p);

                    } else if (opFila == 2) {
                        Produto p = fila.dequeue();
                        System.out.println("Chamando: " + p);

                    } else if (opFila == 3) {
                        System.out.println("Primeiro: " + fila.front());

                    } else if (opFila == 4) {
                        fila.display();

                    } else if (opFila == 5) {
                        System.out.println("Voltando pro menu...");

                    } else {
                        System.out.println("Opção inválida");
                    }

                } while (opFila != 5);

            } else if (opcao == 3) {
                System.out.println("Encerrando...");

            } else {
                System.out.println("Opção inválida, tenta de novo");
            }

        } while (opcao != 3);

        sc.close();
    }
}