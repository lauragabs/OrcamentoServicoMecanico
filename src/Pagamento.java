public class Pagamento {

    private Orcamento orcamento;
    private String formaPagamento; 

    public Pagamento(Orcamento orcamento, String formaPagamento) {
        this.orcamento = orcamento;
        this.formaPagamento = formaPagamento;
    }

    public void processarPagamento() {
        System.out.println("Pagamento de R$ " + orcamento.getTotal() + " realizado via " + formaPagamento);
    }

}
