package javaB.interFace.exam;

// Runインターフェース
interface Run{
	public void run();
}

// Eatインターフェース
interface Eat{
	public void eat();
}

// Dogインターフェース
interface Dog extends Run, Eat{
	public void bark();
}

// Dogインターフェースを実装したBigDogクラス
class BigDog implements Dog{
	public void bark(){
		System.out.println("わんわん！");
	}
	public void run(){
		System.out.println("run slowly");
	}
	public void eat(){
		System.out.println("eat faster");
	}
}

// Dogインターフェースを実装したSmallDogクラス
class SmallDog implements Dog{
	public void bark(){
		System.out.println("きゃんきゃん！");
	}
	public void run(){
		System.out.println("run faster");
	}
	public void eat(){
		System.out.println("eat slowly");
	}
}