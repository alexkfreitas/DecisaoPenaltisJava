package projetogeneration;

public class Batedor extends Jogador {

	String pernaPreferida;
	private int gol;
	String intensidadeChute;

	public Batedor(String nomeJogador, int idade, int peso, double altura, String pernaPreferida, int gol, String intensidadeChute) {
		super(nomeJogador, idade, peso, altura);
		this.pernaPreferida = pernaPreferida;
		this.gol = gol;
		
		
	}
	
	
	public Batedor() {}


	public void chutar(int canto) {
		
	}
	
	public void somaGol() {
		this.gol++;
	}


	public String getPernaPreferida() {
		return pernaPreferida;
	}


	public void setPernaPreferida(String pernaPreferida) {
		this.pernaPreferida = pernaPreferida;
	}


	public int getGol() {
		return gol;
	}


	public void setGol(int gol) {
		this.gol = gol;
	}
		

}
