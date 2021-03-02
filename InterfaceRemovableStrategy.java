package box;
/**前処理専用のストラテジー*/
public interface InterfaceRemovableStrategy {
	/**
	 * 二次元配列の(2,2)が5だけであると分かっている場合、
	 * (0,2)から(8,2)までの、(2,2)以外のマスから5を消すべきだろう？
	 * */
	public abstract void remove(int x,int y,int value);
}
