package javaB.interFace;


// Dog�C���^�[�t�F�[�X
interface Dog{
	public void bark();
}

// Dog�C���^�[�t�F�[�X����������BigDog�N���X
class BigDog implements Dog{
	// bark���\�b�h���I�[�o�[���C�h
	public void bark(){
		System.out.println("�����I");
	}
}

// ���s�N���X
class Interface1{
	public static void main(String[] args){
		
		Dog dog = new BigDog();
		
		dog.bark();
	}
}



