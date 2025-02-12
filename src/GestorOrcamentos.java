import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GestorOrcamentos {
    private static List<Orcamento> orcamentos = new ArrayList<>();

    public static void criarOrcamento(Scanner scanner) {
        List<Cliente> clientes = GestorClientes.getClientes();
        List<Servico> servicos = GestorServicos.getServicos();

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado. Cadastre um cliente primeiro!");
            return;
        }
        if (servicos.isEmpty()) {
            System.out.println("Nenhum serviço cadastrado. Cadastre um serviço primeiro!");
            return;
        }

        System.out.println("Clientes disponíveis:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNome());
        }
        System.out.print("Escolha o cliente pelo número: ");
        int indiceCliente = scanner.nextInt() - 1;
        scanner.nextLine(); // Consumir quebra de linha

        if (indiceCliente < 0 || indiceCliente >= clientes.size()) {
            System.out.println("Opção inválida!");
            return;
        }

        Cliente cliente = clientes.get(indiceCliente);
        Orcamento orcamento = new Orcamento(orcamentos.size() + 1, cliente, new ArrayList<>());

        System.out.println("Serviços disponíveis:");
        for (int i = 0; i < servicos.size(); i++) {
            System.out.println((i + 1) + ". " + servicos.get(i).getNome() + " - R$ " + servicos.get(i).getPreco());
        }

        while (true) {
            System.out.print("Escolha o serviço pelo número (0 para finalizar): ");
            try {
                int indiceServico = scanner.nextInt() - 1;
                scanner.nextLine(); // Consumir quebra de linha

                if (indiceServico == -1) break;

                if (indiceServico < 0 || indiceServico >= servicos.size()) {
                    System.out.println("Opção inválida!");
                } else {
                    orcamento.adicionarServico(servicos.get(indiceServico));
                    System.out.println("Serviço adicionado ao orçamento.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.nextLine(); // Limpar entrada inválida
            }
        }

        orcamentos.add(orcamento);
        System.out.println("\nOrçamento criado com sucesso!");
        orcamento.exibir();
    }

    public static List<Orcamento> getOrcamentos() {
        return orcamentos;
    }
}