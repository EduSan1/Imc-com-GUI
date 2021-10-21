package br.senai.sp.jandira.contas;

public class ValorImc {

	public double peso;
	public double tamanho;
	public double imc;
	String Status="";
	
	public void CalcularImc(double peso, double tamanho) {
		 
		this.peso = peso;
		this.tamanho = tamanho;
		
		imc = this.peso/(this.tamanho*this.tamanho);
		
		status();
	}
	
	public double getImc() {
		
		return imc;
		
	}
	
	public void status() {
		
		if (imc < 18.5) {

			Status="abaixo do peso";

		} else if (imc >= 18.5 && imc < 25) {

			Status= "normal";

		} else if (imc >= 25 && imc < 30) {

			Status="sobrepeso";

		} else if (imc >= 30 && imc < 35) {

			Status="Obesidade grau I";

		} else if (imc >= 35 && imc < 40) {

			Status = "Obesidade grau II";

		} else if (imc >= 40) {

			Status = "Obesidade grau III";

		}
		
	}
	
	public String getStatus() {
		
		return Status;
		
	}
	

}
