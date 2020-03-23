package javaB.exception;

class Exception1{
	public static void main(String[] args){
		
		// 引数に0未満か5以上を指定するとArrayIndexOfBoundsException発生
		// 引数に0を指定するとArithmeticException発生
		// 引数に10を指定するとExcptionをthrow
		
		try{
			// 数字以外を受け取るとNumberFormatException発生→最下catchへ
			int i = Integer.parseInt(args[0]);
			
			if(i == 10){
				throw new Exception("10は例外と見なします");
			}
			
			int[] array = {0, 10, 20, 30, 40};
			
			System.out.println("配列のインデックス " + args[0] + " は " + array[i] + " です");
			System.out.println("1000を " + array[i] + " で割ると " + 1000 / array[i] + " です");
			
		}catch(ArrayIndexOutOfBoundsException e){ // 配列の要素外を指定した場合の例外処理
			System.out.println("例外発生！");
			System.out.println("引数に0から4までの数字を入力してください");
			System.out.println("引数に10を指定すると例外が発生します");
			
		}catch(ArithmeticException e){ // 0除算が行われた場合の例外処理
			System.out.println(e + " が発生しました");
			System.out.println("0で除算はできません");
			
		}catch(Exception e){ // 引数に10を受け取った場合 // 引数に文字列を受け取ったとき
			System.out.println("例外の内容..." + e);
			
		}finally{
			// 必ず実行される
			System.out.println("ばいばい");
		}
	}
}