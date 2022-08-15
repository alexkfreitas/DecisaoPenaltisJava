package projetogeneration;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		int canto = 0, op, cantodefesa, player = 1;
		Random random = new Random();
		Batedor primeiro = new Batedor();
		Batedor segundo = new Batedor();
		Goleiro goleiro1 = new Goleiro();
		Goleiro goleiro2 = new Goleiro();
		Scanner teclado = new Scanner(System.in);

		System.out.println("\n\n-------------DADOS DO JOGADOR 1--------------------------");
		System.out.print("\n\nNome: ");
		primeiro.nomeJogador = teclado.next();
		System.out.print("\n\nIdade: ");
		primeiro.idade = teclado.nextInt();
		System.out.print("\n\nAltura: ");
		primeiro.altura = teclado.nextDouble();
		System.out.print("\n\nPeso: ");
		primeiro.peso = teclado.nextInt();
		System.out.println("\n\nGênero: \n[1] - Feminino \n[2] - Masculino \n[3] - Outros"); //adiciona o gênero de jogadore 1
		primeiro.genero = teclado.nextInt();
		switch (primeiro.genero) {
		case 1:
			primeiro.terceiraPessoa = "ela";
			primeiro.terceiraPessoaPosse = "dela";
			break;
		case 2:
			primeiro.terceiraPessoa = "ele";
			primeiro.terceiraPessoaPosse = "dele";
			break;
		case 3:
			primeiro.terceiraPessoa = "elu";
			primeiro.terceiraPessoaPosse = "delu";
			break;
		}
		System.out.println("É "+primeiro.terceiraPessoa+", "+primeiro.nomeJogador); //verifica o gênero de jogadore 1
		
		do {
			System.out.print("\nPerna preferida (1- direita / 2 - esquerda): ");
			op = teclado.nextInt();
			switch (op) {

			case 1:
				primeiro.pernaPreferida = "DIREITO";
				break;
			case 2:
				primeiro.pernaPreferida = "ESQUERDO";
				break;
			default:
				System.out.println("Opção inválida! Favor tentar novamente!");

			}

		} while (op < 1 || op > 2);
		
		do {
			System.out.println("Qual goleiro você quer enfrentar?"
					+ "\n1 - Taffarel"
					+ "\n2 - Cássio"
					+ "\n3 - Rogério Ceni"
					+ "\n4 - Marcos"
					+ "\n5 - Buffon"
					+ "\n6 - Neuer"
					+ "\nDigite a opção escolhida: ");
			op=teclado.nextInt();
			switch(op) {
			
			case 1:
				goleiro1.nomeJogador="Taffarel";
				break;
			case 2:
				goleiro1.nomeJogador="Cássio";
				break;
			case 3:
				goleiro1.nomeJogador="Rogério Ceni";
				break;
			case 4:
				goleiro1.nomeJogador = "Marcos";
				break;
			case 5:
				goleiro1.nomeJogador="Buffon";
				break;
			case 6: 
				goleiro1.nomeJogador="Neuer";
				break;
				default:
					System.out.println("Opção inválida! Escolha entre as opções de 1 a 6!");
			}
		} while(op<1 || op>6);

		System.out.println("\n\n-------------DADOS DO JOGADOR 2--------------------------");
		System.out.print("\n\nNome: ");
		segundo.nomeJogador = teclado.next();
		System.out.print("\n\nIdade: ");
		segundo.idade = teclado.nextInt();
		System.out.print("\n\nAltura: ");
		segundo.altura = teclado.nextDouble();
		System.out.print("\n\nPeso: ");
		segundo.peso = teclado.nextInt();
		System.out.println("\n\nGênero: \n[1] - Feminino \n[2] - Masculino \n[3] - Outros"); //adiciona ogênero de jogadore 2
		segundo.genero = teclado.nextInt();
		
		switch (segundo.genero) {
		case 1:
			segundo.terceiraPessoa = "ela";
			segundo.terceiraPessoaPosse = "dela";
			break;
		case 2:
			segundo.terceiraPessoa = "ele";
			segundo.terceiraPessoaPosse = "dele";
			break;
		case 3:
			segundo.terceiraPessoa = "elu";
			segundo.terceiraPessoaPosse = "delu";
			break;
		}
		System.out.println("É "+segundo.terceiraPessoa+", "+segundo.nomeJogador);
		do {
			System.out.print("\nPerna preferida (1- direita / 2 - esquerda): "); //verifica o gênero de jogadore 2
			
			op = teclado.nextInt();
			switch (op) {

			case 1:
				segundo.pernaPreferida = "DIREITO";
				break;
			case 2:
				segundo.pernaPreferida = "ESQUERDO";
				break;
			default:
				System.out.println("Opção inválida! Favor tentar novamente!");
			}

		} while (op < 1 || op > 2);
		
		do {
			System.out.println("Qual goleiro você quer enfrentar?"
					+ "\n1 - Taffarel"
					+ "\n2 - Cássio"
					+ "\n3 - Rogério Ceni"
					+ "\n4 - Marcos"
					+ "\n5 - Buffon"
					+ "\n6 - Neuer"
					+ "\nDigite a opção escolhida: ");
			op=teclado.nextInt();
			switch(op) {
			
			case 1:
				goleiro2.nomeJogador="Taffarel";
				break;
			case 2:
				goleiro2.nomeJogador="Cássio";
				break;
			case 3:
				goleiro2.nomeJogador="Rogério Ceni";
				break;
			case 4:
				goleiro2.nomeJogador ="Marcos";
				break;
			case 5:
				goleiro2.nomeJogador="Buffon";
				break;
			case 6: 
				goleiro2.nomeJogador="Neuer";
				break;
				default:
					System.out.println("Opção inválida! Escolha entre as opções de 1 a 6!");
			}
		} while(op<1 || op>6);

		TimeUnit.SECONDS.sleep(2);

		System.out.println(
				"\n----------------------------ATENÇÃO PARA O TOQUE DE 5 SEGUNDOS----------------------------");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\n5");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("4");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);

		System.out.println("\nBEM AMIGUES DA REDE GLOBO!! ESTAMOS CHEGANDO PRA ESSA DISPUTA DE PÊNALTIS DECISIVA!"); //adiciona pronome neutro
		TimeUnit.SECONDS.sleep(2);
		System.out.println("HOJE É DECISÃO DE CAMPEONAAAAAAAAAAATO, AMIGUES!!!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("VAMOS VER ENTÃO QUEM SERÃO OS JOGADORES DE HOJE!!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("COMEÇANDO COM "+primeiro.terceiraPessoa.toUpperCase()); //adiciona tratamento neutro
		TimeUnit.SECONDS.sleep(2);
		System.out.println("QUE TEM " + primeiro.idade + " ANOS DE IDADE!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("COM " + primeiro.altura + " DE ALTURA!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("PESANDO " + primeiro.peso + " QUILOS!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("QUE TEM UM PÉ " + primeiro.pernaPreferida.toUpperCase() + " FATAL!!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(primeiro.terceiraPessoa.toUpperCase()); //adiciona tratamento neutro
		TimeUnit.SECONDS.sleep(2);
		System.out.println(primeiro.nomeJogador.toUpperCase() + "!!!");

		System.out.println("E PRA ENFRENTAR " + primeiro.nomeJogador.toUpperCase() + " NESSA FINAL ELETRIZANTE!!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(segundo.terceiraPessoa.toUpperCase()); //adiciona tratamento neutro
		TimeUnit.SECONDS.sleep(2);
		System.out.println("COM SEUS " + segundo.idade + " ANOS DE IDADE!!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("MEDINDO " + segundo.altura + " DE ALTURA");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("PESANDO " + segundo.peso + " QUILOS");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("QUE TEM UM PÉ " + segundo.pernaPreferida + " QUE FAZ GOLEIRO TREMER AS PERNAS!!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(segundo.terceiraPessoa.toUpperCase()); //adiciona tratamento neutro
		TimeUnit.SECONDS.sleep(2);
		System.out.println(segundo.nomeJogador.toUpperCase() + "!!!");
		TimeUnit.SECONDS.sleep(2);

		System.out.println("VAI SER UMA DISPUTA ELETRIZANTE!!! AMBUS JOGADORES SÃO EXTREMAMENTE TALENTOSES!!!"); //adiciona tratamento neutro
		TimeUnit.SECONDS.sleep(2);
		System.out.println("JÁ VAI COMEÇAR!! " + primeiro.nomeJogador.toUpperCase() + " VAI INICIAR A COBRANÇA!"); //corrige concordância
		TimeUnit.SECONDS.sleep(2);
		System.out.println("JÁ É POSSÍVEL SENTIR A PRESSÃO DA TORCIDA!!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("É UM MOMENTO QUE EXIGE UM PSICOLÓGICO MUUUUUUUUITO GRAAANDE, AMIGUE!!!");
		TimeUnit.SECONDS.sleep(2);

		for (int i = 1; i <= 5; i++) {

			do {

				if (player == 1) {
					TimeUnit.SECONDS.sleep(2);
					System.out.println("|");
					System.out.print("\n\n---------------------" + primeiro.nomeJogador.toUpperCase()
							+ ", ESCOLHA O CANTO DO CHUTE---------------------"

							+ "\n\n1 - Canto direito" + "\n2 - Canto esquerdo" + "\n3 - Meio"
							+ "\nEscolha um canto para chutar: ");
					canto = teclado.nextInt();
					if (canto < 1 || canto > 3) {
						System.out.println("Opção inválida! Escolha entre as opções de 1 a 3!");
					} else {
						TimeUnit.SECONDS.sleep(2);
						primeiro.chutar(canto);
						System.out.println(primeiro.nomeJogador.toUpperCase() + " CAMINHA ATÉ A MARCA DO PÊNALTI");
						TimeUnit.SECONDS.sleep(2);
						System.out.println("PEGOU A BOLA E POSICIONOU NA MARCA DA CAL!");
						TimeUnit.SECONDS.sleep(2);
						System.out.println("AUTORIZA O ÁRBITRO!");
						TimeUnit.SECONDS.sleep(2);
						System.out.println("PARTIU " + primeiro.nomeJogador.toUpperCase() + "!");
						TimeUnit.SECONDS.sleep(2);
						System.out.println("PÉ " + primeiro.pernaPreferida + " NA BOOOOOOOOLAAA!");
						TimeUnit.SECONDS.sleep(2);
						cantodefesa = random.nextInt(3) + 1;
						goleiro1.defender(cantodefesa, canto);
						if (cantodefesa != canto) {
							primeiro.somaGol();
						}
						player++;
					}
				}
			} while (canto < 1 || canto > 3);

			System.out.println("PLACAR: " + primeiro.getNomeJogador() + " " + primeiro.getGol() + " X "
					+ segundo.getGol() + " " + segundo.getNomeJogador());

			do {
				if (player == 2) {
					TimeUnit.SECONDS.sleep(2);
					System.out.print("\n---------------------" + segundo.nomeJogador.toUpperCase()
							+ ", ESCOLHA O CANTO DO CHUTE---------------------"

							+ "\n\n1 - Canto direito" + "\n2 - Canto esquerdo" + "\n3 - Meio"
							+ "\nEscolha um canto para chutar: ");
					canto = teclado.nextInt();
					if (canto < 1 || canto > 3) {
						System.out.println("Opção inválida! Escolha entre as opções de 1 a 3!");
					} else {
						TimeUnit.SECONDS.sleep(2);
						segundo.chutar(canto);
						System.out.println(segundo.nomeJogador.toUpperCase() + " CAMINHA ATÉ A MARCA DO PÊNALTI");
						TimeUnit.SECONDS.sleep(2);
						System.out.println("PEGOU A BOLA E POSICIONOU NA MARCA DA CAL!");
						TimeUnit.SECONDS.sleep(2);
						System.out.println("AUTORIZA O ÁRBITRO!");
						TimeUnit.SECONDS.sleep(2);
						System.out.println("PARTIU " + segundo.nomeJogador.toUpperCase() + "!");
						TimeUnit.SECONDS.sleep(2);
						System.out.println("PÉ " + segundo.pernaPreferida + " NA BOOOOOOOOLAAA!");
						TimeUnit.SECONDS.sleep(2);
						cantodefesa = random.nextInt(3) + 1;
						goleiro2.defender(cantodefesa, canto);
						if (cantodefesa != canto) {
							segundo.somaGol();
						}
						player--;
					}

				}
			} while (canto < 1 || canto > 3);

			System.out.println("PLACAR: " + primeiro.getNomeJogador() + " " + primeiro.getGol() + " X "
					+ segundo.getGol() + " " + segundo.getNomeJogador());

		}

		if (primeiro.getGol() > segundo.getGol()) {
			System.out.println("ACABOOOOOOOOOOOOU!!");
			System.out.println(primeiro.getNomeJogador().toUpperCase() + " VENCE A PARTIDAAAA!"); //retira tratamento por gênero
		} else if (segundo.getGol() > primeiro.getGol()) {
			System.out.println("ACABOOOOOOOOOOOOU!!");
			System.out.println(segundo.getNomeJogador().toUpperCase() + " VENCE A PARTIDAAAA!"); //retira tratamento por gênero
		} else {
			System.out
					.println("FINAL DA SÉRIE DE 5 COBRANÇAS!! TUDO IGUAL ATÉ AQUI! VAMOS PARA AS COBRANÇAS ALTERNADAS");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("AGORA, SE " + primeiro.getNomeJogador().toUpperCase() + "MARCAR O GOL E " //retira tratamento por gênero
					+ segundo.getNomeJogador().toUpperCase() + " ERRAR NA" + " SEQUÊNCIA, "
					+ primeiro.getNomeJogador().toUpperCase() + " VENCERÁ ESTE JOGO!"); //retira tratamento por gênero
			TimeUnit.SECONDS.sleep(2);
			System.out.println("DA MESMA FORMA QUE SE " + primeiro.getNomeJogador().toUpperCase() + " ERRAR SUA "
					+ "COBRANÇA E O " + segundo.getNomeJogador().toUpperCase()
					+ " MARCAR NA SEQUÊNCIA, VENCERÁ ESTE JOGO!!"); //retira tratamento por gênero
			TimeUnit.SECONDS.sleep(2);
			System.out.println(
					"CASO CONVERTAM OU ERREM SUAS COBRANÇAS, SEGUIMOS PARA MAIS UMA COBRANÇA DE CADA!"); //retira tratamento por gênero
			TimeUnit.SECONDS.sleep(2);
			System.out.println("VAMOS LÁ! "+primeiro.getNomeJogador().toUpperCase()+" JÁ ESTÁ SE PREPARANDO PRAS COBRANÇAS ALTERNADAS! ");
		}

		teclado.close();

	}

}
