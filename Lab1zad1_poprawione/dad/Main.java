package dad;

public class Main {
	public static void main(String[] args) {
		MyList list = new MyList();

		/* 1 */list.add(1);
		list.add(2);

		/* 2 */list.setSameElementNew();
		System.out.println(list.get(2));

		/* 3 */System.out.println(list.get(0));
		/* 4 */list.getAll();

		/* 5 */System.out.println(list.sizeOf());

		/* 6 */list.deleteFirstIndexFromList();
		System.out.println(list.get(0));

		/* 7 */list.clear();
		list.getAll();

	}

}