package javaB.multiDim;

class MultiDim1{
	public static void main(String[] args){
		
		// �������z��̐���
		String[][] goods = {{"��", "�L", },
						 {"Java", "C", "Ruby"},
						 {"2020�N", "5��", "15��", "15��"}};
		
		// �������z��̒l�����o��
		System.out.println(goods[0][1]);
		System.out.println(goods[1][0]);
		System.out.println(goods[2][2]);
	}
}