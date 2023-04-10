package ejercicio;
import java.util.Scanner;
public class Kilo_a_Lib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		int n;
		double kg = 1;
		double lb = 2.2046;
		double conversion;
		
		System.out.println("Ingrese el peso en kilogramos");
		n = tc.nextInt();
		
		conversion = n * lb/kg;
		
		System.out.println("La conversion de: "+n+"kg a libras es igual a: "+conversion+"lb");
	}

}
