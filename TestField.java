package box;

public class TestField {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*初級編*/
		NineRowNineColumnField nrncf = new NineRowNineColumnField();
		nrncf.set(0, 0, 5);
		nrncf.set(0, 2, 8);
		nrncf.set(0, 4, 9);
		nrncf.set(0, 5, 4);
		nrncf.set(0, 6, 3);
		nrncf.set(0, 8, 1);

		nrncf.set(1, 1, 9);
		nrncf.set(1, 5, 3);

		nrncf.set(2, 2, 1);
		nrncf.set(2, 3, 2);
		nrncf.set(2, 5, 8);
		nrncf.set(2, 6, 9);

		nrncf.set(3, 0, 9);
		nrncf.set(3, 1, 1);
		nrncf.set(3, 3, 5);
		nrncf.set(3, 4, 6);
		nrncf.set(3, 6, 8);
		nrncf.set(3, 7, 3);

		nrncf.set(4, 2, 5);
		nrncf.set(4, 6, 6);

		nrncf.set(5, 1, 6);
		nrncf.set(5, 2, 3);
		nrncf.set(5, 4, 1);
		nrncf.set(5, 5, 9);
		nrncf.set(5, 7, 5);
		nrncf.set(5, 8, 4);

		nrncf.set(6, 2, 7);
		nrncf.set(6, 3, 9);
		nrncf.set(6, 5, 5);
		nrncf.set(6, 6, 4);

		nrncf.set(7, 3, 3);
		nrncf.set(7, 7, 9);

		nrncf.set(8, 0, 6);
		nrncf.set(8, 2, 9);
		nrncf.set(8, 3, 7);
		nrncf.set(8, 4, 8);
		nrncf.set(8, 6, 5);
		nrncf.set(8, 8, 3);

		nrncf.print();

		System.out.println();
		System.out.println();

		nrncf.reduce();

		nrncf.print();
	}

}
