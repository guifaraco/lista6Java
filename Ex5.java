package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vet = new double[5];
		int opcao;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Informe o " + (i + 1) + "º número: ");
			vet[i] = sc.nextInt();
		}
		
		do {
			System.out.println("Escolha uma das opções: ");
			System.out.println("0 - Sair ");
			System.out.println("1 - Mostrar ordem direta do vetor ");
			System.out.println("2 - Mostrar ordem inversa do vetor ");
			opcao = sc.nextInt();
			
			switch(opcao) {
			
			case 0: 
				break;
			
			case 1:
				for(int i = 0; i < 5; i++) {
					System.out.print(vet[i] + " ");
				}
				
				System.out.println();
				break;
			
			case 2: 
				for(int i = 4; i >= 0; i--) {
					System.out.print(vet[i] + " ");
				}
				
				System.out.println();
				break;
			
			default:
				System.out.print("O número escolhido é inválido!");
				System.out.println();
			}
		}while(opcao != 0);
		
		
		sc.close();

	}

}

