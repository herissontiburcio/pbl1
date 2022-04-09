package pbl;

import java.util.Random;
import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {
		/*
		 * ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ##
		 * ## ## ## ## ## ## # ## Autor: Herisson ## ## Concluído em: <03/12/2021> ## ##
		 * Declaro que este código foi elaborado por mim de forma individual e nao
		 * contem nenhum ## ## trecho de codigo de outro colega ou de outro autor, tais
		 * como provindos de livros e ## ## apostilas, e paginas ou documentos
		 * eletronicos da Internet. Qualquer trecho de codigo ## ## de outra autoria que
		 * nao a minha esta destacado com uma citacao para o autor e a fonte ## ## do
		 * codigo, e estou ciente que estes trechos nao serao considerados para fins de
		 * avaliacao. ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ##
		 * ## ## ## ## ## ## ## ## ## ## ## #
		 */

		Scanner dados = new Scanner(System.in);
		Random random = new Random();

		// Declaraçao e inicializaçao das variaveis
		int num = 0, num1 = 0, num2 = 0;
		int resposta = 0, erros = 0, acertos = 0, respostaCorreta = 0;
		int tentativas = 10;
		boolean StatusRespostas = true;

		for (int count = 1; count <= tentativas; count++) {

			int aleat1 = random.nextInt(4);
			String operacao = " ";

			switch (aleat1) {
			case 0:
				operacao = "mais";
				break;
			case 1:
				operacao = "menos";
				break;
			case 2:
				operacao = "vezes";
				break;
			case 3:
				operacao = "dividido";
				break;
			}

			String pergunta = "Quanto é ";

			if (StatusRespostas) {
				num1 = random.nextInt(10);
				num2 = random.nextInt(10);
			}

			pergunta = pergunta + " " + num1 + " " + operacao + " " + num2 + "?";

			System.out.println(pergunta);

			resposta = dados.nextInt();

			if (operacao.equalsIgnoreCase("mais")) {
				respostaCorreta = num1 + num2;
			}

			if (operacao.equalsIgnoreCase("menos")) {
				respostaCorreta = num1 - num2;
			}

			if (operacao.equalsIgnoreCase("vezes")) {
				respostaCorreta = num1 * num2;
			}

			if (operacao.equalsIgnoreCase("dividido")) {
				respostaCorreta = num1 / num2;
			}

			if (resposta == respostaCorreta) {
				StatusRespostas = true;
				int aleat2 = random.nextInt(4);
				switch (aleat1) {
				case 0:
					System.out.println("Muito bom.");
					break;
				case 1:
					System.out.println("Excelente.");
					break;
				case 2:
					System.out.println("Bom trabalho.");
					break;
				case 3:
					System.out.println("Mantenha um bom trabalho!");
					break;
				}
				acertos++;
			} else {
				StatusRespostas = false;
				int aleat3 = random.nextInt(4);

				switch (aleat3) {
				case 0:
					System.out.println("Não. Por favor, tente de novo.");
					break;
				case 1:
					System.out.println("Errado. Tente mais uma vez.");
					break;
				case 2:
					System.out.println("Não desista!");
					break;
				case 3:
					System.out.println("Não. Continue tentando.");
					break;
				}

				erros++;

			}

		}

		System.out.println(" ");

		if ((acertos / erros) >= 0.75) {
			System.out.printf("Parabéns, você está pronto para avançar para o próximo nível!");
		} else
			System.out.printf("\nPeça ajuda extra ao seu professor.");
		dados.close();
	}

} // Fim da classe
