package com.generation.futgen.model;

public class Batedor extends Jogador {

	private String pernaPreferida;
	private int gol;

	public Batedor(String nomeJogador, int idade, int peso, double altura, String pronomeObliquo, String pronomePessoal,
			String pronomeCampeao, String pernaPreferida, int gol) {
		super(nomeJogador, idade, peso, altura, pronomeObliquo, pronomePessoal, pronomeCampeao);
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
