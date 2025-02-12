import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GestorServicos {
    private static List<Servico> servicos = new ArrayList<>();

    public static void cadastrarServico(Scanner scanner) {
        System.out.print("Nome do Serviço: ");
        String nome = scanner.nextLine();

        double preco = 0.0;
        while (true) {
            System.out.print("Preço do Serviço: ");
            try {
                preco = scanner.nextDouble();
                scanner.nextLine(); // Consumir quebra de linha
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.nextLine(); // Limpar entrada inválida
            }
        }

        Servico servico = new Servico(servicos.size() + 1, nome, preco);
        servicos.add(servico);
        System.out.println("Serviço cadastrado com sucesso!");
    }

    public static List<Servico> getServicos() {
        return servicos;
    }
}