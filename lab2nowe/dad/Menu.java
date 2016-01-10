package dad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public void menu() {
	       Sending<Message> empList;
	       empList = new Sending<Message>();
	      
	       while (true) {
				System.out.println("Wyslij wiadomosc. Po FIFO czy LIFO ?");

				
					switch (readLine()) {

					case "FIFO":
						System.out.println("Podaj wiadomosc. Wpierw Id, potem tresc, priorytet");
						try {
						empList.enqueueFifo(new Message(readLineInt(), readLine(),Priority.valueOf(readLine()))); 
						empList.enqueueFifo(new Message(readLineInt(), readLine(),Priority.valueOf(readLine())));
						} catch (InputMismatchException e) {
							System.out.println("nie podano liczby");
							
						} catch (IllegalArgumentException e) {
							System.out.println("zly priorytet");

						}
					       while (empList.hasItems()) {
						          Message emp = empList.dequeue();
						          System.out.println(emp.id + " " 
						          + emp.text+ " "+emp.priority); 
						         
						       } 
						
						break;
					case "LIFO":
						System.out.println("Podaj wiadomosc. Wpierw Id, potem tresc, priorytet");
						try {
						empList.enqueueLifo(new Message(readLineInt(), readLine(),Priority.valueOf(readLine()))); 
						 empList.enqueueLifo(new Message(readLineInt(), readLine(),Priority.valueOf(readLine())));
					} catch (InputMismatchException e) {
						System.out.println("nie podano liczby");
						
					} catch (IllegalArgumentException e) {
						System.out.println("zly priorytet");

					}
					       
					       System.out.println("Oto lista wiadomosci:");
					       while (empList.hasItems()) {
					          Message emp = empList.dequeue();
					          System.out.println(emp.id + " " 
					          + emp.text+ " "+emp.priority); 
					         
					       } 
						break; 
						
						
					

			}  
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