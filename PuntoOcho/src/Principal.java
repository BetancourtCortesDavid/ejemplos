
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Arial", 37);
		Persona p2 = new Persona("Joseph", 15);
		

	
		if(p1.getAños()==p2.getAños())
		{
			
		System.out.println(p1.getName()+" es la misma edad "+p2.getName());
		}
		else {
		System.out.println(p1.getName()+" NO es la misma edad "+p2.getName());	
		}
	}

}
