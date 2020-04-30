import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);	
	
	System.out.println("Ingrese su nota 1: ");
	int nota1 = scan.nextInt();
	System.out.println("Ingrese su nota 2: ");
	int nota2 = scan.nextInt();
	System.out.println("Ingrese su nota 3: ");
	int nota3 = scan.nextInt();
	
	int prom;
	
	prom = (nota1+nota2+nota3)/3;
	
	if (prom >= 10.5) {
		
		System.out.println("Aprobado");
	}
	else {
		System.out.println("Desaprobado");
	}
	System.out.println("Su promedio es: "+ prom);
  }

}
