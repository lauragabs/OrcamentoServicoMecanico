import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private int id;
    private Cliente cliente;
    private List<Servico> servicos;
    private double desconto = 0.10;

    public Orcamento(int id, Cliente cliente, List<Servico> servicos) {
        this.id = id;
        this.cliente = cliente;
        this.servicos = servicos != null ? servicos : new ArrayList<>();
    }

    public Orcamento(int id, Cliente cliente, List<Servico> servicos, double desconto) {
        this.id = id;
        this.cliente = cliente;
        this.servicos = servicos != null ? servicos : new ArrayList<>();
        this.desconto = desconto;
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public double calcularTotal() {
        double soma = 0;
        for (Servico s : servicos) {
            soma += s.getPreco();
        }
        return soma * (1 - desconto);
    }

    public void exibir() {
        System.out.println("Orçamento #" + id);
        cliente.exibir();
        System.out.println("Serviços:");
        for (Servico s : servicos) {
            s.exibir();
        }
        System.out.println("Total sem desconto: R$ " + calcularTotal() / (1 - desconto));
        System.out.println("Total com desconto: R$ " + calcularTotal());
    }
}