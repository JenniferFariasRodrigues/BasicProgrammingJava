import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
////		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
////		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.
//	int senha =2002;
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Digite uma senha:");
//	int senhadigitada = sc.nextInt();
//	
//	while(senhadigitada!=senha) {
//		System.out.println("Senha Incorreta.Acesso Negado!");
//		senhadigitada = sc.nextInt();
//	}
//	System.out.println("Acesso permitido!");

////		Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
////		um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
////		4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
////		que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
////		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
////		exemplo.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite o tipo de combust�vel:");
//		int combustivel = sc.nextInt();
//
//		while (combustivel != 4) {
//			System.out.println("Digite novo tipo de combust�vel:");
//			combustivel = sc.nextInt();
//			if(combustivel==1) {
//				System.out.println("Alcool:1");
//			}
//			else if(combustivel==2) {
//				System.out.println("Gasolina:2");
//			}
//			else if(combustivel==3){
//				System.out.println("Diesel:3");
//			}
//
//		}
//		System.out.println("Muito obrigada.");
	
//		Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo ser� encerrado quando pelo
//		menos uma de duas coordenadas for NULA (nesta situa��o sem escrever mensagem alguma).
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite x:");
		int x = sc.nextInt();
		System.out.println("Digite y:");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}		
	
//	final da classe
	sc.close();
	}

}
