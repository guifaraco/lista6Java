package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vet = new double[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i + 1) + "º número: ");
			vet[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(vet[i] == vet[j] && i != j) {
					System.out.println("O valor " + vet[i] + " repete.");
				}
			}
		}
		
		sc.close();
	}

}
