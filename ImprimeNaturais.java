package br.fatec.repeticao;

import java.util.Scanner;

public class ImprimeNaturais {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		in.close();
	}
}