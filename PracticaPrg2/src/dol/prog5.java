package dol;

import java.util.Scanner;

public class prog5 {
	
	Scanner entrada = new Scanner (System.in);
	
	String nombre= "";
	
	

	public void Invertido() {
		
	if(nombre.equals("")) {
		
		System.out.println("------ Ingrese el nombre que desea invertir: ------");
		nombre =entrada.nextLine();
	}
	
	if(!nombre.isEmpty()) {
		System.out.println("El nombre "+nombre+" invertido es: "+ InvertirNombre(nombre));
		
	} else {
		System.out.println("Lo siento, lo que intento digitar no es válido");
	}
	
	}
	
	public static String InvertirNombre (String nombre) {
		String InvertidoName = "";
		
		for (int i = nombre.length() - 1; i>=0; i--) {
		
			InvertidoName = InvertidoName + nombre.charAt(i);
			
		}
		return InvertidoName;

}
}
