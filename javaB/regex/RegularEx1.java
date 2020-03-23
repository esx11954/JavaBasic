package javaB.regex;

import java.util.regex.Pattern;

class RegularEx1{
	public static void main(String[] args){
		
		String phone = "";
		
		// 入力判定
		if(args.length > 0){
			phone = args[0];
		}else{
			System.out.println("引数を入力してください");
			return;
		}
		
		// パターンを生成
		String pattern = "^[0-9]{3}-?[0-9]{4}-?[0-9]{4}$" ;
		Pattern p = Pattern.compile(pattern);
		
		// パターンにマッチしているか判定
		if(p.matcher(phone).find()){
			System.out.println(phone + " は携帯電話番号です");
		}else{
			System.out.println(phone + " は携帯電話番号ではありません");
		}
	}
}