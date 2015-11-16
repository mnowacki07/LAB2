package dad;

public class Menu {
	public void menu() {

		ListMethods methods = new ListMethods();
		while (true) {
			System.out
					.println("Co chcesz zrobic? Dodaj element/Policz elementy/Wybierz element/Wyczysc liste/Usun element/Zamien element/Sprawdz indeks danego elementu");

			switch (methods.readLine()) {

			case "Dodaj element":
				System.out.println("Wpisz tekst ktory chcesz dodac");
				methods.addElement();
				break;
			case "Policz elementy":
				System.out.println(methods.countElements());
				break;
			case "Wybierz element":
				System.out
						.println("Ktory element. Podaj numer(pierszy element to nr 0)");
				methods.choseElement();
				break;
			case "Wyczysc liste":
				methods.clearList();
				System.out.println("Lista zostala wyczyszczona");

				break;
			case "Usun element":
				System.out
						.println("Ktory element usunac? Wpisz jego zawartosc");
				methods.removeElements();
				break;

			case "Zamien element":
				System.out
						.println("Ktory element zamienic. Podaj numer, a nastepnie wpisz nowa zawartosc");
				methods.changeElement(); 
				break;
			case "Sprawdz indeks danego elementu":
				System.out.println("Wpisz zawartosc elementu");
				System.out.println(methods.howIndex());

				break;
			}
		}
	}

}
