import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GestorClientes {
    private static List<Cliente> clientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void cadastrarClienteEVeiculo() {
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
        int ano = 0;
        while (true) {
            System.out.print("Ano do Veículo: ");
            try {
                ano = scanner.nextInt();
                scanner.nextLine(); // Consumir quebra de linha
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.nextLine(); // Limpar entrada inválida
            }
        }

        Veiculo veiculo = new Veiculo(placa, marca, modelo, ano);
        Cliente cliente = new Cliente(nome, telefone, veiculo);
        clientes.add(cliente);
        System.out.println("Cliente e veículo cadastrados com sucesso!");
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }
}