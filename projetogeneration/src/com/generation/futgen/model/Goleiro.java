package com.generation.futgen.model;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Goleiro extends Jogador {

	Random random = new Random();

	public Goleiro(String nomeJogador, int idade, int peso, double altura, String pronomeObliquo, String pronomePessoal,
			String pronomeCampeao) {
		super(nomeJogador, idade, peso, altura, pronomeObliquo, pronomePessoal, pronomeCampeao);

	}

	public Goleiro() {
	}

	public boolean defender(int cantodefesa, int canto, int potencia) throws InterruptedException {

		int i = random.nextInt(3) + 1;

		// POTENCIA ALTA
		if (potencia == 3) {

			if (i == 1) {

				System.out.println("PRAAA FOOOOOOORAAAAAAAAAAAA!");
				TimeUnit.SECONDS.sleep(2);
				System.out.println("EXAGEROU NA FORÇA E MANDOU LONGE DO GOL!");
				return false;

			} else {

				if (cantodefesa == canto) {
					System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLLLLLLLLLL!");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("O " + this.getNomeJogador().toUpperCase()
							+ " ATÉ FOI NA BOLA, MAS O CHUTE FOI MUITO FORTE! INDEFENSÁVEL!");
					return true;
				} else {
					System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLlllllL!");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("MAS NEM SE O " + this.getNomeJogador().toUpperCase()
							+ " FOSSE NA BOLA IRIA CONSEGUIR DEFENDER! O CHUTE FOI MUITO FORTE!");
					return true;
				}

			}

			// POTENCIA MÉDIA
		} else if (potencia == 2) {

			if (i == 1) {

				int j = random.nextInt(3);
				if (j <= 1) {
					System.out.println("NAAAA TRAAAAAVEEEE!");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("CAPRICHOU DEMAIS E ACABOU DESPERDIÇANDO A COBRANÇA!");
					return false;
				} else {
					System.out.println("ESPAAAAAAAAAAAAAAAALLLLMAAAA, " + this.getNomeJogador().toUpperCase() + "!!");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("O CHUTE FOI BEM COLOCADO, MAS MESMO ASSIM ELE FOI BUSCAR!!");
					return false;
				}

			} else {
				if (canto == cantodefesa) {
					System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLLLLLL!!");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("O " + this.getNomeJogador().toUpperCase()
							+ " ATÉ FOI NA BOLA, MAS O CHUTE FOI MUITO BEM COLOCADO!");
					return true;
				} else if (canto - cantodefesa > 3 || cantodefesa - canto > 3) {
					System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLLLLL!!");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("GOLEIRO DE UM LADO, BOLA DO OUTRO! O " + this.getNomeJogador().toUpperCase()
							+ " NEM SAIU NA FOTO!");
					return true;
				} else {
					System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLLLL!!");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("ÓTIMA COBRANÇA, NEM MUITO FORTE E NEM MUITO FRACA!");
					return true;
				}
			}

			// POTENCIA BAIXA
		} else {

			if (i == 1) {

				if (canto == cantodefesa) {
					System.out.println(
							"DEFEEEEEEENDEEEEEEEEEEEEEEEUUUUUU, " + this.getNomeJogador().toUpperCase() + "!!");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("CHUTE MUITO FRACO! PRATICAMENTE RECUOU A BOLA PRO GOLEIRO!");
					return false;
				} else {
					System.out.println(
							"DEFEEEEEEENDEEEEEEEEEEEEEEEUUUUUU, " + this.getNomeJogador().toUpperCase() + "!!");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("O CHUTE FOI TÃO FRACO QUE DEU TEMPO DO GOLEIRO SE RECUPERAR E FAZER A DEFESA!");
					return false;
				}

			} else {

				if (canto - cantodefesa > 3 || cantodefesa - canto > 3) {
					System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLLLLL!!");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("QUE CATEGORIA! GOLEIRO DE UM LADO, BOLA DO OUTRO! O "
							+ this.getNomeJogador().toUpperCase() + " NEM SAIU NA FOTO!");
					return true;
				} else if (cantodefesa == canto) {
					System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLL!!");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("QUE FALHA DO GOLEIRO! O CHUTE FOI MUITO FRACO, MAS MESMO ASSIM O "
							+ this.getNomeJogador().toUpperCase() + " NÃO CONSEGUIU DEFENDER!");
					return true;
				} else {
					System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLL!!");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("É MUITA CATEGORIA! SÓ TIROU DO GOLEIRO PRA MARCAR!");
					return true;
				}

			}

		}

	}
}
