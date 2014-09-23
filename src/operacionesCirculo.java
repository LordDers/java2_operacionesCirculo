import java.util.Scanner;

public class operacionesCirculo {

	public static void main (String args[]) {

		float numero1, resultadoArea, resultadoCircunferencia;
		Circulos operaciones = new Circulos();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngresa un número: ");
		numero1 = sc.nextFloat(); // nextDouble --> Cambiar todos los float de los dos archivos a double

		resultadoArea = operaciones.area(numero1);
		resultadoCircunferencia = operaciones.circunferencia(numero1);


		System.out.println("\nEl resultado del AREA es: " + resultadoArea);
		System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircunferencia);
	
		//System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
