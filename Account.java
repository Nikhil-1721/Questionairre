//Account class which is fully encapsulated class

class Account{

	private long acc_no;
	private float amount;

	public void setValues(long no, float amount){
		this.acc_no = no;
		this.amount = amount;

	}

	public void getValues(){
		System.out.println(no);
		System.out.println(amount);

	}

	public static void main(String args[]){
	Account ac = new Account();
	ac.setValues(21f);
	ac.getValues();

	}

}