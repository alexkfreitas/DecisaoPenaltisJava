package com.generation.futgen.model;

public abstract class Jogador {

	private String nomeJogador, pronomeObliquo, pronomePessoal, pronomeCampeao;
	private int idade, peso;
	private double altura;

	public Jogador(String nomeJogador, int idade, int peso, double altura, String pronomeObliquo, String pronomePessoal, String pronomeCampeao) {
		
		this.nomeJogador = nomeJogador;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.pronomeObliquo = pronomeObliquo;
		this.pronomePessoal = pronomePessoal;
		this.pronomeCampeao = pronomeCampeao;
		
	}

	public Jogador() {}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}



	public String getPronomeObliquo() {
		return pronomeObliquo;
	}



	public void setPronomeObliquo(String pronomeObliquo) {
		this.pronomeObliquo = pronomeObliquo;
	}



	public String getPronomePessoal() {
		return pronomePessoal;
	}



	public void setPronomePessoal(String pronomePessoal) {
		this.pronomePessoal = pronomePessoal;
	}



	public String getPronomeCampeao() {
		return pronomeCampeao;
	}



	public void setPronomeCampeao(String pronomeCampeao) {
		this.pronomeCampeao = pronomeCampeao;
	}


	
	
	
	
	
}
