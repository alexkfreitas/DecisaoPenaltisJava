package projetogeneration;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		int canto=0, op, cantodefesa, player = 1, potencia=0;
		Random random = new Random();
		Batedor primeiro = new Batedor();
		Batedor segundo = new Batedor();
		Goleiro goleiro1 = new Goleiro();
		Goleiro goleiro2 = new Goleiro();
		Scanner teclado = new Scanner(System.in);

		System.out.println("\n\n-------------DADOS DO JOGADOR 1--------------------------");
		System.out.print("\n\nNome: ");
		primeiro.setNomeJogador(teclado.next());
		System.out.print("\n\nIdade: ");
		primeiro.setIdade(teclado.nextInt());
		System.out.print("\n\nAltura: ");
		primeiro.setAltura(teclado.nextDouble());
		System.out.print("\n\nPeso: ");
		primeiro.setPeso(teclado.nextInt());

		do {
			System.out.print("\nSexo (1 - Masculino / 2 - Feminino / 3 - Outros): ");
			op = teclado.nextInt();
			switch (op) {

			case 1:
				primeiro.setPronomeObliquo("O");
				primeiro.setPronomePessoal("ELE");
				primeiro.setPronomeCampeao("CAMPEÃO");
				break;
			case 2:
				primeiro.setPronomeObliquo("A");
				primeiro.setPronomePessoal("ELA");
				primeiro.setPronomeCampeao("CAMPEÃ");
				break;
			case 3:
				primeiro.setPronomeObliquo("U");
				primeiro.setPronomePessoal("ELU");
				primeiro.setPronomeCampeao("VENCEDORE");
				break;
			default:
				System.out.println("Opção inválida! Favor tentar novamente!");
			}

		} while (op < 1 || op > 3);
		
		do {
			System.out.print("\nPerna preferida (1- direita / 2 - esquerda): ");
			op = teclado.nextInt();
			switch (op) {

			case 1:
				primeiro.setPernaPreferida("DIREITO");
				break;
			case 2:
				primeiro.setPernaPreferida("ESQUERDO");
				break;
			default:
				System.out.println("Opção inválida! Favor tentar novamente!");

			}

		} while (op < 1 || op > 2);

		do {
			System.out.print(
					"\nQual goleiro você quer enfrentar?" + "\n1 - Taffarel" + "\n2 - Cássio" + "\n3 - Rogério Ceni"
							+ "\n4 - Marcos" + "\n5 - Gianluigi Buffon" + "\n6 - Manuel Neuer" + "\nDigite a opção escolhida: ");
			op = teclado.nextInt();
			switch (op) {

			case 1:
				goleiro1.setNomeJogador("Taffarel");
				break;
			case 2:
				goleiro1.setNomeJogador("Cássio");
				break;
			case 3:
				goleiro1.setNomeJogador("Rogério");
				break;
			case 4:
				goleiro1.setNomeJogador("Marcos");
				break;
			case 5:
				goleiro1.setNomeJogador("Buffon");
				break;
			case 6:
				goleiro1.setNomeJogador("Neuer");
				break;
			default:
				System.out.println("Opção inválida! Escolha entre as opções de 1 a 6!");
			}
		} while (op < 1 || op > 6);

		System.out.println("\n\n-------------DADOS DO JOGADOR 2--------------------------");
		System.out.print("\n\nNome: ");
		segundo.setNomeJogador(teclado.next());
		System.out.print("\n\nIdade: ");
		segundo.setIdade(teclado.nextInt());
		System.out.print("\n\nAltura: ");
		segundo.setAltura(teclado.nextDouble());
		System.out.print("\n\nPeso: ");
		segundo.setPeso(teclado.nextInt());
		
		do {
			System.out.print("\nSexo (1 - Masculino / 2 - Feminino / 3 - Outros): ");
			op = teclado.nextInt();
			switch (op) {

			case 1:
				segundo.setPronomeObliquo("O");
				segundo.setPronomePessoal("ELE");
				segundo.setPronomeCampeao("CAMPEÃO");
				break;
			case 2:
				segundo.setPronomeObliquo("A");
				segundo.setPronomePessoal("ELA");
				segundo.setPronomeCampeao("CAMPEÃ");
				break;
			case 3:
				segundo.setPronomeObliquo("U");
				segundo.setPronomePessoal("ELU");
				segundo.setPronomeCampeao("VENCEDORE");
				break;
			default:
				System.out.println("Opção inválida! Favor tentar novamente!");

			}

		} while (op < 1 || op > 3);
		
		do {
			System.out.print("\nPerna preferida (1- direita / 2 - esquerda): ");
			op = teclado.nextInt();
			switch (op) {

			case 1:
				segundo.setPernaPreferida("DIREITO");
				break;
			case 2:
				segundo.setPernaPreferida("ESQUERDO");
				break;
			default:
				System.out.println("Opção inválida! Favor tentar novamente!");
			}

		} while (op < 1 || op > 2);

		do {
			System.out.println(
					"\nQual goleiro você quer enfrentar?" + "\n1 - Taffarel" + "\n2 - Cássio" + "\n3 - Rogério Ceni"
							+ "\n4 - Marcos" + "\n5 - Gianluigi Buffon" + "\n6 - Manuel Neuer" + "\nDigite a opção escolhida: ");
			op = teclado.nextInt();
			switch (op) {

			case 1:
				goleiro2.setNomeJogador("Taffarel");
				break;
			case 2:
				goleiro2.setNomeJogador("Cássio");
				break;
			case 3:
				goleiro2.setNomeJogador("Rogério");
				break;
			case 4:
				goleiro2.setNomeJogador("Marcos");
				break;
			case 5:
				goleiro2.setNomeJogador("Buffon");
				break;
			case 6:
				goleiro2.setNomeJogador("Neuer");
				break;
			default:
				System.out.println("Opção inválida! Escolha entre as opções de 1 a 6!");
			}
		} while (op < 1 || op > 6);

		//TimeUnit.SECONDS.sleep(2);

		System.out.println(
				"\n----------------------------ATENÇÃO PARA O TOQUE DE 5 SEGUNDOS----------------------------");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("\n5");
		//TimeUnit.SECONDS.sleep(1);
		System.out.println("4");
		//TimeUnit.SECONDS.sleep(1);
		System.out.println("3");
		//TimeUnit.SECONDS.sleep(1);
		System.out.println("2");
		//TimeUnit.SECONDS.sleep(1);
		System.out.println("1");
		//TimeUnit.SECONDS.sleep(1);

		System.out.println("\nBEM AMIGOS DA REDE GLOBO!! ESTAMOS CHEGANDO PRA ESSA DISPUTA DE PÊNALTIS DECISIVA!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("HOJE É DECISÃO DE CAMPEONAAAAAAAAAAATO, AMIGO!!!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("VAMOS VER ENTÃO QUEM SERÃO OS JOGADORES DE HOJE!!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("COMEÇANDO COM "+primeiro.getPronomePessoal());
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("QUE TEM " + primeiro.getIdade() + " ANOS DE IDADE!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("COM " + primeiro.getAltura() + " DE ALTURA!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("PESANDO " + primeiro.getPeso() + " QUILOS!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("QUE TEM UM PÉ " + primeiro.getPernaPreferida() + " FATAL!!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println(primeiro.getPronomePessoal()+"!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println(primeiro.getNomeJogador().toUpperCase() + "!!");

		System.out
				.println("E PRA ENFRENTAR "+primeiro.getPronomeObliquo()+" " + primeiro.getNomeJogador().toUpperCase() + " NESSA FINAL ELETRIZANTE!!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println(segundo.getPronomePessoal()+" QUE TEM UM PÉ " + segundo.getPernaPreferida() + " QUE FAZ GOLEIRO TREMER AS PERNAS!!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("COM SEUS " + segundo.getIdade() + " ANOS DE IDADE!!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("MEDINDO " + segundo.getAltura() + " DE ALTURA");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("PESANDO " + segundo.getPeso() + " QUILOS");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println(segundo.getPronomePessoal()+"!!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println(segundo.getNomeJogador().toUpperCase() + "!!!");
		//TimeUnit.SECONDS.sleep(2);

		System.out.println("VAI SER UMA DISPUTA ELETRIZANTE!!");
		//TimeUnit.SECONDS.sleep(2);
		System.out
				.println("JÁ VAI COMEÇAR!! " + primeiro.getNomeJogador().toUpperCase() + " VAI INICIAR AS COBRANÇAS!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("JÁ É POSSÍVEL SENTIR A PRESSÃO DA TORCIDA!!");
		//TimeUnit.SECONDS.sleep(2);
		System.out.println("É UM MOMENTO QUE EXIGE UM PSICOLÓGICO MUUUUUUUUITO GRAAANDE, AMIGO!!!");
		//TimeUnit.SECONDS.sleep(2);
		
		
		
		
		// ------------INÍCIO DAS 5 COBRANÇAS----------------
		

		for (int i = 1; i <= 5; i++) {

			// ----- CONFERE POSSIBILIDADE DO JOGO ACABAR APÓS A COBRANÇA DO PLAYER 1 --------

				if (i == 4 && segundo.getGol()-primeiro.getGol()==2) {
					System.out.println("ATENÇÃO! CASO "+primeiro.getPronomeObliquo()+" " + primeiro.getNomeJogador().toUpperCase() + " DESPERDICE SUA PRÓXIMA"
									+ "COBRANÇA, " + segundo.getPronomeObliquo()+" "+ segundo.getNomeJogador().toUpperCase() + " SERÁ "
											+ segundo.getPronomeObliquo()+" GRANDE "+segundo.getPronomeCampeao()+"!");
				} else if (i==4 && primeiro.getGol()-segundo.getGol()==2 ) {
					System.out.println("ATENÇÃO! CASO "+primeiro.getPronomeObliquo()+" " + primeiro.getNomeJogador().toUpperCase() + " ACERTE SUA PRÓXIMA "
							+ "COBRANÇA, SERÁ "+primeiro.getPronomeObliquo()+" GRANDE "+primeiro.getPronomeCampeao()+"!");
				} else if(i==5 && segundo.getGol()-primeiro.getGol()==1) {
					System.out.println("ATENÇÃO! CASO "+primeiro.getPronomeObliquo()+" " + primeiro.getNomeJogador().toUpperCase() + " DESPERDICE SUA PRÓXIMA "
							+ "COBRANÇA, " +segundo.getPronomeObliquo()+" "+ segundo.getNomeJogador().toUpperCase() + " SERÁ "
									+ segundo.getPronomeObliquo()+" GRANDE "+segundo.getPronomeCampeao()+"!");
				} else if(i==5 && primeiro.getGol()-segundo.getGol()==1) {
					System.out.println("ATENÇÃO! CASO "+primeiro.getPronomeObliquo()+" " + primeiro.getNomeJogador().toUpperCase() + " ACERTE SUA PRÓXIMA "
							+ "COBRANÇA, SERÁ "+primeiro.getPronomeObliquo()+" GRANDE "+primeiro.getPronomeCampeao()+"!");
				}

			// ----------- COBRANÇA PLAYER 1 --------------------
				
				if (player == 1) {
					//TimeUnit.SECONDS.sleep(2);
					do {
						System.out.print("\n\n---------------------" + primeiro.getNomeJogador().toUpperCase()
								+ ", SUA VEZ---------------------"

								+ "\n\n1 - Canto inferior direito" 
								+ "\n2 - Canto superior direito" 
								+ "\n3 - Meio superior"
								+ "\n4 - Meio inferior"
								+ "\n5 - Canto superior esquerdo"
								+ "\n6 - Canto inferior esquerdo"
								+ "\nEscolha um canto para chutar: ");
						canto = teclado.nextInt();
						if(canto < 1 || canto > 6) {
							System.out.println("Opção inválida! Escolha entre as opções de 1 a 6!");
						}
					}while(canto < 1 || canto > 6);
					
				do {
					System.out.print("\n\n1-Baixa"
							+ "\n2-Média"
							+ "\n3-Alta"
							+ "\nEscolha a potência do chute: ");
					potencia = teclado.nextInt();
					if (potencia < 1 || potencia > 3) {
						System.out.println("Opção inválida! Escolha entre as opções de 1 a 3!");
					} 
				} while (potencia < 1 || potencia > 3);
					
					
						//TimeUnit.SECONDS.sleep(2);
						primeiro.chutar(canto);
						System.out.println(primeiro.getNomeJogador().toUpperCase() + " CAMINHA ATÉ A MARCA DO PÊNALTI");
						//TimeUnit.SECONDS.sleep(2);
						System.out.println(primeiro.getPronomePessoal()+" SE PREPARA PRA COBRANÇA!");
						//TimeUnit.SECONDS.sleep(2);
						System.out.println("AUTORIZA O ÁRBITRO!");
						//TimeUnit.SECONDS.sleep(2);
						System.out.println("PARTIU " + primeiro.getNomeJogador().toUpperCase() + "!");
						//TimeUnit.SECONDS.sleep(2);
						System.out.println("PÉ " + primeiro.getPernaPreferida() + " NA BOOOOOOOOLAAA!");
						//TimeUnit.SECONDS.sleep(2);
						cantodefesa = random.nextInt(6) + 1;
						
						if (goleiro1.defender(cantodefesa, canto, potencia)) {
							primeiro.somaGol();
						}
						if (i == 4 && segundo.getGol()-primeiro.getGol()==2) {
							i=6;
							player=3;
						} else if (i==4 && primeiro.getGol()-segundo.getGol()==3) {
							i=6;
							player=3;
						} else if (i==5 && segundo.getGol()-primeiro.getGol()==1) {
							i=6;
							player=3;
						}else if(i==5 && primeiro.getGol()-segundo.getGol()==2) {
							i=6;
							player=3;
						}
						player++;
					
				}
			

			System.out.println("PLACAR: " + primeiro.getNomeJogador() + " " + primeiro.getGol() + " X "
					+ segundo.getGol() + " " + segundo.getNomeJogador());

				// ----------CONFERE POSSIBILIDADE DO JOGO ACABAR APÓS COBRANÇA DO PLAYER 2-----------
			
				if (player == 2) {
				if (i == 3 && primeiro.getGol()-segundo.getGol()==3) {
					System.out.println("ATENÇÃO! SE "+segundo.getPronomeObliquo()+" " + segundo.getNomeJogador().toUpperCase() + " ERRAR SUA PRÓXIMA "
							+ "COBRANÇA, A DISPUTA ACABA E "+primeiro.getPronomeObliquo()+" " + primeiro.getNomeJogador().toUpperCase()
							+ " SERÁ "+primeiro.getPronomeObliquo()+" GRANDE "+primeiro.getPronomeCampeao()+"!");
				} else if (i == 3 && segundo.getGol()-primeiro.getGol()==2) {
					System.out.println("ATENÇÃO! SE "+segundo.getPronomeCampeao()+" " + segundo.getNomeJogador().toUpperCase()
							+ " CONVERTER SUA PRÓXIMA" + "COBRANÇA, SERÁ "+segundo.getPronomeObliquo()+" GRANDE "+segundo.getPronomeCampeao()+"!");
				} else if (i == 4 && segundo.getGol()-primeiro.getGol()==1) {
					System.out.println("ATENÇÃO! SE "+segundo.getPronomeObliquo()+" " + segundo.getNomeJogador().toUpperCase()
							+ " CONVERTER SUA PRÓXIMA COBRANÇA, SERÁ "+segundo.getPronomeObliquo()+" GRANDE "+segundo.getPronomeCampeao()+"!");
				} else if (i == 4 && primeiro.getGol()-segundo.getGol()==2) {
					System.out.println("ATENÇÃO! SE "+segundo.getPronomeObliquo()+" " + segundo.getNomeJogador().toUpperCase() + " ERRAR SUA PRÓXIMA "
							+ "COBRANÇA, A DISPUTA ACABA E "+primeiro.getPronomeObliquo()+" " + primeiro.getNomeJogador().toUpperCase()
							+ " SERÁ "+primeiro.getPronomeObliquo()+" GRANDE "+primeiro.getPronomeCampeao()+"!");
				} else if (i==5 && primeiro.getGol()-segundo.getGol()==1) {
					System.out.println("ATENÇÃO! SE "+segundo.getPronomeObliquo()+" " + segundo.getNomeJogador().toUpperCase() + " ERRAR SUA PRÓXIMA "
							+ "COBRANÇA, A DISPUTA ACABA E "+primeiro.getPronomeObliquo()+" " + primeiro.getNomeJogador().toUpperCase()
							+ " SERÁ "+primeiro.getPronomeObliquo()+" GRANDE " +primeiro.getPronomeCampeao()+"!");
				}else if (i==5 && primeiro.getGol()-segundo.getGol()==0) {
					System.out.println("ATENÇÃO! SE O " + segundo.getNomeJogador().toUpperCase()
							+ " CONVERTER SUA PRÓXIMA COBRANÇA, SERÁ "+segundo.getPronomeObliquo()+" GRANDE " +segundo.getPronomeCampeao()+"!");
				}

				// -------COBRANÇA PLAYER 2-------------
				do {
					//TimeUnit.SECONDS.sleep(2);
					System.out.print("\n---------------------" + segundo.getNomeJogador().toUpperCase()
							+ ", SUA VEZ---------------------"

							+ "\n\n1 - Canto inferior direito" 
							+ "\n2 - Canto superior direito" 
							+ "\n3 - Meio superior"
							+ "\n4 - Meio inferior"
							+ "\n5 - Canto superior esquerdo"
							+ "\n6 - Canto inferior esquerdo"
							+ "\nEscolha um canto para chutar: ");
					canto = teclado.nextInt();
					if (canto < 1 || canto > 6) {
						System.out.println("Opção inválida! Escolha entre as opções de 1 a 6!");
					}
				} while (canto < 1 || canto > 6);
				
				do {
					System.out.print("\n\n1-Baixa"
							+ "\n2-Média"
							+ "\n3-Alta"
							+ "\nEscolha a potência do chute: ");
					potencia = teclado.nextInt();
					if (potencia < 1 || potencia > 3) {
						System.out.println("Opção inválida! Escolha entre as opções de 1 a 3!");
					} 
				} while (potencia < 1 || potencia > 3);
					
						//TimeUnit.SECONDS.sleep(2);
						segundo.chutar(canto);
						System.out.println(segundo.getNomeJogador().toUpperCase() + " CAMINHA ATÉ A MARCA DO PÊNALTI");
						//TimeUnit.SECONDS.sleep(2);
						System.out.println(primeiro.getPronomePessoal()+" SE PREPARA PRA COBRANÇA!");
						//TimeUnit.SECONDS.sleep(2);
						System.out.println("AUTORIZA O ÁRBITRO!");
						//TimeUnit.SECONDS.sleep(2);
						System.out.println("PARTIU " + segundo.getNomeJogador().toUpperCase() + "!");
						//TimeUnit.SECONDS.sleep(2);
						System.out.println("PÉ " + segundo.getPernaPreferida() + " NA BOOOOOOOOLAAA!");
						//TimeUnit.SECONDS.sleep(2);
						cantodefesa = random.nextInt(6) + 1;
						if (goleiro2.defender(cantodefesa, canto, potencia)) {
							segundo.somaGol();
						} 
						if (i == 3 && primeiro.getGol()-segundo.getGol()==3) {
							i=6;
						} else if(i == 3 && segundo.getGol()-primeiro.getGol()==3) {
							i=6;
						} else if (i == 4 && segundo.getGol()-primeiro.getGol()==2) {
							i=6;
						} else if (i == 4 && primeiro.getGol()-segundo.getGol()==2) {
							i=6;
						}
						player--;
						System.out.println("PLACAR: " + primeiro.getNomeJogador() + " " + primeiro.getGol() + " X "
								+ segundo.getGol() + " " + segundo.getNomeJogador());

					
				}
			

			
		}

		// ************* FIM DAS 5 COBRANÇAS*************

		if (primeiro.getGol() > segundo.getGol()) {
			System.out.println("ACABOOOOOOOOOOOOU!!");
			System.out.println(primeiro.getNomeJogador().toUpperCase() + " É "+primeiro.getPronomeObliquo()+" GRANDE "+primeiro.getPronomeCampeao()+"!");
		} else if (segundo.getGol() > primeiro.getGol()) {
			System.out.println("ACABOOOOOOOOOOOOU!!");
			System.out.println(segundo.getNomeJogador().toUpperCase() + " É "+segundo.getPronomeObliquo()+" GRANDE "+segundo.getPronomeCampeao()+"!");
		} else {
			System.out
					.println("FINAL DA SÉRIE DE 5 COBRANÇAS!! TUDO IGUAL ATÉ AQUI! VAMOS PARA AS COBRANÇAS ALTERNADAS");
			//TimeUnit.SECONDS.sleep(2);
			System.out.println("AGORA, SE "+primeiro.getPronomeObliquo()+" " + primeiro.getNomeJogador().toUpperCase() + "MARCAR O GOL E "+
					segundo.getPronomeObliquo()+" "	+ segundo.getNomeJogador().toUpperCase() + " ERRAR NA"
					+ " SEQUÊNCIA, "+primeiro.getPronomeObliquo()+" "+ primeiro.getNomeJogador().toUpperCase() + " SERÁ "+primeiro.getPronomeObliquo()+
					" GRANDE "+primeiro.getPronomeCampeao()+"!");
			//TimeUnit.SECONDS.sleep(2);
			System.out.println("DA MESMA FORMA QUE SE "+primeiro.getPronomeObliquo()+" " + primeiro.getNomeJogador().toUpperCase() + " ERRAR SUA "
					+ "COBRANÇA E "+segundo.getPronomeObliquo()+" " + segundo.getNomeJogador().toUpperCase()
					+ " MARCAR NA SEQUÊNCIA, "+segundo.getPronomePessoal()+" SERÁ "+segundo.getPronomeObliquo()+" GRANDE "+segundo.getPronomeCampeao()+"!");
			//TimeUnit.SECONDS.sleep(2);
			System.out.println(
					"CASO AMBOS CONVERTEREM OU ERRAREM SUAS COBRANÇAS, SEGUIMOS PARA MAIS UMA COBRANÇA DE CADA!");
			//TimeUnit.SECONDS.sleep(2);
			System.out.println("VAMOS LÁ! " + primeiro.getNomeJogador().toUpperCase()
					+ " JÁ ESTÁ SE PREPARANDO PARA O INÍCIO DAS COBRANÇAS ALTERNADAS! ");

			// ------------------------------- ALTERNADAS----------------------------------

			do {
					if (player == 1) {
						do {
							//TimeUnit.SECONDS.sleep(2);
							System.out.print("\n\n---------------------" + primeiro.getNomeJogador().toUpperCase()
									+ ", SUA VEZ---------------------"

									+ "\n\n1 - Canto inferior direito" 
									+ "\n2 - Canto superior direito" 
									+ "\n3 - Meio superior"
									+ "\n4 - Meio inferior"
									+ "\n5 - Canto superior esquerdo"
									+ "\n6 - Canto inferior esquerdo"
									+ "\nEscolha um canto para chutar: ");
							canto = teclado.nextInt();
							if (canto < 1 || canto > 6) {
								System.out.println("Opção inválida! Escolha entre as opções de 1 a 6!");
							}
						} while(canto < 1 || canto > 6);
						
						do {
							System.out.print("\n\n1-Baixa"
									+ "\n2-Média"
									+ "\n3-Alta"
									+ "\nEscolha a potência do chute: ");
							potencia = teclado.nextInt();
							if (potencia < 1 || potencia > 3) {
								System.out.println("Opção inválida! Escolha entre as opções de 1 a 3!");
							} 
						} while (potencia < 1 || potencia > 3);
							//TimeUnit.SECONDS.sleep(2);
							primeiro.chutar(canto);
							System.out.println(
									primeiro.getNomeJogador().toUpperCase() + " CAMINHA ATÉ A MARCA DO PÊNALTI");
							//TimeUnit.SECONDS.sleep(2);
							System.out.println(primeiro.getPronomePessoal()+" SE PREPARA PRA COBRANÇA!");
							//TimeUnit.SECONDS.sleep(2);
							System.out.println("AUTORIZA O ÁRBITRO!");
							//TimeUnit.SECONDS.sleep(2);
							System.out.println("PARTIU " + primeiro.getNomeJogador().toUpperCase() + "!");
							//TimeUnit.SECONDS.sleep(2);
							System.out.println("PÉ " + primeiro.getPernaPreferida() + " NA BOOOOOOOOLAAA!");
							//TimeUnit.SECONDS.sleep(2);
							cantodefesa = random.nextInt(6) + 1;
							if (goleiro1.defender(cantodefesa, canto, potencia)) {
								primeiro.somaGol();
							}
							player++;
					}

				System.out.println("PLACAR: " + primeiro.getNomeJogador() + " " + primeiro.getGol() + " X "
						+ segundo.getGol() + " " + segundo.getNomeJogador());
				
					if(primeiro.getGol()==segundo.getGol()) {
						System.out.println("ATENÇÃO! CASO "+segundo.getPronomeObliquo()+" "+segundo.getNomeJogador().toUpperCase()+" ACERTE SUA "
								+ "PRÓXIMA COBRANÇA, SERÁ "+segundo.getPronomeObliquo()+" GRANDE "+segundo.getPronomeCampeao()+"!");
					} else {
						System.out.println("ATENÇÃO! CASO "+segundo.getPronomeObliquo()+" "+segundo.getNomeJogador().toUpperCase()+" DESPERDICE SUA "
								+ "PRÓXIMA COBRANÇA, "+primeiro.getNomeJogador().toUpperCase()+" SERÁ "+primeiro.getPronomeObliquo()+" GRANDE "
								+segundo.getPronomeCampeao()+"!");
					}
					if (player == 2) {
						do {
							//TimeUnit.SECONDS.sleep(2);
							System.out.print("\n---------------------" + segundo.getNomeJogador().toUpperCase()
									+ ", SUA VEZ---------------------"

									+ "\n\n1 - Canto inferior direito" 
									+ "\n2 - Canto superior direito" 
									+ "\n3 - Meio superior"
									+ "\n4 - Meio inferior"
									+ "\n5 - Canto superior esquerdo"
									+ "\n6 - Canto inferior esquerdo"
									+ "\nEscolha um canto para chutar: ");
							canto = teclado.nextInt();
							if (canto < 1 || canto > 6) {
								System.out.println("Opção inválida! Escolha entre as opções de 1 a 6!");
							}
						} while(canto < 1 || canto > 6);
						do {
							System.out.print("\n\n1-Baixa"
									+ "\n2-Média"
									+ "\n3-Alta"
									+ "\nEscolha a potência do chute: ");
							potencia = teclado.nextInt();
							if (potencia < 1 || potencia > 3) {
								System.out.println("Opção inválida! Escolha entre as opções de 1 a 3!");
							} 
						} while (potencia < 1 || potencia > 3);
							//TimeUnit.SECONDS.sleep(2);
							segundo.chutar(canto);
							System.out.println(
									segundo.getNomeJogador().toUpperCase() + " CAMINHA ATÉ A MARCA DO PÊNALTI");
							//TimeUnit.SECONDS.sleep(2);
							System.out.println(segundo.getPronomePessoal()+" SE PREPARA PRA COBRANÇA!");
							//TimeUnit.SECONDS.sleep(2);
							System.out.println("AUTORIZA O ÁRBITRO!");
							//TimeUnit.SECONDS.sleep(2);
							System.out.println("PARTIU " + segundo.getNomeJogador().toUpperCase() + "!");
							//TimeUnit.SECONDS.sleep(2);
							System.out.println("PÉ " + segundo.getPernaPreferida() + " NA BOOOOOOOOLAAA!");
							//TimeUnit.SECONDS.sleep(2);
							cantodefesa = random.nextInt(6) + 1;
							if (goleiro2.defender(cantodefesa, canto, potencia)) {
								segundo.somaGol();
							}
							player--;
							System.out.println("PLACAR: " + primeiro.getNomeJogador() + " " + primeiro.getGol() + " X "
									+ segundo.getGol() + " " + segundo.getNomeJogador());
						

					}

			} while (primeiro.getGol() == segundo.getGol());

			//TimeUnit.SECONDS.sleep(2);
			System.out.println("ACABOOOOOOOOOOOOOOUUUUUUU!!");
			if (primeiro.getGol() > segundo.getGol()) {
				//TimeUnit.SECONDS.sleep(2);
				System.out.println(primeiro.getNomeJogador().toUpperCase() + " É "+primeiro.getPronomeObliquo()+" GRANDE "+primeiro.getPronomeCampeao()+"!");

			} else {
				//TimeUnit.SECONDS.sleep(2);
				System.out.println(segundo.getNomeJogador().toUpperCase() + " É "+segundo.getPronomeObliquo()+" GRANDE "+segundo.getPronomeCampeao()+"!");
			}

		}

		teclado.close();

	}

}
