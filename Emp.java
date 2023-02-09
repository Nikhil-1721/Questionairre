import java.util.*;

class Address{

	String city = "Pune";
	String state = "Maharashtra";
	String country = "India";
	
	public Address(String city, String state, String country){
		this.city = city;
		this.state = state;
		this.country = country;

		public String toString(){
		String[] array = {city, state, country};
		String str = Arrays.toString(array);
		return str;

		}

	}
	

	}

public class Emp{
	
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address){
		this.id = id;
		this.name = name;
		this.address = address;

	}
	
		public Emp(boolean value){
		
		if(value == true){
		
		Address ad = new Address();
		Salary sal = new Salart();

		}			
}


	void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);

	}

	public static void main(String args[]){
		Emp emp = new Emp(12, "Nikhil", ad);
		Emp emp2 = new Emp(true);
		emp.display();
		emp2.display();
		}

}

class Salary{

	float salary = 100000f;

	public Salary(){

	public String toString(){
		String[] array = {salary};
		String str = Arrays.toString(array);
		return str;

	}

  	

	}


}