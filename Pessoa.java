public class Pessoa {
	private String nome;
	private String CPF;
	private Endereco endereco;
	Pessoa(String nome, String CPF, Endereco endereco) {
		this.nome = nome;
		this.CPF = CPF;
		this.endereco = endereco;
	}
	public void exibirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.CPF);
		this.endereco.exibirDados();
    }
}