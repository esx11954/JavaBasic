package javaB.staticMod;

class StaticMain{
	public static void main(String[] args){
		
		// クラス名.フィールドでアクセス
		StaticClass.n1 = 5;
		
		StaticClass sc1 = new StaticClass();
		sc1.n2 = 8;
		
		// オブジェクト変数名.メソッドでアクセス
		System.out.println(sc1.multiply());
		
		
		StaticClass sc2 = new StaticClass();
		sc1.n2 = 10;
		
		// オブジェクト変数名.メソッドでアクセス
		System.out.println(sc1.multiply());
	}
}