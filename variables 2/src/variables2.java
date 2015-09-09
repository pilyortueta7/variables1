import java.util.Scanner;
public class variables2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int edad = 17;
 Scanner user_input = new Scanner (System.in);
 edad = user_input.nextInt();
 System.out.println(edad);
 System.out.println(edad/2 + 7);

 if(edad>=18){
	 System.out.println(" eres legal");
 }
 else {
	 System.out.println(18-edad);
	 
 }

	}

}
