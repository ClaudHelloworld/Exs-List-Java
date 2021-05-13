package br.fatec.decisao;

import java.util.Scanner;

public class MaiorTernario {

	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      int a, b, maior;
	      System.out.print("Digite 2 numeros inteiros diferentes: ");
	      a = in.nextInt();
	      b = in.nextInt();
	      //maior = (a > b ? a : b);
	      //System.out.println("Maior = " + maior);
	      System.out.println("Maior = " + (a > b ? a : b));
	      in.close();
	}

}
