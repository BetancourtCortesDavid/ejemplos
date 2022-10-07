import java.util.Scanner;
public class Perimetro {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese la base");
		double base = sc.nextDouble();
		
		System.out.println("ingrese la altura");
		double altura = sc.nextDouble();
		
		double result = ((base*altura)/2);
		
		System.out.println("El perimetro es" + result);
		/*int resultado=(int)Math.pow(base, exponente);
		System.out.println(" El resultado de " + base + " elevado a " + exponente + " es "
				+ "" + resultado );*/

	}

}
