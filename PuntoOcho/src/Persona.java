
public class Persona {
// Student Name   //
	// Student Edad  //


	private String name;
	private int años;

	
	


	
	public Persona(String name, int años) {
		
		this.name = name;
		this.años = años;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAños() {
		return años;
	}
	public void setAños(int años) {
		this.años = años;
	}
	@Override
	public String toString() {
		return "Persona [name=" + name + ", años=" + años + "]";
	}
	
	
}