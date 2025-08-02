import java.util.Scanner;

public class Welcome{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your First Name: ");
		String name1 = sc.nextLine();

		System.out.print("Enter your Last Name: ");
		String name2 = sc.nextLine();

		System.out.printf("Welcome to the Second Year %s %s\n", name1, name2);

		sc.close();
	}
}

