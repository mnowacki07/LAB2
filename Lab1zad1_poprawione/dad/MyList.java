package dad;

public class MyList {
	static final int DEFAULT_SIZE = 200;
	int digit;
	Object[] base;
	int size;

	public MyList() {
		this(DEFAULT_SIZE);
	}

	public MyList(int size) {
		this.size = size;
		base = new Object[size];
		digit = 0;
	}

	public void add(Object a) {

		base[digit] = a;
		digit++;

	}

	public int sizeOf() {
		return base.length;

	}

	public Object get(int index) {

		if (index >= digit || index < 0) {
			return "poza rozmiarem";
		}
		return base[index];
	}

	public void deleteFirstIndexFromList() {
		try {
			for (int i = 0; i < digit - 1; i++) {
				base[i] = base[i + 1];
			}
			base[digit - 1] = null;
			digit--;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Pusta lista");
		}
	}

	public void clear() {
		for (int i = 0; i <= digit - 1; i++) {
			base[i] = null;
		}
	}

	public void getAll() {
		for (int i = 0; i <= digit - 1; i++) {
			System.out.println(base[i]);

		}
	}

	public void setSameElementNew() {
		int num = 1; /*
					 * wprowadzilem tu domyslny int, wiadomo mozna stworzyc
					 * metode do odczyt
					 */
		if (digit > num) {
			base[digit] = get(num);
			digit++;
		}

	}

}