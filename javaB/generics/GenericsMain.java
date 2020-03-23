package javaB.generics;

import java.util.*;

class GenericsMain{
	public static void main(String[] args){
		
		// ArrayList�̃W�F�l���N�X
		ArrayList<GenericsDto> list = new ArrayList<GenericsDto>();
		
		// Dto�I�u�W�F�N�g��list�ɒǉ�
		list.add(new GenericsDto("�c��", 31, "�j", "���[����"));
		list.add(new GenericsDto("��c", 15, "��", "�X�C�[�c"));
		list.add(new GenericsDto("����", 56, "�j", "�Ă�����"));
		list.add(new GenericsDto("��c", 47, "��", "�s�U"));
		
		// list�̑S�v�f�̑S�t�B�[���h���o��
		for(GenericsDto dto: list){// �^�ϊ�������K�v���Ȃ�
			System.out.println("���O..." + dto.getName());
			System.out.println("�N��..." + dto.getAge());
			System.out.println("����..." + dto.getGender());
			System.out.println("�D��..." + dto.getFavorite());
			System.out.println();
		}
		
		// HashMap�̃W�F�l���N�X
		// �L�[��String�^�A�l��Integer�^�Ɏw�肵��HashMap
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// list�Ɋi�[���ꂽ�I�u�W�F�N�g���疼�O�A�N������ꂼ��L�[�ƒl�Ƃ��Ď��o���Amap�Ɋi�[����
		for(GenericsDto dto: list){
			map.put(dto.getName(), dto.getAge());
		}
		
		// keySet()��map���炻�ꂼ��̃L�[���擾���Aget()�Œl���o�͂���
		for(String key: map.keySet()){
			System.out.println(key + "�̔N��: " + map.get(key));
		}
	}
}