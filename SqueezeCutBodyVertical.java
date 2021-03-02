package box;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
/**
 * 13479
 * 5
 * 2
 * 346
 * 8
 * 47
 * 69
 * 679
 *
 * このとき、1行目の13479を1にするべきでしょう。
 * */
public class SqueezeCutBodyVertical extends SqueezeAbstract implements InterfaceSqueeze {

	public SqueezeCutBodyVertical(Box[][] fields) {
		super(fields);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void squeeze() {
		// TODO 自動生成されたメソッド・スタブ
		for(int x=0;x<9;x++) {
			for(int y=0; y<9; y++) {
				//注意。！マーク↓が必要です。
				if(!fields[y][x].isLastOne()) {
					this.mend(x, y);
				}
			}
		}

		//this.mend(0, 1);
	}


	public void mend(int x, int y) {
		//2要素以上無いマスを減らすことはできない。
		//System.out.println("called mend() ;x =" + x + ";y = " + y);
		Iterator<Integer> it = fields[y][x].iterator();
		boolean contain = false;
		Queue<Integer> q = new ArrayDeque<>();
		while(it.hasNext()) {
			q.add(it.next());
			//System.out.println("Added at the Queue ");
		}

		//System.out.print("q.size = "+q.size()+" q has");
		//q.stream().forEach(s -> System.out.print(s));
		//System.out.println();


		while(!q.isEmpty()) {
			//System.out.print("☆ Queue is not empty ☆");
			int value = q.poll();
			//System.out.println("q.poll() = " + value);
			//このvalueが同じ列の中で、ほかの行のマスには無いかどうか調べる。
			for(int i = 0; i<9; i++) {
				if(i != x) {
					/*xとyの指し示す先が入れ替わっている。どこかで狂っている。
					 * 狂っているのになぜかうまく動いている。*/
					if(fields[y][i].contains(value)) {
						contain = true;
						//System.out.println("value"+"contain = true - SqueezeCutBodyVertical");
						//System.out.print("+++ ->");
						//fields[y][i].print();
						//System.out.println();
					}
				}
			}

			if(contain == false) {
				//System.out.println("contain = false; " +"value = "+ value );
				fields[y][x].eliminateOthers(value);
				//System.out.println("リムーブ後:");

				//fields[y][x].print();
				//System.out.println();
			}

				// 値リセット
				contain =false;
		}

	}

}
