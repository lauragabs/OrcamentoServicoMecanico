public class Servico {
    
    private int id;
    private String nome;
    private double preco;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void exibir() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ").append(nome).append("| R$ ").append(preco).append("\n");
        System.out.println(sb.toString());
    }

    public Servico(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

}
