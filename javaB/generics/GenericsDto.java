package javaB.generics;

class GenericsDto{
	
	// �R���X�g���N�^
	public GenericsDto(String name, int age, String gender, String favorite){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.favorite = favorite;
	}
	
	// ���O
	String name;
	
	// �N��
	int age;
	
	// ����
	String gender;
	
	// �D��
	String favorite;

	//�e�t�B�[���h�̃Q�b�^�[
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