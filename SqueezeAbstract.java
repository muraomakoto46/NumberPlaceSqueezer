package box;

public abstract class SqueezeAbstract implements InterfaceSqueeze{
	protected Box[][] fields;
	protected int value;
	public SqueezeAbstract(Box[][] fields) {
		this.fields = fields;
	}

	public void squeeze() {
		// TODO 自動生成されたメソッド・スタブ
		for(int x=0;x<9;x++) {
			for(int y=0; y<9; y++) {
				if(fields[y][x].isLastOne()) {
					this.mend(x, y);
				}
			}
		}
	}

	protected abstract void mend(int x,int y);

}
