package dad;



public class Menu {

	Messeges message = new Messeges();

	public void menu() {
		while (true) {
			System.out.println("chcesz WYSLAC czy ODEBRAC wiadomosc  ?");
			switch (message.readLine()) {
			case "WYSLAC":
				System.out
						.println("Ile wiad chcesz wyslac. Wpisz liczbe, priorytet(LOW/NORMAL/URGENT) , id i tresc ");

				try {
					message.sending();
				} catch (IllegalArgumentException e) {
					System.out.println("Blad we wprowadzeniu priorytetu");
				}
				;
				break;
			case "ODEBRAC":
				System.out.println("Jaka kolejke wybierasz? FIFO/LIFO ?");
				switch (message.readLine()) {
				case "FIFO":
					System.out
							.println("Odbierz: WSZYSTKIE / PO PRIORYTECIE / WEDLUG ID");
					switch (message.readLine()) {
					case "WSZYSTKIE":

						message.allFifo();
						break;
					case "PO PRIORYTECIE":
						System.out
								.println("Podaj priorytet: LOW/NORMAL/URGENT");
						message.searchOnPriorityFifo();
						message.auxiliaryListOfPriority.clear();
						break;
					case "WEDLUG ID":
						System.out.println("Podaj ID:");
						message.searchOnIDFifo();
						message.auxiliarylistOfID.clear();
						break;
					}
					break;
				case "LIFO":
					System.out
							.println("Odbierz: WSZYSTKIE / PO PRIORYTECIE / WEDLUG ID");
					switch (message.readLine()) {
					case "WSZYSTKIE":

						message.allLifo();
						break;
					case "PO PRIORYTECIE":
						System.out
								.println("Podaj priorytet: LOW/NORMAL/URGENT");
						message.searchOnPriorityLifo();
						message.auxiliaryListOfPriority.clear();
						break;
					case "WEDLUG ID":
						System.out.println("Podaj ID:");
						message.searchOnIDLifo();
						message.auxiliarylistOfID.clear();
						break;
					}
					break;
				}

			}
		}
	}

}
