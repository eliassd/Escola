package test;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import classes.Aluno;
import classes.Professor;
import classes.Endereco;

public class Functions {
	
	Scanner input = new Scanner(System.in);
	ArrayList<Aluno> alunos = new ArrayList<>();
	ArrayList<Professor> professores = new ArrayList<>();
	
	String nome;
	byte idade;
	
	public void criarAluno() {
		int serie;
		int ra;
		String cidade;
		String bairro;
		String rua;
		int numero;
		boolean continueLoop = true;
		
		do {
			try {
				System.out.print("Escreva o seu nome: ");
				nome = input.nextLine();
				System.out.print("Escreva sua idade: ");
				idade = input.nextByte();
				if(idade < 3)
					throw new IllegalArgumentException();
				System.out.print("Escreva a serie que ira ingressar: ");
				serie = input.nextInt();
				System.out.print("Escreva seu RA: ");
				ra = input.nextInt();
				
				input.nextLine();
			
				System.out.print("Escreva o nome de sua cidade: ");
				cidade = input.nextLine();
				System.out.print("Escreva o nome de seu Bairro: ");
				bairro = input.nextLine();
				System.out.print("Escreva o nome de sua Rua: ");
				rua = input.nextLine();
				System.out.print("Escreva o numero de sua casa: ");
				numero = input.nextInt();
			
				Endereco end = new Endereco(cidade, bairro, rua, numero);
			
				Aluno aluno = new Aluno(nome, idade, serie, ra, end);
			
				alunos.add(aluno);
			
				System.out.println("Aluno cadastrado.");
				System.out.println("");
			
				continueLoop = false;
				}
			catch( InputMismatchException inputMismatchException){
				System.err.print(inputMismatchException);
				input.nextLine();
				System.out.printf("\nEntrada invalida tente novamente!\n\n");
				}
			catch(IllegalArgumentException i) {
				System.err.print(i);
				input.nextLine();
				System.out.printf("\nNão são permitidos menores de 3 anos, tente novamente!\n\n");
				}	
		
			}while(continueLoop);

		}
	
	
	public void criarProfessor() {
		String materia;
		boolean continueLoop = true;
		
		do {
			try {
				System.out.print("Escreva o seu nome: ");
				nome = input.nextLine();
				System.out.print("Escreva sua idade: ");
				idade = input.nextByte();
				if(idade < 18)
					throw new IllegalArgumentException();
				input.nextLine();
				System.out.print("Escreva a materia que ministrara: ");
				materia = input.nextLine();
				
				Professor prof = new Professor(nome, idade, materia);
				
				professores.add(prof);
				
				System.out.println("Professor cadastrado.");
				System.out.println("");
				continueLoop = false;
			}
			catch( InputMismatchException inputMismatchException){
				System.err.print(inputMismatchException);
				input.nextLine();
				System.out.printf("\nEntrada invalida tente novamente!\n\n");
			}
			catch(IllegalArgumentException i) {
				System.err.print(i);
				input.nextLine();
				System.out.printf("\nNão são permitidos menores de 18 anos, tente novamente!\n\n");
			}	
				
		}while(continueLoop);
		
	}
	
	public void listarAlunos() {
		int j = 1;
		for(int i = 0; i < alunos.size(); i++) {
			System.out.println(j + " - " +  alunos.get(i).getNome());
			j++;
		}
		System.out.println("");
	}
	
	public void listarProfessores() {
		int j = 1;
		for(int i = 0; i < professores.size(); i++) {
			System.out.println(j + " - " +  professores.get(i).getNome());
			System.out.println("Ministra: ");
			for(int k = 0; k < professores.get(i).getMateriasMinistradas().size(); k++) {
			System.out.println(professores.get(i).getMateriasMinistradas().get(k));
			}
			j++;
			System.out.println("/------------------------------/");
		}
		System.out.println("");
		System.out.println("");
	}
	
	public void perfilAluno() {
		int indice;
		listarAlunos();
		System.out.println("Selecione o aluno: ");
		indice = input.nextInt();
		
		try {
		alunos.get(indice-1).imprime();
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Posição não encontrada, aluno não existe.");
		}
	}
	
	
	public void perfilProfessor() {
		int indice = 0;
		while(indice != 3) {
			System.out.println("/------------------------------/");
			System.out.println("1. Ver perfil dos professores");
			System.out.println("2. Adicionar materia");
			System.out.println("3. Voltar");
			System.out.println("/------------------------------/");
			indice = input.nextInt();
			
			switch(indice) {
			case 1:
				System.out.println("Selecione o professor: ");
				int prof;
				prof = input.nextInt();
				try {
					professores.get(prof-1).imprime();
					}catch(IndexOutOfBoundsException e) {
						System.out.println("Posição não encontrada, professor não existe.");
					}
				break;
			case 2:
				System.out.println("Selecione o professor: ");
				int profe;
				profe = input.nextInt();
				input.nextLine();
				System.out.println("Escreva o nome da materia: ");
				String nome;
				nome = input.nextLine();
				try {
					professores.get(profe-1).setMateriasMinistradas(nome);
					}catch(IndexOutOfBoundsException e) {
						System.out.println("Posição não encontrada, professor não existe.");
					}
				break;
			default:
				System.out.println("Opcao invalida");	
			}
			
		}
	}
	

}
