import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Servico> servicos = new ArrayList<>();
    private static int contadorOrcamento = 1;
    private static List<Orcamento> orcamentos = new ArrayList<>();

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
                    cadastrarClienteEVeiculo();
                    break;
                case 2:
                    cadastrarServico();
                    break;
                case 3:
                    criarOrcamento();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void cadastrarClienteEVeiculo() {

        System.out.print("Nome do Cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Placa do Veículo: ");
        String placa = scanner.nextLine();
        System.out.print("Marca do Veículo: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo do Veículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ano do Veículo: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        Veiculo veiculo = new Veiculo(placa, marca, modelo, ano);
        Cliente cliente = new Cliente(nome, telefone, veiculo);
        clientes.add(cliente);
        System.out.println("Cliente e veículo cadastrados com sucesso!");
    }

    private static void cadastrarServico() {
        System.out.print("Nome do Serviço: ");
        String nome = scanner.nextLine();
        System.out.print("Preço do Serviço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); 
    
        Servico servico = new Servico(contadorOrcamento, nome, preco);
        servicos.add(servico);
        System.out.println("Serviço cadastrado com sucesso!");
    }

    private static void criarOrcamento() {
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
        Orcamento orcamento = new Orcamento(contadorOrcamento++, cliente);
    
        System.out.println("Serviços disponíveis:");
        for (int i = 0; i < servicos.size(); i++) {
            System.out.println((i + 1) + ". " + servicos.get(i).getNome() + " - R$ " + servicos.get(i).getPreco());
        }
    
        while (true) {
            System.out.print("Escolha o serviço pelo número (0 para finalizar): ");
            int indiceServico = scanner.nextInt() - 1;
            scanner.nextLine(); // Consumir quebra de linha
    
            if (indiceServico == -1) break;
    
            if (indiceServico < 0 || indiceServico >= servicos.size()) {
                System.out.println("Opção inválida!");
            } else {
                orcamento.adicionarServico(servicos.get(indiceServico));
                System.out.println("Serviço adicionado ao orçamento.");
            }
        }
    
        orcamentos.add(orcamento); 
        System.out.println("\nOrçamento criado com sucesso!");
        orcamento.exibir(); 
    }
    
}
