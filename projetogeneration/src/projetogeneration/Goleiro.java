package projetogeneration;

public class Goleiro extends Jogador {

	public Goleiro(String nomeJogador, int idade, int peso, double altura,String pronomeObliquo, String pronomePessoal,
			String pronomeCampeao) {
		super(nomeJogador, idade, peso, altura, pronomeObliquo, pronomePessoal, pronomeCampeao);
		
	}
	
	public Goleiro() {}

	public void defender(int cantodefesa, int canto) {
	
		if(cantodefesa == canto) {
			
			System.out.println("ESPAAAAAAAAAAAAAAAALLLLMAAAA, "+this.getNomeJogador().toUpperCase()+"!!");
		}
		else {
			System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLLLLLLL!!");
			
		}
	}
}
