
package Ejercicios;

import java.util.Scanner;
import java.util.function.Function;

public class ExtractorAño {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
				
		String numTI;
		
		System.out.println("Digita tu numero de tarjeta identidad maximo 11 digitos: ");
		numTI = sc.nextLine();
		
		CalcularAnio(numTI);
		
	}
	
	 static void CalcularAnio (String dato) {
		 String stringanio;
		 
		stringanio = dato.substring(0,2);
		int anio = Integer.parseInt(stringanio);
		
		System.out.println("Tu anio de nacimiento es: " + anio);
	}

}
