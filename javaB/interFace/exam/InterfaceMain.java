package javaB.interFace.exam;

// ���s�N���X
class InterfaceMain{
	public static void main(String[] args){
		Dog dog;
		if(args.length != 0){
			if(args[0].equals("big")){
				 // �������ɏ������L��
			}else if(args[0].equals("small")){
				 // �������ɏ������L��
			}else{
				System.out.println("�����Ɂubig�v �� �usmall�v����͂��Ă�������");
				return;
			}
		}else{
			System.out.println("�����ɉ������͂��Ă�������");
			return;
		}
		
		// �������ɏ������L��
	}
}