package application;

import java.util.Scanner;
import java.util.Locale;

public class Ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[10];
		int negativos = 0;
		double soma = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextDouble();
			if(numeros[i] < 0) {
				negativos += 1;
			}else {
				soma += numeros[i];
			}
		}
		System.out.println("Quantidade de números negativos: " + negativos);
		System.out.print("Soma dos números positivos: " + soma);
		
		sc.close();
	}

}
