package javaB.argument;

class Args1{
	public static void main(String[] args){
		
		// �������󂯎�����ꍇ
		if(args.length > 0){
			String str = args[0];
			System.out.println("�����Ƃ���" + str + "���󂯎��܂���");
			
		// �������󂯎��Ȃ������ꍇ
		}else{
			System.out.println("��������͂��Ă�������");
		}
	}
}

