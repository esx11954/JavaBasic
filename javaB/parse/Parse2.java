package javaB.parse;

class Parse2{ // ParseJudge�N���X�ƘA�g
	public static void main(String[] args){
		
		// ������1�Ȃ�ParseJudge�N���X���C���X�^���X��
		// (�R���X�g���N�^�Ɉ����Ƃ��ăR�}���h���C��������n��)
		if(args.length == 1){
			// �������ɏ������L��
			
			// ���l�ɕϊ��\�Ȃ�2�悵�ďo��
			if(pj.isNumber()){
				// �������ɏ������L��
				
			}else{
				// ���l�ȊO�����͂��ꂽ�ꍇ
				System.out.println("��������͂��Ă�������");
				
			}
		}else if(args.length > 1){
			// ������2�ȏゾ�����ꍇ
			System.out.println("�������������܂�");
		}else{
			// �����Ȃ��̏ꍇ
			System.out.println("��������͂��Ă�������");
		}
	}
}