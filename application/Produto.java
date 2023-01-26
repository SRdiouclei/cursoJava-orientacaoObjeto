package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Produto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product produto = new Product();
		
		System.out.println("Informe o nome do produto: ");
		produto.nome = sc.nextLine();
		
		System.out.println("Informe a quantidade do produto: ");
		produto.qtdade = sc.nextInt();
		
		System.out.println("Informe o preço do produto: ");
		produto.preco = sc.nextDouble();
		
		System.out.println(produto);
		
		System.out.println("Informe a quantidade de produtos a serem adicionados: ");
		int qtdade = sc.nextInt();
		produto.adiciona(qtdade);
		
		System.out.println("Updated"+produto);
		
		System.out.println("Informe a quantidade de produtos a serem removidos do estoque: ");
		qtdade = sc.nextInt();
		produto.remove(qtdade);
		
		System.out.println("Updated"+produto);
		
		
		
		sc.close();
	}

}
