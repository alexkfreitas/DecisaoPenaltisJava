package projetogeneration;

public class Jogador {

	String nomeJogador,terceiraPessoa,terceiraPessoaPosse;;
	int idade, peso, genero;
	double altura;

	public Jogador(String nomeJogador, int idade, int peso, double altura, int genero) {
		
		this.nomeJogador = nomeJogador;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.genero = genero;
		
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
	
	public int getGenero() {
		return genero;
			
	}
	
	public void setTerceiraPessoa(String pronome) {
		this.terceiraPessoa = pronome;
	}
	
	public void setTerceiraPessoaPosse(String pronome) {
		this.terceiraPessoaPosse = pronome;
	}
	
}
