package br.fatec.decisao;

import java.util.Scanner;

/*
 * 19. Um endocrinologista deseja controlar a saúde de seus pacientes e, para isso, se utiliza do
 * Índice de Massa Corporal (IMC). Sabendo-se que o IMC é calculado através da seguinte
 * fórmula:
 * IMC = peso / altura 2Onde:
 * - peso é dado em Kg
 * - altura é dada em metros
 * Criar um programa que dados o peso e altura do paciente, exiba sua faixa de risco, baseando-
 * se na seguinte tabela:
 * IMC                    Faixa de Risco
 * Abaixo de 20           Abaixo do peso
 * A partir de 20 até 25  Normal
 * Acima de 25 até 30     Excesso de peso
 * Acima de 30 até 35     Obesidade
 * Acima de 35            Obesidade mórbida
 */
public class IMC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.print("Informe seu peso em Kg: ");
		peso = in.nextDouble();
		System.out.print("Informe sua altura em metros: ");
		altura = in.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
		System.out.printf("IMC: %.1f\n", imc);
		
		if (imc < 20) {
			System.out.println("Abaixo do peso");
		}
		else if (imc <= 25) {
			System.out.println("Peso normal");
		}
		else if (imc <= 30) {
			System.out.println("Excesso de peso");
		}
		else if (imc <= 35) {
			System.out.println("Obesidade");
		}
		else {
			System.out.println("Obesidade morbida");
		}
		in.close();
	}

}
