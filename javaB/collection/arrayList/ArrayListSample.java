package javaB.collection.arrayList;

import java.util.ArrayList;

class ArrayListSample{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		// ���X�g�ɐ��l�����b�p�[�N���X�Ɍ^�ϊ����Ēǉ�
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(2));
		list.add(Integer.valueOf(3));
		
		// �S�v�f�\��
		System.out.println("list�̑S�v�f..." + list);
		
		// list��3�Ԗڂ�\��
		System.out.println("list��3�Ԗ�..." + list.get(2));
		
		// list��1�Ԗڂ��폜
		list.remove(0);
		
		// �S�v�f�\��
		System.out.println("list�̑S�v�f..." + list);
		
		// �v�f���\��
		System.out.println("list�̗v�f��..." + list.size());
		
		int sum = 0;
		for(Object i: list){
			sum = sum + (int)i; // �v�Z����ɂ�int�^�ɃL���X�g���K�v
		}
		System.out.println("list�̍��v..." + sum);
	}
}