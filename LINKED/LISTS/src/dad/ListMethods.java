package dad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMethods {
	List<String> lista = new ArrayList<String>();

	public int countElements() {

		int size = lista.size();
		return size;

	}

	public List<String> addElement() {
		lista.add(readLine());
		return lista;

	}

	public void choseElement() {

		System.out.println(lista.get(readLineInt()));

	}

	public void clearList() {
		lista.clear();
	}

	public void removeElements() {
		lista.remove(readLine());
	}

	public void changeElement() {
		lista.set(readLineInt(), readLine());
	}

	public int howIndex() {
		int a = lista.indexOf(readLine());
		return a;

	}

	public String readLine() {

		Scanner scanner = new Scanner(System.in);
		String userChoice = scanner.nextLine();
		return userChoice;

	}

	public int readLineInt() {

		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
		return userChoice;

	}

}
