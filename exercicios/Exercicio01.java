package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String resposta;
		Funcionario colab = new Funcionario();
		System.out.println("Informe o nome do funcionario");
		colab.nome = sc.nextLine();
		System.out.println("Informe o salário bruto do funcionario: ");
		colab.bruto = sc.nextDouble();
		System.out.println("Informe a taxa de imposto: ");
		colab.imposto = sc.nextDouble();
		
		System.out.printf("O salário líquido do funcionário é de : %.2f%n",colab.salLiquido());
		
		System.out.printf("Quanto Gostaria de dar em aumento ao Colaborador %s%n ?",colab.nome);
		double perc = sc.nextDouble();
		colab.aumentaSalario(perc);
		System.out.println(colab);
		
		sc.close();

	}

}
