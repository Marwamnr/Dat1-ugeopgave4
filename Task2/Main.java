import java.util.Scanner; 

public class Main{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type your name");

		String name =  scanner.nextLine();
		System.out.println("Hello" + name + ". " + "Please type your age"); 

		String age = scanner.nextLine(); 
		int i = Integer.parseInt(age); 

		System.out.println("Your age is" + age);
		int retirementStarts = 67 - i; 

		System.out.println("You may assume retirement starts at" + retirementStarts + " years.");
	}
}