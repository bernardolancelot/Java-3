public class Endereco {  
    private String tipo;
	private String nome;
	private int numero;
	private int apto;
	private String complemento;
	//Casa.
	public Endereco(String tipo, String nome, int numero) {this.tipo = tipo;
		this.nome = nome;
		this.numero = numero;
	}
	//Casa com complemento.
	public Endereco(String tipo, String nome, int numero, String complemento) {
		this.tipo = tipo;
		this.nome = nome;
		this.numero = numero;
		this.complemento = complemento;
	}
	//Apartamento.
	public Endereco(String tipo, String nome, int numero, int apto) {
		this.tipo = tipo;
		this.nome = nome;
		this.numero = numero;
		this.apto = apto;
	}
	//Apartamento com blocos.
	public Endereco(String tipo, String nome, int numero, int apto, String complemento) {
		this.tipo = tipo;
		this.nome = nome;
		this.numero = numero;
		this.apto = apto;
		this.complemento = complemento;
	}
	public void exibirDados() {
		System.out.print(this.tipo + " " + this.nome + ", " + this.numero);
		if (this.apto != 0) {
			System.out.print(" apto " + this.apto);
		}
		if (this.complemento != null) {
			System.out.print(" - " + this.complemento);
		}
		System.out.println();
	} 
}