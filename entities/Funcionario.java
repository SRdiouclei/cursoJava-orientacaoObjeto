package entities;

public class Funcionario {
 public String nome;
 public double bruto;
 public double imposto;
 
 	public double salLiquido() {
 		return bruto - imposto;
 	}
 	
 	public void aumentaSalario(double porc) {
 			bruto += bruto * porc / 100;

 	}
 	
 	public String toString() {
 		return nome + ", $ " + String.format("%.2f", salLiquido());
 	}
}
