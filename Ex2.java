package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vet = new double[5];
		double soma = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}
		
		double menor = vet[0], maior = vet[1];
		
		for(int i = 0; i < 5; i++) {
			System.out.print(vet[i] + " ");
			if(vet[i] > maior) {
				maior = vet[i];
			}else if(vet[i] < menor) {
				menor = vet[i];
			}	
		}
		System.out.println();
		System.out.println("O menor número é: " + menor);
		System.out.println("O maior número é: " + maior);
		System.out.print("A media dos números é: " + (soma / 5));
		
		sc.close();
	}

}
