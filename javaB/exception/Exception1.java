package javaB.exception;

class Exception1{
	public static void main(String[] args){
		
		// ������0������5�ȏ���w�肷���ArrayIndexOfBoundsException����
		// ������0���w�肷���ArithmeticException����
		// ������10���w�肷���Excption��throw
		
		try{
			// �����ȊO���󂯎���NumberFormatException�������ŉ�catch��
			int i = Integer.parseInt(args[0]);
			
			if(i == 10){
				throw new Exception("10�͗�O�ƌ��Ȃ��܂�");
			}
			
			int[] array = {0, 10, 20, 30, 40};
			
			System.out.println("�z��̃C���f�b�N�X " + args[0] + " �� " + array[i] + " �ł�");
			System.out.println("1000�� " + array[i] + " �Ŋ���� " + 1000 / array[i] + " �ł�");
			
		}catch(ArrayIndexOutOfBoundsException e){ // �z��̗v�f�O���w�肵���ꍇ�̗�O����
			System.out.println("��O�����I");
			System.out.println("������0����4�܂ł̐�������͂��Ă�������");
			System.out.println("������10���w�肷��Ɨ�O���������܂�");
			
		}catch(ArithmeticException e){ // 0���Z���s��ꂽ�ꍇ�̗�O����
			System.out.println(e + " ���������܂���");
			System.out.println("0�ŏ��Z�͂ł��܂���");
			
		}catch(Exception e){ // ������10���󂯎�����ꍇ // �����ɕ�������󂯎�����Ƃ�
			System.out.println("��O�̓��e..." + e);
			
		}finally{
			// �K�����s�����
			System.out.println("�΂��΂�");
		}
	}
}