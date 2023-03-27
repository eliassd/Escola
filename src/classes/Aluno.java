package classes;

public class Aluno extends Pessoa{
	private int serie;
	private int ra;
	private Endereco endereco;

	
	public Aluno(String nome, byte idade, int serie, int ra, Endereco endereco) {
		super(nome, idade);
		this.serie = serie;
		this.ra = ra;
		this.endereco = endereco;
	}
	
	
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public void imprime() {
		super.imprime();
		System.out.println("Serie: " + getSerie() + "°");
		System.out.println("RA: " + getRa());
		endereco.imprimaEndereco();
		System.out.println("----------------------------------");
	}
	
	
	
}
