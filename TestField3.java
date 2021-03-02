package box;

public class TestField3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		NineRowNineColumnField nnf = new NineRowNineColumnField();
		nnf.set(0, 4, 3);
		nnf.set(0, 5, 7);

		nnf.set(1, 2, 3);
		nnf.set(1, 6, 2);

		nnf.set(2, 1, 5);
		nnf.set(2, 4, 6);
		nnf.set(2, 6, 1);
		nnf.set(2, 8, 7);

		nnf.set(3, 2, 8);
		nnf.set(3, 4, 5);
		nnf.set(3, 5, 2);
		nnf.set(3, 7, 4);
		nnf.set(3, 8, 1);

		nnf.set(4, 0, 7);
		nnf.set(4, 8, 8);

		nnf.set(5, 0, 4);
		nnf.set(5, 1, 9);
		nnf.set(5, 3, 7);
		nnf.set(5, 4, 8);
		nnf.set(5, 6, 3);

		nnf.set(6, 0, 8);
		nnf.set(6, 2, 7);
		nnf.set(6, 4, 1);
		nnf.set(6, 7, 9);

		nnf.set(7, 2, 2);
		nnf.set(7, 6, 8);

		nnf.set(8, 3, 4);
		nnf.set(8, 4, 2);

		nnf.print();
		System.out.println();
		nnf.reduce();
		nnf.print();
		System.out.println();

	}

}
