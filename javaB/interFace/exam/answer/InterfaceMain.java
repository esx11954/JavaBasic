package javaB.interFace.exam;

// ���s�N���X
class InterfaceMain{
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