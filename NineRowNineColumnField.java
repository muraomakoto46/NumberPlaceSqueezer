package box;

public class NineRowNineColumnField {
	private final Box[][] fields= new Box[9][9];

	public NineRowNineColumnField() {
		//initiate

		for(int x=0;x<9;x++) {
			for(int y=0;y<9;y++) {
				fields[y][x] = new Box();
			}
		}
	}


	/**
	 *
	 * setは前処理をする。
	 * 問題文を作成したいなら、このメソッドを用いて値を格納してください。
	 * set(int x,int y, int value)
	 * 現在狂っている。第一引数にyの値を代入してください。
	 * 第二引数にxの値を代入してください。
	 * y行の左からx番目にvalueを代入する。
	 * 0<=x<=8
	 * 0<=y<=8
	 * 1<=value<9
	 * */
	public void set(int x,int y,int value) {
		//fields[y][x].remove(value);
		/*前処理*/
		InterfaceRemovableStrategy irs;
		irs = new StrategyRemoveOthersInTheBox(fields);
		irs.remove(x, y, value);
	}

	/**
	 * reduceは各マスの候補から、正解ではない数を外していく。
	 * */
	public void reduce() {
		//InterfaceSqueeze is;
		SqueezeFactory factory = new SqueezeFactory(fields);
		for(int i = 0;i<10;i++) {
			factory.create(SqueezeFactory.type.HORIZONTAL).squeeze();
			factory.create(SqueezeFactory.type.VERTICAL).squeeze();
			factory.create(SqueezeFactory.type.SQUARE).squeeze();
			factory.create(SqueezeFactory.type.CUT_HORIZONTAL).squeeze();
			factory.create(SqueezeFactory.type.CUT_VERTICAL).squeeze();
		}

	}


	public void print() {
		for(int x=0;x<9;x++) {
			for(int y=0;y<9;y++) {
				fields[y][x].print();
			}
			System.out.println();
		}
	}

}
