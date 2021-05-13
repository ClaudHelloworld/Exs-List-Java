package br.fatec.decisao;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, discriminante;
		System.out.println("Informe os valores das variavies de uma equancao do 2o. grau:");
		System.out.print("a = ");
		a = in.nextDouble();
		System.out.print("b = ");
		b = in.nextDouble();
		System.out.print("c = ");
		c = in.nextDouble();
		
		discriminante = Math.pow(b, 2) - 4 * a * c;
		
		in.close();
		
		if (discriminante < 0) {
			System.out.println("Nao ha' raizes reais");
		}
		else {
			double x1, x2;
			if (discriminante == 0) {
				x1 = -b / (2 * a);
				System.out.printf("Duas solucoes iguais: x' = x'' = %.2f", x1);
			}
			else {
				x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.printf("Duas solucoes reais e diferentes:\nx' = %.2f\nx'' = %.2f\n", x1, x2);
			}
		}		
	}

}
