package javaB.multiDim;

class MultiDim1{
	public static void main(String[] args){
		
		// 多次元配列の生成
		String[][] goods = {{"犬", "猫", },
						 {"Java", "C", "Ruby"},
						 {"2020年", "5月", "15日", "15時"}};
		
		// 多次元配列の値を取り出す
		System.out.println(goods[0][1]);
		System.out.println(goods[1][0]);
		System.out.println(goods[2][2]);
	}
}