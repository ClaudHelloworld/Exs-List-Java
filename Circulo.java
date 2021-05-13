package br.fatec.tiposprimitivos;

import java.util.Scanner;

/*
 * 3. Desenvolva um programa em Java que dado o raio de um círculo (um inteiro), calcule e impri-
 * ma seu diâmetro, área e circunferência. Sabe-se que:
 * a) Diâmetro: 2R
 * b) Área do círculo: pR^2
 * c) Circunferência: 2pR
 * Dica: use a constante PI da classe Math, para obter o valor de pi.
 */
public class Circulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int raio, diametro;
		double area, circunferencia;
		
		System.out.print("Informe o raio do circulo: ");
		raio = in.nextInt();
		
		diametro = 2 * raio;
		area = Math.PI * Math.pow(raio, 2);
		circunferencia = 2 * Math.PI * raio;
		
		System.out.println("Diametro do circulo: " + diametro);
		System.out.printf("Area do circulo: %.2f\n", area);
		System.out.printf("Circunferencia do circulo: %.2f\n", circunferencia);
		in.close();
	}

}
