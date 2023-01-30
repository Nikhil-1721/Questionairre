import java.util.*;

class Main{
	
	private String name;
	private int ID;

	public void setValues(String name, int ID){
		this.name = name;
		this.ID = ID;
	}
	
	public void getValues(){
	System.out.println("Your name is " + name);
	System.out.println("Your ID is " + ID);
}

	
	}

public class Test{
		
		public static void main(String args[]){
		Main main = new Main();

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your name and ID: ");
	
		String name = scn.next();
		int id = scn.nextInt();
		main.setValues(name, id);
		main.getValues();
	}
}