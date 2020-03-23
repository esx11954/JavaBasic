package javaB.interFace;

// Run�C���^�[�t�F�[�X
interface Run{
	public void run();
}

// Eat�C���^�[�t�F�[�X
interface Eat{
	public void eat();
}

// Dog�C���^�[�t�F�[�X
interface Dog extends Run, Eat{
	public void bark();
}

// Dog�C���^�[�t�F�[�X����������BigDog�N���X
class BigDog implements Dog{
	public void bark(){
		System.out.println("�����I");
	}
	public void run(){
		System.out.println("run slowly");
	}
	public void eat(){
		System.out.println("eat faster");
	}
}

// Dog�C���^�[�t�F�[�X����������SmallDog�N���X
class SmallDog implements Dog{
	public void bark(){
		System.out.println("����񂫂��I");
	}
	public void run(){
		System.out.println("run faster");
	}
	public void eat(){
		System.out.println("eat slowly");
	}
}

// ���s�N���X
class Interface2{
	public static void main(String[] args){
		Dog dog;
		if(args.length != 0){
			if(args[0].equals("big")){
				dog = new BigDog();
			}else if(args[0].equals("small")){
				dog = new SmallDog();
			}else{
				System.out.println("�����Ɂubig�v �� �usmall�v����͂��Ă�������");
				return;
			}
		}else{
			System.out.println("�����ɉ������͂��Ă�������");
			return;
		}
		
		dog.bark();
		dog.run();
		dog.eat();
	}
}

