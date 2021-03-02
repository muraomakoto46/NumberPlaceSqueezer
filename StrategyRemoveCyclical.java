package box;

public class StrategyRemoveCyclical {
	private Box[][] field;
	private InterfaceSqueeze is;
	public StrategyRemoveCyclical(Box[][] field) {
		this.field = field;
	}

	/**
	 * あるマスの候補が残り1つしかない。
	 * それが6だとしよう。
	 * だけど、縦方向に調査すると重複するものがあるから消す。
	 * 横方向にも精査してみると重複するものがあったら消す。
	 * 小地区でも
	 * */
	public void remove() {
		// TODO 自動生成されたメソッド・スタブ

		for(int i=0;i<9;i++) {
			for(int j=0; j<9; j++) {
				if(field[j][i].isLastOne()) {
					//field[j][i].print();
					//System.out.print(field[j][i].get());


				}
			}
			//System.out.println();
		}

		System.out.println();
	}

}
