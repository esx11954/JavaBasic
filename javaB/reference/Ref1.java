package javaB.reference;

class Ref1{ // Refered�N���X�ƘA�g
	public static void main(String[] args){
		
		// Referred�N���X�̕ϐ���2�A�I�u�W�F�N�g��2�p�ӂ���
		Referred ref1 = new Referred();
		Referred ref2 = new Referred();
		
		// ���ꂼ��̃t�B�[���h�ɓ����l����
		ref1.setMoney(1000);
		ref2.setMoney(1000);
		
		// false���o�͂����
		System.out.println(ref1 == ref2);
	}
}