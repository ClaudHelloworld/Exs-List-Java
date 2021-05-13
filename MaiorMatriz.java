package br.fatec.matrizes;

import java.util.Random;
import java.util.Scanner;

public class MaiorMatriz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int n, m, linha = 0, coluna = 0;
		System.out.print("Informe o numero de linhas e colunas da matriz: ");
		n = in.nextInt();
		m = in.nextInt();
		double[][] mat = new double[n][m];
		
		System.out.println("Matriz " + n + " x " + m + " gerada");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = rand.nextDouble();
				System.out.printf("%.3f\t", mat[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] > mat[linha][coluna]) {
					linha = i;
					coluna = j;
				}
			}
		}
		
		System.out.printf("O maior elementos da matriz (%.3f) está na linha %d e coluna %d\n",
				mat[linha][coluna], linha, coluna);
		in.close();
	}

}
