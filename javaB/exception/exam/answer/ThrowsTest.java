package javaB.exception.exam;

class ThrowsTest{
	public void method(int i) throws Exception{
		if(i == 0){
			throw new Exception();
		}
	}
}
