package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double n = sc.nextDouble();
	double [] vect = new double[(int) n];
	
	for (int i=0; i<n; i++) {
	
		vect[i] = sc.nextDouble();
	}
	double soma = 0;
	for(int i=0; i<n; i++ ) {
		soma+= vect[i];
		
	}
	double media = soma/n;
	
	System.out.printf("Average height: %.1f%n" , media);
	sc.close();

	}

}
