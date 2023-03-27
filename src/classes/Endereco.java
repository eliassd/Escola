package classes;

public class Endereco {
	
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
	
	public Endereco(String cidade, String bairro, String rua, int numero) {
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
	}
	
	public Endereco() {
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public void imprimaEndereco() {
		System.out.println("-------Endereco-------");
		System.out.println("Cidade: " + getCidade());
		System.out.println("Bairro: " + getBairro());
		System.out.println("Rua: " + getRua());
		System.out.println("Numero: " + getNumero());
		System.out.println("----------------------");
	}
	

}
