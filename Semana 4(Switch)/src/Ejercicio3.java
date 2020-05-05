import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
	
		int resul;
		
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Producto");
		System.out.println("4.- Division");
		System.out.println("Ingrese el primer numero: ");
		int num1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int num2 = scan.nextInt();
		System.out.println("Ingrese la opcion de operacion a realizar: ");
		int num3 = scan.nextInt();
		
		switch(num3) {
		
		       case 1: 
		    	   
		    	   resul = num1 + num2;
		    	   System.out.println("La suma es: "+ resul);
		    	   break;
                 case 2: 
		    	   
		    	   resul = num1 - num2;
		    	   System.out.println("La resta es: "+ resul);
		    	   break;
                 case 3: 
	   
	               resul = num1 * num2;
	               System.out.println("El producto es: "+ resul);
	               break;
                 case 4: 
	   
	               resul = num1 / num2;
	               System.out.println("La division es: "+ resul);
	               break;
		
		}
	
	
	
	}
	

}
