package javaB.finalMod;

class FinalDefine{
	private static final String CO_NAME = "株式会社レグルカセ";
	private static final String CO_ADDRESS = "東京都千代田区神田佐久間町2-8-9 シャンピア秋葉原ビル7F";
	private static final String CO_CEO = "富岡一輝";
	

	public static void showCoDetail(){
		System.out.println(FinalDefine.CO_NAME + " の住所は " + FinalDefine.CO_ADDRESS + " です");
		System.out.println(FinalDefine.CO_NAME + " の社長は " + FinalDefine.CO_CEO + " です");
	}
}