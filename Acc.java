//Accpunt class which is fully encapsulated class

import java.util.Arrays;


class Account{

	private String name;
	private int acc_no;
	private float amount;
	private String email;
	private String nominee;
	private int transaction_limit;

	private void setValues(String name, int no, int amount, String mail, String nom, int lim){
	
		this.acc_no = no;
		this.amount = amount;
		this.email = mail;
		this.name = name;
		this.nominee = nom;
		this.transaction_limit = lim;

	}


	Account(String name, int no, int amount, String mail, String nom, int lim){
	
		setValues(name, no, amount, mail, nom, lim);
}	
	
	@Override
	public String toString(){
		Object[] array = {name, acc_no, amount, email, nominee, transaction_limit};
		String str = Arrays.toString(array);
		return str;
		}
	}


public class Acc{

	public static void main(String args[]){

	Account ac = new Account("Nikhil", 21, 100000, "nikhil@gmail.com", "Uday", 20);
	System.out.println(ac);

	}
 
}
