package javaB.exception;

class ThrowsMain{ // ThrowsException�N���X�ƘA�g
	public static void main(String[] args){
		
		// ThrowsException�N���X���C���X�^���X��
		ThrowsException te = new ThrowsException();
		
		try{
			// ���l�ϊ����\�b�h�ɃR�}���h���C������󂯎����������n��
			te.parse(args[0]);

		}catch(ArrayIndexOutOfBoundsException e){ // ���������͂���Ȃ������ꍇ
			System.out.println("��������͂��Ă�������");
			
		}catch(Exception e){ // ThrowsException�N���X�Ő��l�ϊ��ł��Ȃ������ꍇ
			System.out.println(args[0] + " �͐��l�ɕϊ��ł��܂���ł���");
			
		}
	}
}