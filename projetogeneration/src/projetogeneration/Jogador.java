package projetogeneration;

public class Jogador {

	String nomeJogador;
	int idade, peso;
	double altura;

	public Jogador(String nomeJogador, int idade, int peso, double altura) {
		
		this.nomeJogador = nomeJogador;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	

	public Jogador() {
		super();
	}



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
	
	
	
}
