package box;

public final class SqueezeFactory {
	public static enum type  {HORIZONTAL,VERTICAL,SQUARE,CUT_HORIZONTAL,CUT_VERTICAL};
	private Box[][] boxes;
	public SqueezeFactory(Box[][] boxes) {
		this.boxes = boxes;
	}
	public InterfaceSqueeze create(type t) {

		/*今後改良点や変更点が発見される可能性が高い
		 * 変更されるごとにクラス名が変わる。
		 * SqueezeHorizontalV2とか
		 * SqueezeVerticalV77とか。
		 * 何十回も名称変更するのを、何十か所もやらなきゃならなくなる。
		 * それは、とてもきついよね。
		 * そこで、Factoryパターンを用いる。、
		 * */
		switch(t) {
			case HORIZONTAL:
				return new SqueezeHorizontal(boxes);
			case VERTICAL:
				return new SqueezeVertical(boxes);
			case SQUARE:
				return new SqueezeSquare(boxes);
			case CUT_HORIZONTAL:
				return new SqueezeCutBodyHorizontal(boxes);
			case CUT_VERTICAL:
				return new SqueezeCutBodyVertical(boxes);
			default:
				System.out.println("Error! Type true type at argument.");
				return new SqueezeHorizontal(boxes);

		}
	}
}
