package javaB.parse;

class Parse2{ // ParseJudgeクラスと連携
	public static void main(String[] args){
		
		// 引数が1つならParseJudgeクラスをインスタンス化
		// (コンストラクタに引数としてコマンドライン引数を渡す)
		if(args.length == 1){
			// ★ここに処理を記入
			
			// 数値に変換可能なら2乗して出力
			if(pj.isNumber()){
				// ★ここに処理を記入
				
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
}