package javaB.regex;

import java.util.regex.Pattern;
import java.util.Scanner;

class RegularEx2{
	public static void main(String[] args){
		
		System.out.print("入力してください > ");
		
		
		// 入力を受け取るためのクラス
		Scanner scanner = new Scanner(System.in);
		String input_text = scanner.nextLine();
		
		// 改行
		System.out.println();
		
		// 受け取った文字列が数字かどうか判定
		boolean bool = Pattern.matches("^[0-9]*$", input_text);
		
		if(bool){
			System.out.println(input_text + " は数値です");
		}else{
			System.out.println(input_text + " は数値ではありません");
		}
	}
}