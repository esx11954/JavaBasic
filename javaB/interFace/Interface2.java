package javaB.interFace;

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

// 実行クラス
class Interface2{
	public static void main(String[] args){
		Dog dog;
		if(args.length != 0){
			if(args[0].equals("big")){
				dog = new BigDog();
			}else if(args[0].equals("small")){
				dog = new SmallDog();
			}else{
				System.out.println("引数に「big」 か 「small」を入力してください");
				return;
			}
		}else{
			System.out.println("引数に何か入力してください");
			return;
		}
		
		dog.bark();
		dog.run();
		dog.eat();
	}
}

