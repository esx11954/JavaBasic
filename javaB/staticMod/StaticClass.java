package javaB.staticMod;

class StaticClass{
	static int n1;
	int n2;
	
	// 2�̃t�B�[���h���|���Z���郁�\�b�h
	public int multiply(){
		return n1 * this.n2;
	}
}