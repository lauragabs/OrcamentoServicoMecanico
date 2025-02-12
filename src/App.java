import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cadastrar Cliente e Veículo");
            System.out.println("2. Cadastrar Serviço");
            System.out.println("3. Criar Orçamento");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    GestorClientes.cadastrarClienteEVeiculo();
                    break;
                case 2:
                    GestorServicos.cadastrarServico();
                    break;
                case 3:
                    GestorOrcamentos.criarOrcamento();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }
}