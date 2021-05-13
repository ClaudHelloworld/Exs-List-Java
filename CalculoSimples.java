package br.fatec.tiposprimitivos;

import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {
		int cod1, pec1, cod2, pec2;
		double valor1, valor2, total;
		/*
		 * Cod 1 ~ 2 = Codigo da peça Pec 1 ~ 2 = Quantidade de peças Valor 1 ~ 2 = O
		 * valor unitário de cada peça
		 */
		Scanner sc = new Scanner(System.in);
		
		cod1 = sc.nextInt();
		pec1 = sc.nextInt();
		valor1 = sc.nextDouble();

		cod2 = sc.nextInt();
		pec2 = sc.nextInt();
		valor2 = sc.nextDouble();
		total = ((pec1 * valor1) + (pec2 * valor2));

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		sc.close();
	}

}
