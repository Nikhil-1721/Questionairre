class Computer {

	public String harddrive;
	public String brand;
	public int RAM;
	public int storage;
	
	protected void switchOn(boolean on){
		if(on == true){
		
		System.out.println("Computer is on!");
		} else {
			System.out.println("Failed to start!");

		}
	}

	public void switchOff(boolean off){
		if(off == true){
			System.out.println("Switched Off!");
	

	}	else {

			System.out.println("Unable to switch off!");
	}


	}

}

class Laptop extends Computer{

		
		@Override
		protected void switchOn(boolean on){
		if(on == true){
		
		System.out.println("Laptop is on!");
		} else {
			System.out.println("Failed to start!");

		}
	}

	public void switchOff(boolean off){
		if(off == true){
			System.out.println("Switched Off!");
	

	}else {
		System.out.println("Unable to switch off!");
	}
	
//	boolean isTouchScreen(){
//		return true;
//
//				}
	}

	public boolean isTouchScreen() {
		boolean screen = true;
		return screen;
		
	}

	

	}


}


class Lenovo extends Laptop{

	String harddrive = "Seagate";
	String brand = "Lenovo";
	int RAM = 8;
	int storage = 256;

	@Override
	public String toString(){
		Object[] details = {harddrive, brand, RAM, storage};
		String str = Array.toString(details);
		return str;

		public static void main(String args[]){
		Lenovo len = new Lenovo();
		System.out.println("Hard-Drive:" + len.harddrive);
		System.out.println("Brand:" + len.brand);
		System.out.println("RAM:" + len.RAM);
		System.out.println("Storage capacity:" + len.storage);

		System.out.println(len);
		
		len.switchOn(true);
		len.isTouchScreen();
		
		}


	}

