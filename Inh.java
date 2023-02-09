interface A{
		
	public abstract void execute1();
	
	}


interface B{

	public abstract void execute2();
}
		

class C implements A, B {

	@Override
	public void execute1(){
		System.out.println("Hi there!");

	}

	@Override
	public void execute2(){
		System.out.println("Hello there!");

	}


}

public class Inh{

	public static void main(String args[]){

	C obj = new C();
	obj.execute1();
	obj.execute2();

		}
}