package javaB.reference;

class Ref2{
	public static void main(String[] args){
		
		/*
		 * �ȉ��l�n��
		 */
		int n1 = 1000;
		int n2 = n1;
		
		System.out.println("n1..." + n1);
		System.out.println("n2..." + n2);
		
		n2 = 0;
		
		System.out.println("n2�݂̂�ύX");
		System.out.println("n1..." + n1);
		System.out.println("n2..." + n2);
		
		// ���s
		System.out.println();
		
		/*
		 * �ȉ��Q�Ɠn��
		 */
		Referred ref1 = new Referred();
		ref1.setMoney(1000);
		
		// �����ŎQ�Ɠn�����s����
		Referred ref2 = ref1;
		
		// true���o�͂����
		System.out.println(ref1 == ref2);
		
		System.out.println("ref1��money..." + ref1.getMoney());
		System.out.println("ref2��money..." + ref2.getMoney());
		
		// ref2�̃t�B�[���h���X�V
		ref2.setMoney(0);
		
		// �I�u�W�F�N�g�͋��L�̂��ߓ������ʂƂȂ�
		System.out.println("ref2�݂̂�ύX");
		System.out.println("ref1��money..." + ref1.getMoney());
		System.out.println("ref2��money..." + ref2.getMoney());
	}
}