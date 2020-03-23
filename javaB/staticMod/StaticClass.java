package javaB.staticMod;

class StaticClass{
	static int n1;
	int n2;
	
	// 2つのフィールドを掛け算するメソッド
	public int multiply(){
		return n1 * this.n2;
	}
}