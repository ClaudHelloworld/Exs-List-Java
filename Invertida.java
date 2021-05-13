package br.fatec.strings;

import java.util.Scanner;

public class Invertida {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe uma string: ");
		String str = in.nextLine();
        
        System.out.print("String invertida: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        in.close();
	}
}
