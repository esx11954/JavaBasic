package javaB.parse;

class Parse2{ // ParseJudge�N���X�ƘA�g
	public static void main(String[] args){
		
		// ������1�Ȃ�ParseJudge�N���X���C���X�^���X��
		if(args.length == 1){
			ParseJudge pj = new ParseJudge(args[0]);
			
			// ���l�ɕϊ��\�Ȃ�2�悵�ďo��
			if(pj.isNumber()){
				System.out.println("������2��� " + pj.getResult() + " �ł�");
				
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