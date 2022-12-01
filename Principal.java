import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int opcao;
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite o nome: ");
			String nome = ent.nextLine();
			
			System.out.println("Digite o CPF: ");
			String CPF = ent.nextLine();
			
			do {
				System.out.println("Tipo de moradia: 1- Casa, 2- Casa fundos, 3- Apto, 4- Apto blocos.");
				opcao = ent.nextInt();
			} 
			while (opcao < 1 || opcao > 4);
			System.out.println("Qual o tipo do logradouro?");
			ent.nextLine();
			String tipo = ent.nextLine();
			System.out.println("Qual o nome do logradouro?");
			String nomeLog = ent.nextLine();
			System.out.println("Qual o número do logradouro?");
			int numero = ent.nextInt();
			Endereco endereco;
			if (opcao == 1) {
				endereco = new Endereco(tipo, nomeLog, numero);
			}
			else if (opcao == 2) {
				ent.nextLine();
				System.out.println("Qual o complemento?");
				String complemento = ent.nextLine();
				endereco = new Endereco(tipo, nomeLog, numero, complemento);
			}
			else if (opcao == 3) {
				System.out.println("Qual o número do apartamento?");
				int apto = ent.nextInt();
				endereco = new Endereco(tipo, nomeLog, numero, apto);
			}
			else {
				System.out.println("Qual o número do apartamento?");
				int apto = ent.nextInt();
				ent.nextLine();
				System.out.println("Qual o complemento?");
				String complemento = ent.nextLine();
				endereco = new Endereco(tipo, nomeLog, numero, apto, complemento);
			}
		
		
		Pessoa pes = new Pessoa(nome, CPF, endereco);
		
		ent.nextLine();	
				
		System.out.println("Digite o salário: ");
		double salario = ent.nextDouble();
		
		ent.nextLine();
		
		System.out.println("Digite o cargo: ");
		String cargo = ent.nextLine();
		
		System.out.println("Digite a quantidade de dependentes: ");
		int qtddep = ent.nextInt();
		ent.nextLine();	
		
		Funcionario func = new Funcionario(cargo, salario, qtddep, pes);
		
		func.AuxilioCreche();
		func.DescontoINSS();
		func.DescontoIR();
		func.salarioliquido();		
		func.exibirDados();
	}
		System.out.println("quantidade de fncionários: " + Funcionario.qtdFunc);
		ent.close(); 
	}
}