public class Temp {
	
	float farhenhite;
	float celcius;
	
	public void toCel(float farhenhite){
		
		float cel = (farhenhite - 32 ) * 5/9;
		System.out.println(cel);
	}	

	public void toFar(float celcius){
		float far = (celcius * 9/5) + 32;
		System.out.println(far);
	}

	public static void main(String args[]){
		
		Temp convert = new Temp();
		convert.toCel(38.9f);
		convert.toFar(19.5f);
	}

}