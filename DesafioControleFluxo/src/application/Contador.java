package application;

import java.util.Scanner;

import model.exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int numero2 = sc.nextInt();
		
		sc.close();

		try {
			int resultado = subtrairNumeros(numero2, numero1);
			imprimirNumeros(resultado);

		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo número deve ser maior que o primeiro!");
		}

	}

	private static void imprimirNumeros(int resultado) {
		for (int i = 1; i <= resultado; i++) {
			System.out.println("Imprimindo o número: " + i);
		}

	}

	private static int subtrairNumeros(int numero2, int numero1) throws ParametrosInvalidosException {
		if (numero2 < numero1) {
			throw new ParametrosInvalidosException();
		}

		return numero2 - numero1;
	}

}
