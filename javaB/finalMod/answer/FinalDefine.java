package javaB.finalMod;

class FinalDefine{
	private static final String CO_NAME = "エイトビット株式会社";
	private static final String CO_ADDRESS = "東京都豊島区東池袋1-18-1　Hareza Tower 20F"";
	private static final String CO_CEO = "深澤 弘樹";
	

	public static void showCoDetail(){
		System.out.println(FinalDefine.CO_NAME + " の住所は " + FinalDefine.CO_ADDRESS + " です");
		System.out.println(FinalDefine.CO_NAME + " の社長は " + FinalDefine.CO_CEO + " です");
	}
}
