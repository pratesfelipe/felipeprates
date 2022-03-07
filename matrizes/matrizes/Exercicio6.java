package matrizes;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int totalDeAlunos;
		int qntdNotas = 3;
		String[] coluna = { "PROVA 1", "PROVA 2", "TRABALHO"};
		double[] peso = {0.3, 0.5, 0.2};
		double media; 
		
	 System.out.println("Total de alunos ");
	 totalDeAlunos = teclado.nextInt();
	 
	 String[] nome = new String[totalDeAlunos];
	 double[][] nota = new double [totalDeAlunos][qntdNotas +1];
	 
	 
	 for(int i = 0; i < totalDeAlunos; i++) {
		 teclado.nextLine();
		 System.out.println("Aluno "+ (i+i));
		 System.out.println("Nome ");
		 for(int j = 0; j < qntdNotas; j++) {
			 System.out.println(coluna[j]);
			 nota[i][j] = teclado.nextDouble();
			 media += nota[i][j] * peso[j];
			 
			 
			 
		
			 
		 }
	 } nota[i][qntdNotas] = media;
	 System.out.println();
	
	 for(int i = 0; i < totalDeAlunos; i++) {
		 System.out.println(nome[i]);
		 
	 }
	}
}
		 
	


