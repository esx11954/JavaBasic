package javaB.multiDim.exam;

class MultiDim2{
	public static void main(String[] args){
		
		// 多次元配列を生成
		String[][] goods = {{"犬", "猫"},
						 {"Java", "C", "Ruby"},
						 {"2020年", "5月", "15日", "15時"}};
		
		// 多次元配列のすべての要素を出力
		for(int i = 0; i < goods.length; i++){
			for(int j = 0; j < goods[i].length; j++){
				System.out.println(goods[i][j]);
			}
		}
	}
}