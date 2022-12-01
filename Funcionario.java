public class Funcionario {

		private String cargo;
		private double salario;
		private double descIR;
		private double descINSS;
		private double valCreche;
		private double salarioLiq;
		private int qtddep;
		private Pessoa pessoa; 
		private static int qtdFunc = 0;
		
		public Funcionario(String cargo, double salario, int qtddep, Pessoa pessoa){
			this.cargo = cargo;
			this.salario = salario;
			this.qtddep = qtddep;
			this.pessoa = pessoa;
                        qtdFunc++;
		}
				
		public void DescontoIR() {
			if(this.salario <= 1000)
				this.descIR = 0;
			else if(this.salario > 1000 && this.salario <= 3000)
				this.descIR = this.salario * 0.15;
			else
				this.descIR = this.salario * 0.275;
		}
		
		public void DescontoINSS() {
			this.descINSS = this.salario * 0.11;
			if(this.descINSS > 500)
				this.descINSS = 500;
		}
		
		public double AuxilioCreche() {
			this.valCreche = (this.qtddep * 55);
			return this.valCreche;
		}
		
		public double salarioliquido() {
			this.salarioLiq = this.salario + this.valCreche - this.descIR - this.descINSS;
			return this.salarioLiq;
		}
						
		public void exibirDados() {
			System.out.println("Cargo: " + this.cargo);
			System.out.println("Salário: " + this.salario);
			System.out.println("Desconto IR: " + this.descIR);
			System.out.println("Desconto INSS: " + this.descINSS);
			System.out.println("Valor do auxílio creche: " + this.valCreche);
			System.out.println("Salário líquido: " + this.salarioLiq);
			System.out.println("Quantidade de dependentes: " + this.qtddep);	
			this.pessoa.exibirDados();
		}
}