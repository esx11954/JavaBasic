package javaB.generics;

class GenericsDto{
	
	// コンストラクタ
	public GenericsDto(String name, int age, String gender, String favorite){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.favorite = favorite;
	}
	
	// 名前
	String name;
	
	// 年齢
	int age;
	
	// 性別
	String gender;
	
	// 好物
	String favorite;

	//各フィールドのゲッター
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getGender(){
		return gender;
	}
	public String getFavorite(){
		return favorite;
	}
}