package classes;

import java.util.ArrayList;

public class Professor extends Pessoa{
	private static float salario = 2500;
	private ArrayList<String> materiasMinistradas = new ArrayList<>();
	

	public Professor(String nome, byte idade, String materia) {
		super(nome, idade);
		this.materiasMinistradas.add(materia);
	}

	public float getSalario() {
		return salario;
	}

	public static void setSalario(float salario) {
		Professor.salario = salario;
	}

	public ArrayList<String> getMateriasMinistradas() {
		return materiasMinistradas;
	}

	public void setMateriasMinistradas(String materia) {
		this.materiasMinistradas.add(materia);
	}
	
	@Override
	public void imprime() {
		super.imprime();
		System.out.println("/----------Materias ministradas----------/");
		for(int i = 0; i < materiasMinistradas.size(); i++) {
			System.out.println(materiasMinistradas.get(i));
		}
		System.out.println("/----------------------------------------/");
	}
	

}
