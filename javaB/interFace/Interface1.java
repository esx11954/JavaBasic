package javaB.interFace;


// Dogインターフェース
interface Dog{
	public void bark();
}

// Dogインターフェースを実装したBigDogクラス
class BigDog implements Dog{
	// barkメソッドをオーバーライド
	public void bark(){
		System.out.println("わんわん！");
	}
}

// 実行クラス
class Interface1{
	public static void main(String[] args){
		
		Dog dog = new BigDog();
		
		dog.bark();
	}
}



