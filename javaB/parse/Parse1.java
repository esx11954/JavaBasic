package javaB.parse;

import java.util.regex.Pattern;

class Parse1{
	public static void main(String[] args){
		
		// ������1�Ő��l�ɕϊ��\�Ȃ�2�悵�ďo��
		if(args.length == 1){
			if(isNumber(args[0])){
				
				int n = Integer.parseInt(args[0]);
				System.out.println("������2��� " + n * n + " �ł�");
				
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
	
	// ���l�ɕϊ��\���𔻒肷�郁�\�b�h
	public static boolean isNumber(String s) {
		
		boolean bool = Pattern.compile("^-?[0-9]+$").matcher(s).find();
    	
		if(bool){
			System.out.println(s + " �͐����ł�");
		}else{
			System.out.println(s + " �͐����ł͂���܂���");
		}
		
		return bool;
	}
}