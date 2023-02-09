class Student{
	int id;
	String name;

	public void printDetails(int id, String name){
		this.id = id;
		this.name = name;
		
		
	}

	public static void main(String args[]){

			Student s1 = new Student();
			s1.printDetails(21, "Nikhil Yadav");
			
			
			Student s2 = new Student();
			s2.printDetails(9, "Rehan");
			

			Student s3 = new Student();
			s3.printDetails(17, "Aashir");

			
			
			
			
		}

	}