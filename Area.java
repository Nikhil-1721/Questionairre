public class Area{

	float PI;
	float radius;

	Area(float PI, float radius){
		this.PI = PI;
		this.radius = radius;
	}

	public void Area(){
		float area = PI * radius * radius;
		System.out.println(area);
	}
	
	public void circumference(){
		
		float circumference = 2 * PI * radius;
		System.out.println(circumference);
	}
	

		public static void main(String arfs[]){
			
			Area circle = new Area(3.14f, 5f);
			circle.Area();
			circle.circumference();
	}
}