package Exercicio;

import java.util.Scanner;

public class Aluno extends Pessoa{
	
	private int nota1;
	private int nota2;
	private int nota3;
	private int media;
	private int contAluno = 0;
	

	public Aluno(String nome, String endereco, int telefone, int cpf, int nota1, int nota2, int nota3, int media,
			int contAluno) {
		super(nome, endereco, telefone, cpf);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media = media;
		this.contAluno = contAluno;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	public int getContAluno() {
		return contAluno;
	}

	public void setContAluno(int contAluno) {
		this.contAluno = contAluno;
	}
	
	public int calcularMedia() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite suas notas abaixo: ");
	for(int i = 0; i < 3; i++){
		
        contAluno++;
        // recebe a 1º nota
        System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
        nota1 = teclado.nextInt();
        
        // recebe a 2º nota
        System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
        nota2 = teclado.nextInt();
        
        // recebe a 3º nota
        System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
        nota3 = teclado.nextInt();
        
        // calcula a média do aluno 
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média do aluno " + contAluno + " é " + media);
        
        // mostra a nota do aluno
        if (media >= 7)
            System.out.println("Aluno Aprovado");
         else if(media < 7){
            System.out.println("Aluno Reprovado");
        }
    }
	return media;       
	}

}