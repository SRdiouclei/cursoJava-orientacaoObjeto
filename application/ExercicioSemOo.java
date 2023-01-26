package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSemOo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xa, xb, xc, ya, yb, yc;
		
		System.out.println("Informe os valores dos lados do triangulo x: ");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		System.out.println("Informe os valores dos lados do triangulo y: ");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		double p = (xa + xb + xc) / 2.0;
		double areax = (float) Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));
		
		p = (ya + yb+ yc) / 2.0;
		double areay = (float) Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));
		
		
		System.out.printf("O valor da �rea do triangulo X � de : %.4f%n",areax);
		
		System.out.printf("O valor da �rea do triangulo Y � de : %.4f%n",areay);
		
		sc.close();
		if(areax > areay) {
			System.out.println("A �rea do tringulo X � maior que a do Triangulo Y");
		}
		else {
			System.out.println("A �rea do tringulo Y � maior que a do Triangulo X");
		}

	}

}
