package dol;

import java.util.Scanner;
import bll.Application;
public class prog3 {
	Scanner entrada = new Scanner (System.in);
float a;
float b;
float suma;
float resta;
float multip;
float division;


public void suma() {
	System.out.println("Ingrese el primer número");
	a= entrada.nextFloat();
	System.out.println("Ingrese el segundo número");
	b= entrada.nextFloat();
	
	suma = a + b;
	
	System.out.println("la suma de "+a+ " + "+b+" es igual a "+suma+"");
	
}

public void resta() {
	System.out.println("Ingrese el primer número");
	a= entrada.nextFloat();
	System.out.println("Ingrese el segundo número");
	b= entrada.nextFloat();
	
	resta = a - b;
	System.out.println("la resta de "+a+ " - "+b+" es igual a "+resta+"");
}


public void multip() {
	System.out.println("Ingrese el primer número");
	a= entrada.nextFloat();
	System.out.println("Ingrese el segundo número");
	b= entrada.nextFloat();
	
	multip = a * b;
	
	System.out.println("la multiplicación de "+a+ " * "+b+" es igual a "+multip+"");
}


public void division() {
	System.out.println("Ingrese el primer número");
	a= entrada.nextFloat();
	System.out.println("Ingrese el segundo número");
	b= entrada.nextFloat();
	
	division = a / b;
	
	System.out.println("la division de "+a+ " / "+b+" es igual a "+division+"");
}


	public void Operaciones() {
		
		
		
		System.out.println("\n==================================================");
		System.out.println("¡Genial!, ¿Qué operación fundamnetal desea realizar?");
		System.out.println("1. Sumar dos números");
		System.out.println("2. Restar dos números");
		System.out.println("3. Multiplicar dos números");
		System.out.println("4. Dividir dos números");
		System.out.println("5. Regresar al menú principal");
		
		int opc= entrada.nextInt();
		
		switch (opc) {
		case 1:
		{
			suma();
			Operaciones();
			break;
		}
		
		case 2:
		{
			resta();
			Operaciones();
			break;
		}
		case 3:
		{
			multip();
			Operaciones();
			break;
		}
		case 4:
		{
			division();
			Operaciones();
			break;
		}
		case 5:
		{
			Application ap = new Application();
			ap.Menu();
			break;
		}
		
		default: 
		{
			System.out.println("Esta opción no es válida, intentalo nuevamente");
		}
		}
		
	}
}
