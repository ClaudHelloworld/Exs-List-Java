package br.fatec.decisao;

import java.util.Scanner;

public class Credito {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float credit, averageBalance;

		System.out.println("Informe o saldo medio: R$ ");
		averageBalance = in.nextFloat();
		in.close();

		if (averageBalance > 5000) {
			credit = averageBalance * 2;
		} 
		else {
			if (averageBalance > 3000) {
				credit = averageBalance * 1.5F;
			} 
			else { 
				if (averageBalance > 1000) {
					credit = averageBalance;
				}
				else {
					credit = averageBalance * 0.75F;
				}
			}
		}

		System.out.printf("Credito especial: %.2f", credit);
	}

}
