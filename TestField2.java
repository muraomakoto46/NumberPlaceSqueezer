package box;

public class TestField2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*中級編*/
		NineRowNineColumnField nnf = new NineRowNineColumnField();
		nnf.set(0, 3, 5);
		nnf.set(0, 5, 6);

		nnf.set(1, 1, 5);
		nnf.set(1, 4, 2);
		nnf.set(1, 8, 7);
		nnf.set(2, 1, 2);
		nnf.set(2, 4, 8);
		nnf.set(2, 5, 1);
		nnf.set(2, 6, 3);

		nnf.set(3, 0, 9);
		nnf.set(3, 4, 5);
		nnf.set(3, 5, 7);
		nnf.set(3, 7, 2);

		nnf.set(4, 0, 1);
		nnf.set(4, 2, 7);
		nnf.set(4, 6, 8);
		nnf.set(4, 8, 5);

		nnf.set(5, 1, 8);
		nnf.set(5, 3, 6);
		nnf.set(5, 4, 1);
		nnf.set(5, 8, 4);

		nnf.set(6, 2, 1);
		nnf.set(6, 3, 9);
		nnf.set(6, 4, 6);
		nnf.set(6, 7, 8);

		nnf.set(7, 0, 3);
		nnf.set(7, 4, 7);
		nnf.set(7, 7, 4);

		nnf.set(8, 3, 4);
		nnf.set(8, 5, 5);

		nnf.print();

		System.out.println();

		nnf.reduce();


		nnf.print();
		System.out.println();
	}

}
