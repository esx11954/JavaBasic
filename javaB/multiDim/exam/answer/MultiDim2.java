package javaB.multiDim.exam;

class MultiDim2{
	public static void main(String[] args){
		
		// �������z��𐶐�
		String[][] goods = {{"��", "�L"},
						 {"Java", "C", "Ruby"},
						 {"2020�N", "5��", "15��", "15��"}};
		
		// �������z��̂��ׂĂ̗v�f���o��
		for(int i = 0; i < goods.length; i++){
			for(int j = 0; j < goods[i].length; j++){
				System.out.println(goods[i][j]);
			}
		}
	}
}