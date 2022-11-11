package bll;
import dol.Prog1;
import dol.prog2;
import dol.prog3;
import dol.prog4;
import dol.prog5;

import java.util.Scanner;

public class Application {

	public void Menu() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("======================================================");
		System.out.println("\n-------BIENVENIDO A TU APP MULTIFUNCIONAL----------=");
		System.out.println("--------------¿Qué deseas realizar?-----------------=");
		System.out.println("                                                    =");
		System.out.println("1. Captura un nombre y muestra sus caracteres       =");
		System.out.println("                                                    =");
		System.out.println("2. Calcular el area de un circulo                   =");
		System.out.println("                                                    =");
		System.out.println("3. Suma / Resta / Multiplica o Divide               =");
		System.out.println("                                                    =");
		System.out.println("4. Genera la factura de un producto                 =");
		System.out.println("                                                    =");
		System.out.println("5. Captura un nombre y muestralo invertido          =");
		System.out.println("                                                    =");
		System.out.println("6. Salir                                            =");
		System.out.println("\n====================================================");
		
		
		int opcion = entrada.nextInt();
		
		switch (opcion) {
		
		case 1:
		{
			Prog1 p1 = new Prog1 ();
			p1.valid();
			Menu();
			break;
			
		}
		case 2:
		{
			prog2 p2 = new prog2 ();
			p2.Circulo();
			Menu();
			break;
		}
		case 3:
		{
			prog3 p3 = new prog3 ();
			p3.Operaciones();
			Menu();
			break;
		}
		case 4:
		{
			prog4 p4 = new prog4 ();
			p4.productos();
			Menu();
			break;
		}
		case 5:
		{
			prog5 p5 = new prog5 ();
			p5.Invertido();
			Menu();
			break;
		}
		case 6:
		{
			salir();
		}
		default:
	    System.out.println("Has ingresado una opción incorrecta, por favor intentalo nuevamente");		
	    Menu();
		}
	}
	
	public void salir() {
		System.out.println("¡Gracias, usted ha salido del programa!");
		System.exit(0);
	}
}
