import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Exercicio1:	Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o
//		X, se for o caso.

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite um numero:");
//		int x = sc.nextInt();
//		
//		for (int j = 1; j <= x; j++) {
//			;
//			if(j % 2 !=0) {
//				System.out.println("O numero � �mpar:" + j);
//				
//			}

//Exercicio2:Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
//Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
//essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite a quantidade de numeros:");
//		int n = sc.nextInt();
//
//		int in = 0;
//		int out = 0;
//
//		for (int i = 0; i < n; i++) {
//			System.out.println("Digite os n�meros:");
//			int x = sc.nextInt();
//			if (x >= 10 && x <= 20) {
//				in = in + 1;
//			} else {
//				out = out + 1;
//			}
//		}
//
//		System.out.println(in + " in");
//		System.out.println(out + " out");

//Exercicio3:Leia 1 valor inteiro N, que representa o n�mero de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a m�dia ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite o n�mero de casos de teste:");
//		int NumCasos = sc.nextInt();
//		double mediaPonderada = 0;
//		
//		for(int i=1; i<=NumCasos; i++) {
//			System.out.println("Digite os valores:");
//			double a = sc.nextDouble();
//			double b = sc.nextDouble();
//			double c = sc.nextDouble();
//			
//			mediaPonderada =  ((a * 2.0 + b * 3.0 + c * 5.0) / 10.0);
//			System.out.printf("A media ponderada � %.2f%n:", mediaPonderada);
//			
//		}

//Exercicio4:Fazer um programa para ler um n�mero N. 
//Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite a quantidade de n�meros:");
//		int Num = sc.nextInt();
//		
//		
//		for(int i=1; i<=Num; i++) {
//			System.out.println("Digite os valores:");
//			double a = sc.nextDouble();
//			double b = sc.nextDouble();
//			
//			if(b!=0) {
//				double divisao = (double)a/b;
//				System.out.printf("O resultado � %.2f%n:", divisao);
//			}
//			else {
//				System.out.println("Divis�o imposs�vel.");
//			}
//	}

//Exercicio5:Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por defini��o, fatorial de 0 � 1.

//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Digite o n�meros:");
//		int Num = sc.nextInt();
//		int fatorial =1;
//		
//		for(int i=1; i<=Num; i++) {
//						
//			
//				 fatorial= fatorial*i;
//				
//			}
//		System.out.println("O fatorial �:"+fatorial);

//Exercicio6:Ler um n�mero inteiro N e calcular todos os seus divisores.		

//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Digite um n�mero:");
//		int Num = sc.nextInt();
//
//		for (int i = 1; i <= Num; i++) {
//			if (Num % i == 0) {
//				System.out.println("O divisor �:" + i);
//			}
//
//		}
//		
		
//Exercicio7:Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
//come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
//exemplo.	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero:");
		int Num = sc.nextInt();

		for (int i = 1; i <= Num; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

		}
		


//		Final da classe
		sc.close();

	}

}
