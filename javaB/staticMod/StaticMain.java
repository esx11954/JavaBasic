package javaB.staticMod;

class StaticMain{
	public static void main(String[] args){
		
		// �N���X��.�t�B�[���h�ŃA�N�Z�X
		StaticClass.n1 = 5;
		
		StaticClass sc1 = new StaticClass();
		sc1.n2 = 8;
		
		// �I�u�W�F�N�g�ϐ���.���\�b�h�ŃA�N�Z�X
		System.out.println(sc1.multiply());
		
		
		StaticClass sc2 = new StaticClass();
		sc1.n2 = 10;
		
		// �I�u�W�F�N�g�ϐ���.���\�b�h�ŃA�N�Z�X
		System.out.println(sc1.multiply());
	}
}