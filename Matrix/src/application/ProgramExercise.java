/*Programa para leitura de dois n�meros inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo n�meros inteiros,
podendo haver repeti��es. Em seguida, ler um n�mero inteiro X que
pertence � matriz. Para cada ocorr�ncia de X, mostrar os valores �
esquerda, acima, � direita e abaixo de X, quando houver, conforme
exemplo.*/

package application;

import java.util.Scanner;

public class ProgramExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lines number: ");
		int m = sc.nextInt();
		System.out.println("Coluns number: ");
		int n = sc.nextInt();
//	Instancia matriz ixj=linhasxcolunas
		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Write number to be read: ");
		Integer number = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			// elementos linha=elementos coluna
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == number) {
					System.out.println("Position: " + i + "," + j+":");
					if (j > 0) {

						System.out.println("Left:" + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up:" + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}

//				Integer n1 = null;
//				if (n1 == number)
//
//					System.out.print(mat[i][j] + " ");
			}
		}

		sc.close();

	}

}
