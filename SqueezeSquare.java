package box;

public class SqueezeSquare extends SqueezeAbstract implements InterfaceSqueeze {

	public SqueezeSquare(Box[][] fields) {
		super(fields);
		// TODO 自動生成されたコンストラクター・スタブ
	}


	@Override
	public void squeeze() {
		// TODO 自動生成されたメソッド・スタブ
		super.squeeze();

	}

	@Override
	protected void mend(int x, int y) {
		// TODO 自動生成されたメソッド・スタブ
		int eriaBaseX=0;
		int eriaBaseY=0;
		if(fields[y][x].isLastOne()) {
			super.value = fields[y][x].get();

			/**if y valuable is 0,1,2
			 * then I estimate eria might be area1 , area2 , area 3
		 */

			//System.out.println("aaaaaaaaaaaa");
			//field[y][x].print();
			//System.out.println("bbbbbbbbbbbb");
			//what is y of center of square area

			//value = field[y][x].get();

			if(0<=y && y<=2) {
				eriaBaseY=0;
			}

			if(3<=y && y<=5) {
				eriaBaseY=3;
			}

			if(6<=y && y<=8) {
				eriaBaseY=6;
			}


			//what is x of center of square area

			if(0<=x && x<=2) {
				eriaBaseX=0;
			}

			if(3<=x && x<=5) {
				eriaBaseX=3;
			}

			if(6<=x && x<=8) {
				eriaBaseX=6;
			}

			if(x == 0 && y==0) {
				//System.out.println("(x,y)=(0,0) ");
				//System.out.println(super.fields[0][0].isLastOne());
				//System.out.print("the nuber are.....");
				//super.fields[0][0].print();
				//System.out.println();
				//System.out.println("eriaBaseX = "+eriaBaseX);
				//System.out.println("eriaBaseY = "+eriaBaseY);
			}

			for(int i = eriaBaseY;i<=(eriaBaseY+2);i++) {
				for(int j = eriaBaseX;j<=(eriaBaseX+2);j++) {
					if(i == 2 && j == 1 ) {
						//System.out.println("i =" + i + ";j = " + j);
					}
					if(i != x) {
						if(j != y) {
							super.fields[i][j].remove(super.value);
							//System.out.println("remove i="+ i + ";j=" + j + ";val=" + value);
						}
					}
				}
			}

		}


	}

}
