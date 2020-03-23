package javaB.parse;

import java.util.regex.Pattern;

class Parse1{
	public static void main(String[] args){
		
		// 引数が1つで数値に変換可能なら2乗して出力
		if(args.length == 1){
			if(isNumber(args[0])){
				
				int n = Integer.parseInt(args[0]);
				System.out.println("引数の2乗は " + n * n + " です");
				
			}else{
				// 数値以外が入力された場合
				System.out.println("数字を入力してください");
			}
		}else if(args.length > 1){
			// 引数が2つ以上だった場合
			System.out.println("引数が多すぎます");
		}else{
			// 引数なしの場合
			System.out.println("引数を入力してください");
		}
	}
	
	// 数値に変換可能かを判定するメソッド
	public static boolean isNumber(String s) {
		
		boolean bool = Pattern.compile("^-?[0-9]+$").matcher(s).find();
    	
		if(bool){
			System.out.println(s + " は数字です");
		}else{
			System.out.println(s + " は数字ではありません");
		}
		
		return bool;
	}
}