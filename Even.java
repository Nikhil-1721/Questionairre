import java.util.*;

class Test{
public void even(){
	int number = 0;
	for(int i = 0; i<number; i++){
		if(i%2 == 0){
		System.out.println(i);

			}
		}
	}

	
	}

class EvenCheck extends Test{

	

	@Override
	public void even(){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i = 0; i<number; i++){
		if(i%2 == 0){
		System.out.println(i);

			}
	}

}

class Even{

	public static void main(String args[]){
	EvenCheck e1 = new EvenCheck();
	e1.even();

	}

}
}

	
