package box;

public class SqueezeVertical extends SqueezeAbstract implements InterfaceSqueeze {

	public SqueezeVertical(Box[][] fields) {
		super(fields);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void squeeze() {
		// TODO 自動生成されたメソッド・スタブ
		super.squeeze();

	}

	public void mend(int x, int y) {
		super.value = super.fields[y][x].get();
		//System.out.println("value = " + value + ";");
		for(int i = 0; i<9; i++) {
			if(y != i) {
				super.fields[i][x].remove(value);
			}
		}
	}

}
