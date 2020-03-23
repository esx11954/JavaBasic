package javaB.reference.exam;

import javaB.reference.Refered;

class Ref2{
	public static void main(String[] args){
		
		/*
		 * 以下値渡し
		 */
		int n1 = 1000;
		int n2 = n1;
		
		System.out.println("n1..." + n1);
		System.out.println("n2..." + n2);
		
		n2 = 0;
		
		System.out.println("n2のみを変更");
		System.out.println("n1..." + n1);
		System.out.println("n2..." + n2);
		
		// 改行
		System.out.println();
		
		/*
		 * 以下参照渡し
		 */
		// ★Referedクラスを"ref1"という変数名でインスタンス化
		
		// ★上記オブジェクトのmoneyフィールドにセッターを使用して1000を代入
		
		// ここで参照渡しが行われる
		Refered ref2 = ref1;
		
		// trueが出力される
		System.out.println(ref1 == ref2);
		
		System.out.println("ref1のmoney..." + ref1.getMoney());
		System.out.println("ref2のmoney..." + ref2.getMoney());
		
		// ref2のフィールドを更新
		ref2.setMoney(0);
		
		// オブジェクトは共有のため同じ結果となる
		System.out.println("ref2のみを変更");
		System.out.println("ref1のmoney..." + ref1.getMoney());
		System.out.println("ref2のmoney..." + ref2.getMoney());
	}
}