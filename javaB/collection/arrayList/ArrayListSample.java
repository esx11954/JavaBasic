package javaB.collection.arrayList;

import java.util.ArrayList;

class ArrayListSample{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		// リストに数値をラッパークラスに型変換して追加
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(2));
		list.add(Integer.valueOf(3));
		
		// 全要素表示
		System.out.println("listの全要素..." + list);
		
		// listの3番目を表示
		System.out.println("listの3番目..." + list.get(2));
		
		// listの1番目を削除
		list.remove(0);
		
		// 全要素表示
		System.out.println("listの全要素..." + list);
		
		// 要素数表示
		System.out.println("listの要素数..." + list.size());
		
		int sum = 0;
		for(Object i: list){
			sum = sum + (int)i; // 計算するにはint型にキャストが必要
		}
		System.out.println("listの合計..." + sum);
	}
}