package br.fatec.decisao;

import java.util.Scanner;

public class Decrescente {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2;
		System.out.print("Informe 2 numeros inteiros: ");
		num1 = in.nextInt();
		num2 = in.nextInt();
		System.out.print("Numeros em ordem decrescente: ");		
		if (num1 > num2) {
			System.out.println(num1 + ", " + num2);
		}
		else {
			System.out.println(num2 + ", " + num1);
		}
		in.close();
	}

}
