package box;

import java.util.ArrayList;
import java.util.Iterator;

final public class Box implements InterfaceBox {
	private ArrayList<Integer> list;
	private int position;
	public Box() {
		list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);

		//System.out.println(list.size());

		position = 0;
	}

	@Override
	public Integer fetch() {
		// TODO 自動生成されたメソッド・スタブ
		if(position >= list.size()) {
				position = 0;
		}
		return list.get(position++);
	}

	/**
		Eliminate candidate number from list.
		but list must own at least one item.
	*/
	public void remove(Integer number) {
		if(list.contains(number))
			if(list.size()>1){{
				/*
				 * ArrayList remove(int index)
				 * */
				list.remove(list.indexOf(number));
			}
		}
	}

	/**引数で指定された要素だけ残してそれ以外を消す。
	 * ただし引数の値は1から9までに限定される。*/
	public void eliminateOthers(Integer number) {
		if(1<=number && number<=9 ) {
			if(list.contains(number)) {
				//まず全消しし
				list.clear();
				//引数で指定した値を入れればいいだけ。
				list.add(number);

			}
		}
	}

	public boolean contains(Integer number) {
		return list.contains(number);
	}

	public Iterator<Integer> iterator(){
		return list.iterator();
	}

	public Integer get() {
		return list.get(0);
	}

	public boolean isLastOne() {
		boolean result = false;
		if(list.size() == 1) {
			result = true;
		}
		return result;
	}

	/**
	 * print list items
	 * */
	public void print() {
		//System.out.print("{");
		list.stream().forEach(s -> System.out.print(s));
		System.out.print(",");
	}
}
