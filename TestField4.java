package box;
/**
 * 数独 難易度が最高級の問題を全自動で解く。
 * */
public class TestField4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		NineRowNineColumnField nrncf = new NineRowNineColumnField();

		nrncf.set(0, 1, 6);
		nrncf.set(0, 4, 9);
		nrncf.set(0, 7, 3);

		nrncf.set(1, 0, 3);
		nrncf.set(1, 5, 8);
		nrncf.set(1, 6, 9);
		nrncf.set(1, 8, 2);

		nrncf.set(2, 2, 1);
		nrncf.set(2, 6, 7);

		nrncf.set(3, 1, 4);
		nrncf.set(3, 4, 6);

		nrncf.set(4, 3, 9);
		nrncf.set(4, 7, 2);

		nrncf.set(5, 2, 2);
		nrncf.set(5, 8, 1);

		nrncf.set(6, 0, 5);
		nrncf.set(6, 8, 7);

		nrncf.set(7, 1, 1);
		nrncf.set(7, 3, 2);
		nrncf.set(7, 7, 4);


		nrncf.set(8, 0, 9);
		nrncf.set(8, 5, 7);
		nrncf.set(8, 6, 8);



		nrncf.print();

		System.out.println();
		System.out.println();

		nrncf.reduce();

		nrncf.print();
	}

}
