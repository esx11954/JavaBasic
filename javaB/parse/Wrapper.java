package javaB.parse;

class Wrapper{
	public static void main(String[] args){
		
		// int型からもString型からも変換可能
		Integer int1 = Integer.valueOf(123); 
		Integer int2 = Integer.valueOf("123"); 
		
		// 計算も可能
		System.out.println(int1 + int1);
		System.out.println(int2 + int2);
		
		// int1とint2の同値比較
		System.out.println(int1.equals(int2));
		
		// int1とint2の大小を比較
		System.out.println(int1.compareTo(int2));
		
		// Integer型からString型に変換
		String strInt = int1.toString();
		
		// 文字列なので計算はできない
		System.out.println(strInt + strInt);
	}
}