package projetogeneration;

public class Goleiro extends Jogador {

	public Goleiro(String nomeJogador, int idade, int peso, double altura,int genero) {
		super(nomeJogador, idade, peso, altura,genero);
		
	}
	
	public Goleiro() {}

	public void defender(int cantodefesa, int canto) {
		
		System.out.println("Valor passado da variável canto: "+canto);
		System.out.println("Valor passado da variável canto do goleiro: "+cantodefesa);
		
		if(cantodefesa == canto) {
			
			System.out.println("ESPAAAAAAAAAAAAAAAALLLLMAAAA, "+this.nomeJogador.toUpperCase()+"!!");
		}
		else {
			System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLLLLLLL!!");
			
		}
	}
}
