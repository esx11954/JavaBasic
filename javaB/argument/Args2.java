package javaB.argument;

class Args2{
	public static void main(String[] args){
		
		// �������󂯎�����ꍇ
		if(args.length > 0){
			
			String str = "";
			
			for(String s: args){
				str += s + " ";
			}
			
			System.out.println("�����Ƃ��� " + str + "���󂯎��܂���");
			
		// �������󂯎��Ȃ������ꍇ
		}else{
			System.out.println("��������͂��Ă�������");
		}
	}
}

