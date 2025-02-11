import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private int id;
    private Cliente cliente;
    private List<Servico> servicos;
    private double total;

    public Orcamento(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.servicos = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
        total += servico.getPreco();
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orçamento #").append(id).append("\n");
        sb.append("Cliente: ").append(cliente.getNome()).append(" | Telefone: ").append(cliente.getTelefone()).append("\n");
        sb.append("Veículo: ").append(cliente.getVeiculo().getMarca()).append(" ")
          .append(cliente.getVeiculo().getModelo()).append(" | Ano: ").append(cliente.getVeiculo().getAno())
          .append(" | Placa: ").append(cliente.getVeiculo().getPlaca()).append("\n");
        sb.append("Serviços:\n");
        for (Servico s : servicos) {
            sb.append("- ").append(s.getNome()).append(" | Preço: R$ ").append(s.getPreco()).append("\n");
        }
        sb.append("Total: R$ ").append(total).append("\n");
        return sb.toString();
    }

}
