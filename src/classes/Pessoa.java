package classes;

public abstract class Pessoa {
	
	private String nome;
	private byte idade;
	
	public Pessoa(String nome, byte idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa() {
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public byte getIdade() {
		return idade;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	
	
	public void imprime() {
		System.out.println("/----------Informacoes pessoais----------/");
		System.out.println("Nome: " + getNome());
		System.out.println("idade: " + getIdade());
	}
	
}
