package javaB.regex;

import java.util.regex.Pattern;
import java.util.Scanner;

class RegularEx2{
	public static void main(String[] args){
		
		System.out.print("���͂��Ă������� > ");
		
		
		// ���͂��󂯎�邽�߂̃N���X
		Scanner scanner = new Scanner(System.in);
		String input_text = scanner.nextLine();
		
		// ���s
		System.out.println();
		
		// �󂯎���������񂪐������ǂ�������
		boolean bool = Pattern.matches("^[0-9]*$", input_text);
		
		if(bool){
			System.out.println(input_text + " �͐��l�ł�");
		}else{
			System.out.println(input_text + " �͐��l�ł͂���܂���");
		}
	}
}