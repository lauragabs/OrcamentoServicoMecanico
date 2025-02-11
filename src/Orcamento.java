import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private int id;
    private Cliente cliente;
    private List<Servico> servicos;
    private double total;
    private double desconto = 0.10;

    public Orcamento(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.servicos = new ArrayList<>();
        this.total = 0.0;
    }

    public Orcamento(int id, Cliente cliente, double desconto) {
        this.id = id;
        this.cliente = cliente;
        this.servicos = new ArrayList<>();
        this.total = 0.0;
        this.desconto = total * desconto;
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
        total += servico.getPreco();
    }

    public double getTotal() {
        return total * (1 - desconto);
    }

    public void exibir() {
        System.out.println("Orçamento #" + id);
        cliente.exibir();
        System.out.println("Serviços:");
        for (Servico s : servicos) {
            s.exibir();
        }
        System.out.println("Total sem desconto: R$ " + total);
        System.out.println("Total com desconto: R$ " + getTotal());
    }

}
