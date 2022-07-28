import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print(" Enter user name => ");
		String userName = scanner.nextLine();
		System.out.print(" Enter password => ");
		String password = scanner.nextLine();

		while (true) {

			if ("Suvendu".equals(userName) && "1234".equals(password)) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Phone type:");
				System.out.println("1 for Deskphone");
				System.out.println("2 for MobilePhone");

				int a = sc.nextInt();
				if (a == 1) {
					DeskPhone myPhone = new DeskPhone("123456");
					myPhone.powerOn();
					myPhone.dial("123456");
					myPhone.callPhone("123456");
					myPhone.answer();
				} else if (a == 2) {
					MobilePhone myPhone = new MobilePhone("123456");
					myPhone.powerOn();
					myPhone.callPhone("123456");
					myPhone.answer();
				}
				System.out.println();
				System.out.println("press 0 to continue and 1 to switch off your phone");
				int n = sc.nextInt();
				if (n == 1) {
					break;
				}

			}
		}
	}

}
