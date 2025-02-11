public class Cliente {

    private String nome;
    private String telefone;
    private Veiculo veiculo;

    
    public Cliente(String nome, String telefone, Veiculo veiculo) {
        this.nome = nome;
        this.telefone = telefone;
        this.veiculo = veiculo;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", telefone=" + telefone + ", veiculo=" + veiculo + "]";
    }

}
