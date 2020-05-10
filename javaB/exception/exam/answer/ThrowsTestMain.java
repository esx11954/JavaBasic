package javaB.exception.exam;

class ThrowsTestMain{
	public static void main(String[] args){
		ThrowsTest tt = new ThrowsTest();
		try{
			tt.method(0);
		}catch(Exception e){
			System.out.println("ó·äOÇ™î≠ê∂ÇµÇ‹ÇµÇΩ");
		}
		
	}
}