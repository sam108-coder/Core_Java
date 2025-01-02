package optionalClass;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter User Id");
		int userId = s.nextInt();

		User u = new User();

		// String userName = u.getUserNameById(userId);

		/*
		 * String msg = userName.toUpperCase() + ", Hello"; System.out.println(msg);
		 */

		/*
		 * if (userName != null) {
		 * 
		 * String msg = userName.toUpperCase() + ", Hello"; System.out.println(msg);
		 * 
		 * } else { System.out.println("Invalid ID"); }
		 */

		Optional<String> userName = u.getUserName(userId);

		if (userName.isPresent()) {
			String name = userName.get();
			System.out.println(name.toUpperCase() + ", Hello");
		} else {
			System.out.println("No Data Found");
		}

		s.close();
	}
}
