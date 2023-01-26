package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo rect;
		rect = new Retangulo();
		
		System.out.println("Informe a altura do Retangulo: ");
		rect.altura = sc.nextDouble();
		
		System.out.println("Informe a largura do Retangulo: ");
		rect.largura = sc.nextDouble();
		
		System.out.printf("A area do retangulo é de : %.2f , o perímetro é de : %.2f e a diagonal de %.2f%n ", rect.area(), rect.perimetro(), rect.diagonal());
		sc.close();

	}

}
