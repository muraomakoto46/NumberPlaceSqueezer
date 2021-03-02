package box;

public class MainBoxTest {

	private static Box box = new Box();
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("hello world.");

		int a=0;
		while (a<20) {
			System.out.println(box.fetch());
			a++;
		}

		test(1);
		test(4);
		test(9);

		test(5);
		test(7);
		test(2);
		test(3);
		test(6);
		test(8);


	}

	private static void test(int number) {

		System.out.println(" I would like to remove some numbers");
		System.out.println("eliminate number "+number);
		box.remove(number);


		System.out.println(" show bliefing");
		for(int i=0;i<20;i++) {
			System.out.println(box.fetch());
		}


	}

}
