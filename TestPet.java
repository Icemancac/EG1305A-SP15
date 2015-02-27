import java.util.Scanner;

public class TestPet {
	public static void main(String args[]) {
		Pet pet1 = new Pet();
		Scanner input = new Scanner(System.in);
		System.out.println("Input your Pet's Name");
		pet1.name = input.nextLine();
		System.out.println("Input what type of Pet you have");
		pet1.type = input.nextLine();
		System.out.println("Input the age of your pet");
		pet1.age = input.nextInt();
		System.out.println("Name of Pet =\t" + pet1.getName());
		System.out.println("Type of Pet =\t" + pet1.getType());
		System.out.println("Age of Pet =\t" + pet1.getAge());
	}
}