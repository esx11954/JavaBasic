package javaB.parse;

class Wrapper{
	public static void main(String[] args){
		
		// int�^�����String�^������ϊ��\
		Integer int1 = Integer.valueOf(123); 
		Integer int2 = Integer.valueOf("123"); 
		
		// �v�Z���\
		System.out.println(int1 + int1);
		System.out.println(int2 + int2);
		
		// int1��int2�̓��l��r
		System.out.println(int1.equals(int2));
		
		// int1��int2�̑召���r
		System.out.println(int1.compareTo(int2));
		
		// Integer�^����String�^�ɕϊ�
		String strInt = int1.toString();
		
		// ������Ȃ̂Ōv�Z�͂ł��Ȃ�
		System.out.println(strInt + strInt);
	}
}