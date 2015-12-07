package dad;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sending {
	public static List<Message> messageList = new LinkedList<>();

	public void sendMessage() {
		int numberOfMessage;
		numberOfMessage= readLineInt();
		for (int i = 0; i < numberOfMessage; i++) {
			messageList.add(new Message(readLineInt(), readLine(), Priority
					.valueOf(readLine())));
		}

	}

	public String readLine() {

		Scanner scanner = new Scanner(System.in);
		String send = scanner.nextLine();
		return send;
	}

	public int readLineInt() {

		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
		return userChoice;

	}
}
