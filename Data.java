package br.fatec.decisao;

import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int data, dia, mes, ano;
		String nome_mes;

		System.out.println("Informe uma data no formato ddmmaaaa: ");
		data = in.nextInt();
		in.close();
		dia = data / 1000000; // 26032021 / 1000000 = 26
		mes = data / 10000; // 26032021 / 10000 = 2603
		mes = mes % 100; // 2603 % 100 = 3
		ano = data % 10000; // 26032021 % 10000 = 2021

		switch (mes) {
		case 1:
			nome_mes = "Janeiro";
			break;
		case 2:
			nome_mes = "Fevereiro";
			break;
		case 3:
			nome_mes = "Março";
			break;
		case 4:
			nome_mes = "Abril";
			break;
		case 5:
			nome_mes = "Maio";
			break;
		case 6:
			nome_mes = "Junho";
			break;
		case 7:
			nome_mes = "Julho";
			break;
		case 8:
			nome_mes = "Agosto";
			break;
		case 9:
			nome_mes = "Setembro";
			break;
		case 10:
			nome_mes = "Outubro";
			break;
		case 11:
			nome_mes = "Novembro";
			break;
		case 12:
			nome_mes = "Dezembro";
			break;
		default:
			nome_mes = "Inválido";
		}
		System.out.println(dia + "/" + nome_mes + "/" + ano);
	}
}
