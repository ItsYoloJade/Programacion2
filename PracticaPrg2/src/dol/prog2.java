package dol;

import java.util.Scanner;

public class prog2 {
	double radio;
	double area;
	
	public void Circulo() {
		
		Scanner entrada = new Scanner (System.in);
	
		 
		
		
		
		System.out.println("\n==============================================");
		System.out.println("-------------- Ingrese el radio: --------------");
		radio = entrada.nextDouble();
		area= Math.PI  *  Math.pow(radio, 2);
		System.out.println("El area del circulo es: "+area+"");
		
		System.out.println("==============================================");
		

	
		
	}
}
