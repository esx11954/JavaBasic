package javaB.exception;

class ThrowsException{
	
	public void parse(String i) throws Exception{
		
		// ���l�ȊO���󂯎���NumberFormatException������
		System.out.println("������ " + Integer.parseInt(i) + " �ɐ��l�ϊ����܂���");
	}
}