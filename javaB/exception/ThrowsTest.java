package javaB.exception;

class ThrowsTest{
	public void method(int i){
		if(i == 0){
			throw new Exception();
		}
	}
}
