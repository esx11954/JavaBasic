package javaB.exception;

class ThrowsMain{ // ThrowsExceptionクラスと連携
	public static void main(String[] args){
		
		// ThrowsExceptionクラスをインスタンス化
		ThrowsException te = new ThrowsException();
		
		try{
			// 数値変換メソッドにコマンドラインから受け取った引数を渡す
			te.parse(args[0]);

		}catch(ArrayIndexOutOfBoundsException e){ // 引数が入力されなかった場合
			System.out.println("引数を入力してください");
			
		}catch(Exception e){ // ThrowsExceptionクラスで数値変換できなかった場合
			System.out.println(args[0] + " は数値に変換できませんでした");
			
		}
	}
}