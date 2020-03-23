package javaB.reference;

class Ref1{ // Referedクラスと連携
	public static void main(String[] args){
		
		// Referredクラスの変数を2つ、オブジェクトを2つ用意する
		Referred ref1 = new Referred();
		Referred ref2 = new Referred();
		
		// それぞれのフィールドに同じ値を代入
		ref1.setMoney(1000);
		ref2.setMoney(1000);
		
		// falseが出力される
		System.out.println(ref1 == ref2);
	}
}