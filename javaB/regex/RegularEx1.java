package javaB.regex;

import java.util.regex.Pattern;

class RegularEx1{
	public static void main(String[] args){
		
		String phone = "";
		
		// ���͔���
		if(args.length > 0){
			phone = args[0];
		}else{
			System.out.println("��������͂��Ă�������");
			return;
		}
		
		// �p�^�[���𐶐�
		String pattern = "^[0-9]{3}-?[0-9]{4}-?[0-9]{4}$" ;
		Pattern p = Pattern.compile(pattern);
		
		// �p�^�[���Ƀ}�b�`���Ă��邩����
		if(p.matcher(phone).find()){
			System.out.println(phone + " �͌g�ѓd�b�ԍ��ł�");
		}else{
			System.out.println(phone + " �͌g�ѓd�b�ԍ��ł͂���܂���");
		}
	}
}