package matrizes;

import java.util.Random;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Random Gerador = new Random();
		
		int [][] x = new int [5][5];
		int aux;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x.length; j++) {
				x[i][j] = Gerador.nextInt(50);
				System.out.print(x[i][j] + "\t");
		
			}   System.out.println();
		}
		
		int i = 0;
		int j = x.length - 1;
		
		while(i < x.length) {
			aux = x [i][i];
			x[i][i] = x [i][j];
			x[i][j] = aux;
			i++;
			j--;}
		
		
		for(int i1 = 0; i1 < x.length; i1++) {
			for(int j1 = 0; j1 < x.length; j1++) {
				System.out.println(x[i1][j1] + "\t");
		
		

	}

}
}
}