import java.util.Scanner;

public class Principal {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seguir = 0;
		
		//sc = new Scanner(System.in);
		
		
		while (seguir == 0 ) {
			System.out.println("Escriba el nombre del animal");
			String casos = sc.next();
		
			switch (casos) {
		
			case "Perro":{

				Animal sonido = new Perro();
				System.out.println(sonido.darSonido(casos));
				seguir = 1;
				break;
			}
			case "perro":{

				Animal sonido = new Perro();
				System.out.println(sonido.darSonido(casos));
				seguir = 1;
				break;
			}
		
			case "Gato":{

				Animal sonido = new Gato();
				System.out.println(sonido.darSonido(casos));
				seguir = 1;
				break;
			}
		
			case "gato":{
			
				Animal sonido = new Gato();
				System.out.println(sonido.darSonido(casos));
				seguir = 1;
				break;
			}
		
			case "Tigre":{

				Animal sonido = new Tigre();
				System.out.println(sonido.darSonido(casos));
				seguir = 1;
				break;
			}
		
			case "tigre":{

				Animal sonido = new Tigre();
				System.out.println(sonido.darSonido(casos));
				seguir = 1;
				break;
			}
			default:
				System.out.println("Entrada invalida");
			}
		}
		
	}
	
}
