import java.util.Scanner;

import entities.Pessoas;

public class TestandoFuncionamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoas homem;
		homem = new Pessoas();
		
		System.out.println("Informe o nome do Homem: ");
		homem.nome = sc.next();
		
		System.out.println("Informe o sobrenome do Homem: ");
		homem.sobrenome = sc.next();
		
		System.out.println("informe a idade do Homem: ");
		homem.idade = sc.nextInt();
		
		System.out.println("Informe o peso do Homem: ");
		homem.peso = sc.nextDouble();
		
		System.out.println("Informe a altura do Homem: ");
		homem.altura = sc.nextDouble();
		sc.close();
		
		System.out.printf("Nome : %s Sobrenome: %s Idade: %d Peso: %.2f Altura: %.2f%n",homem.nome, homem.sobrenome, homem.idade, homem.peso, homem.altura);

	}

}
