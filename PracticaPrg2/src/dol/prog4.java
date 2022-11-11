package dol;

import java.util.Scanner;

import bll.Application;

public class prog4 {

	// La facturacion del producto de acuerdo al descuento, precio y cantidad
	// Todos los productos tienen el 25% de descuento
	
	Scanner entrada = new Scanner (System.in);
	double desc= 0.25; //El descuento equivale al 25% sobre los precios estaticos 
	double price1= 4900; // precios estaticos  de los productos 
	double price2= 10500;
	double price3= 2500;
	double price4= 8200;
	double price5 = 5850;
	int cantidad;
	double montoDesc;
	double montoOffc;
	String Producto;
	double OfPrice;

	
	
	public void productos() {
		System.out.println("-----------------Bienvenido a Qnexia-----------------");
		System.out.println("\n----------- PRODUCTOS DISPONIBLES EN STOCK --------");
		System.out.println("1. Xiaomi 10 _ 4,900C$");
		System.out.println("2. Iphone 13 _ 10,500C$");
		System.out.println("3. BLUE G5 _ 2,500C$");
		System.out.println("4. Headsets _ 8,200C$");
		System.out.println("5. Samsung J5 _ 5,850C$");
		System.out.println("6. Volver al menu principal");
		
		int opc = entrada.nextInt();
		
		switch (opc) {
		case 1:
		{
		 Producto = "Xiaomi 10";
		 OfPrice = price1;
			proceso();
			if(opc == 1) { 
				 montoDesc = price1 * desc;
	double MontLess =  price1 - montoDesc;
				 montoOffc= MontLess * cantidad;
			}
			Facturacion();
			productos();
		}
		break;	
			
		case 2:{
			 Producto = "Iphone 13";
			 OfPrice= price2;
			proceso();
			if(opc == 2) { 
				 montoDesc = price2 * desc;
	double MontLess =  price2 - montoDesc;
				 montoOffc= MontLess * cantidad;
			}
			Facturacion();
			productos();
		}
		break;	
		
		case 3 :
		{
			Producto = "BLUE G5";
			OfPrice = price3;
			proceso();
			if(opc == 3) { 
				 montoDesc = price3 * desc;
	double MontLess =  price3 - montoDesc;
				 montoOffc= MontLess * cantidad;
			}
			Facturacion();
			productos();
			
		}
		
		break;	
		
		case 4:
		{
			 Producto = "Headsets";
			 OfPrice = price4;
			proceso();
			if(opc == 4) { 
				 montoDesc = price4 * desc;
	double MontLess =  price4 - montoDesc;
				 montoOffc= MontLess * cantidad;
			}
			Facturacion();
			productos();
		}
		break;	
		
		case 5:
			 Producto = "Samsung J5";
			 OfPrice = price5;
		{
			proceso();
			if(opc == 5) { 
				 montoDesc = price5 * desc;
	double MontLess =  price5 - montoDesc;
				 montoOffc= MontLess * cantidad;
			}
			Facturacion();
			productos();
		}
		break;	
		
		case 6:{
			Application ap = new Application();
			ap.Menu();
		}
		
		default:{
			System.out.println("Lo siento, ha digitado una opción inválida");
		}
			
		}
		
		
			
	}
	
	
	
	
	public void proceso() {

		System.out.println("-----------------Bienvenido a Qnexia-----------------");
		System.out.println("Por favor indique la cantidad de productos que desea:");
		cantidad= entrada.nextInt();
	    System.out.println("     ¡Gracias, su factura se generara pronto!");
	    
	    
	}
	

	public void Facturacion() {
		System.out.println("\n-----------------QNEXIA-------------------");
		System.out.println("---------¡GRACIAS POR PREFERIRNOS!--------");
		System.out.println("\n");
		System.out.println("Producto : "+Producto+"");
		
		System.out.println("Precio : "+OfPrice+"");
		
		System.out.println("Cantidad : "+cantidad+"");
		
		System.out.println("Descuento: 25% ");
		
		System.out.println("Monto Total: "+montoOffc+"");
		System.out.println("-------------------------------------------");
		
	}
}
