package javaB.finalMod;

class FinalMain{
	public static void main(String[] args){
		
		// FinalDefineクラスをインスタンス化せずにフィールドにアクセス
		System.out.println(FinalDefine.CO_NAME + " の住所は " + FinalDefine.CO_ADDRESS + " です");
		System.out.println(FinalDefine.CO_NAME + " の社長は " + FinalDefine.CO_CEO + " です");
		
		// ↓finalが付いたフィールドにアクセスしようとするとコンパイルエラー
		// FinalDefine.CO_ADDRESS = "株式会社レグル";
		
		// ★以下の記述だけで上記を実行できるようにFinalDefineクラスを書き換えてみましょう
		// FinalDefine.showCoDetail();
	}
}