package dad;

import java.util.InputMismatchException;

public class Menu {
	ReceiveFIFO fifo = new ReceiveFIFO();
	ReceiveLIFO lifo = new ReceiveLIFO();
	Sending sending = new Sending();

	public void menu() {
		while (true) {
			System.out.println("Ile wiad chcesz wczytac(podaj ilosc) ? Podaj wpierw ID, TRESC oraz PRIORYTET");

			try {
				sending.sendMessage();
			} catch (InputMismatchException e) {
				System.out.println("nie podano liczby");
				
			} catch (IllegalArgumentException e) {
				System.out.println("zly priorytet");

			}

			System.out.println("Odbierz przez FIFO/LIFO?");

			switch (sending.readLine()) {

			case "FIFO":

				fifo.takingMessage();
				break;
			case "LIFO":

				lifo.takingMessage();
				break; 
				
				
			}

		}
	}
}
