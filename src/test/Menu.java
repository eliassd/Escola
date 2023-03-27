package test;
import java.util.Scanner;

public class Menu {
	
	public void menu() {
		try (Scanner input = new Scanner(System.in)) {
			Functions function = new Functions();
			int opcao = 0;
			
			while(opcao != 7) {
			
			System.out.println("/----------Menu de operacoes----------/");
			System.out.println("Escolha a opcao desejada:");
			System.out.println("1. Cadastrar novo aluno.");
			System.out.println("2. Cadastrar novo professor.");
			System.out.println("3. Ver lista de alunos.");
			System.out.println("4. Ver lista de professores.");
			System.out.println("5. Ver informaçoes do aluno.");
			System.out.println("6. Ver informaçoes do professor.");
			System.out.println("7. Finalizar programa.");
			System.out.println("/--------------------------------------/");
			opcao = input.nextInt();
			
				switch(opcao) {
				case 1:
					function.criarAluno();
					break;
				case 2:
					function.criarProfessor();
					break;
				case 3:
					function.listarAlunos();
					break;
				case 4:
					function.listarProfessores();
					break;
				case 5:
					function.perfilAluno();
					break;
				case 6:
					function.perfilProfessor();
					break;
				case 7:
					System.out.println("Finalizando programa!!!");
					break;
				default:
					System.out.println("Opcao invalida");
					System.out.println("");
				}
			}
		}
	}

}
