package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		
		System.out.println("Informe o nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Informe a nota do aluno no primeiro Trimestre: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.println("Informe a nota do aluno no segundo Trimestre: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.println("Informe a nota do aluno no terceiro Trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		
		System.out.printf("A média geral do aluno nos 3 Trimestres é de %.2f%n ",aluno.media());
		
		sc.close();
		
		if (aluno.media() < 60) {
			System.out.println("Reprovado");
			System.out.printf("Faltaram %.2f%n pontos para a aprovação.",aluno.pontosFaltantes());
		}
		else {
			System.out.println("Aprovado com Sucesso!");
		}
	}

}
