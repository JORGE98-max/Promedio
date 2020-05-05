import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double prectotal;
		double precfinal;
		
		
		System.out.println("Ingrese la cantidad de productos: ");
		int cant = scan.nextInt();
		
		switch(cant) {
		
		case 1: System.out.println("Ingrese el precio de los producto comprado: ");
		        int prod1 = scan.nextInt();
		        if (prod1 < 50) {
		        	
		        	precfinal = prod1-0.8;
		          
		           System.out.println("usted debera pagar : " + precfinal+ " por el descuento del 8%");   
		        }
		        else {
			    	   precfinal = prod1 - 10;
			    	   System.out.println("usted debera pagar : " + precfinal+ " por el descuento del 10%");
			       }
		
		break;
		case 2:System.out.println("Ingrese el precio de los producto 1: ");
		       int prod2 = scan.nextInt();
		       System.out.println("Ingrese el precio de los producto 2: ");
		       int prod3 = scan.nextInt();
		       
		       prectotal = prod2 + prod3;
		       if (prectotal < 50) {
		    	   
		    	   precfinal = prectotal -0.8;
		    	   System.out.println("usted debera pagar : " + precfinal);
		    	  }
		       else {
		    	   precfinal = prectotal - 10;
		    	   System.out.println("usted debera pagar : " + precfinal);
		       }
		    break;
		    
		case 3:System.out.println("Ingrese el precio de los producto 1: ");
	       int prod4 = scan.nextInt();
	       System.out.println("Ingrese el precio de los producto 2: ");
	       int prod5 = scan.nextInt();
	       System.out.println("Ingrese el precio de los producto 3: ");
	       int prod6 = scan.nextInt();
	       prectotal = prod4 + prod5 + prod6;
	       if (prectotal < 50) {
	    	   
	    	   precfinal = prectotal -0.8;
	    	   System.out.println("usted debera pagar : " + precfinal);
	    	  }
	       else {
	    	   precfinal = prectotal - 10;
	    	   System.out.println("usted debera pagar : " + precfinal);
	       }
	       
	       break;       
		
		}
		
		}

}
