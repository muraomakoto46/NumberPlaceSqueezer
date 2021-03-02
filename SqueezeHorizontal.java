package box;

public class SqueezeHorizontal extends SqueezeAbstract implements InterfaceSqueeze {
	public SqueezeHorizontal(Box[][] fields) {
		super(fields);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	protected void mend(int x, int y) {
		super.value = super.fields[y][x].get();
		//System.out.println("value = " + value + ";");
		for(int i = 0; i<9; i++) {
			if(x != i) {
				super.fields[y][i].remove(value);
			}
		}


	}

}
