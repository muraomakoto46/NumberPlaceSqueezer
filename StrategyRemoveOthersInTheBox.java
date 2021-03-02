package box;
/**
 * とあるマス[y][x]の値が7だと確定している。
 * そこで、マス[y][x]のほかの候補、{1,2,3,4,5,6,8,9}を消す。
 *  このクラスは正しく動作した。
 *
 * */
public class StrategyRemoveOthersInTheBox implements InterfaceRemovableStrategy {
	private Box[][] field;

	public StrategyRemoveOthersInTheBox(Box[][] field) {
		this.field = field;
	}

	@Override
	public void remove(int x, int y,int value) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i<=9 ; i++) {
			if(i != value) {
				field[y][x].remove(i);
			}
		}
	}

}
