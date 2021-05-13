package br.fatec.decisao;

import java.util.Scanner;

/*
 * 9. Desenvolva um programa que dada a idade de uma pessoa, determine sua condição de eleitor
 * conforme a tabela a seguir:
 * Idade                                Condição
 * Menor que 16 anos                    Não pode votar
 * Maior ou igual a 16 e menor que 18
 * anos ou maior ou igual a 65 anos     Facultativo
 * Entre 18 e 64 anos                   Obrigatório
 */
public class Eleitor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		System.out.print("Informe sua idade: ");
		idade = in.nextInt();
		if (idade < 16) {
			System.out.println("Nao pode votar");
		}
		else if (idade < 18 || idade >= 65) {
			System.out.println("Voto facultativo");
		}
		else {
			System.out.println("Voto obrigatorio");
		}
		in.close();
	}

}
