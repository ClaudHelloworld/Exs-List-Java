package br.fatec.tiposprimitivos;

import java.util.Scanner;

public class ExemploString {

	public static void main(java.lang.String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.nextLine();
		String nome = in.nextLine();
		System.out.println(nome + " - " + a);
		System.out.printf("%d\n", a);
		in.close();
	}

}
