package Exercicio;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private static String endereco;
	private int telefone;
	private int cpf;
	
	
	public Pessoa(String nome, String endereco, int telefone, int cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public static void main(String[] args) {
		
	
		System.out.println("Digite 1 se for Aluno, 2 para Professor, 3 para Sair!");
		System.out.println("Escolha uma opcao: ");
		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		
		if (opcao == 3) {
	  		System.out.print("\n Até logo!");
	  		teclado.close(); 
	  	}
		
		switch (opcao) {
		case 1:
			System.out.print("\n Voce é aluno, valor do xerox R$ 0,10 por cópia");
			break;
		
		case 2:
			System.out.print("\n Voce é professor, valor do xerox R$ 0,05 por cópia\n");
			
			Scanner teclado2 = new Scanner(System.in);

		    System.out.println("Informe a quantidade de horas trabalhadas: ");
		    double horasTrabalhadas = teclado2.nextDouble();
		    
		    System.out.println("Informe o salário/hora: ");
		    double salarioHora = teclado2.nextDouble();
		    
		    System.out.println("Informe o número de dependentes: ");
		    int dependentes = teclado2.nextInt();
		    
		    Professor p = new Professor(endereco, endereco, dependentes, dependentes, endereco, salarioHora);
		    
		    System.out.println("Salário Liquido = " + p.calcularSalarioLiquido());
			
			break;
			
		default:
			System.out.print("\n Opcao Invalida!\n");
			break;
			
		}
		
		
	}
}