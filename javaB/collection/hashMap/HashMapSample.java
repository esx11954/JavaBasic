package javaB.collection.hashMap;

import java.util.HashMap;

class HashMapSample{
	public static void main(String[] args){
		HashMap map = new HashMap();
		
		// map�ɃL�[�ƒl��ǉ�
		map.put("��Ж�", "���O���J�Z");
		map.put("����", "SI���ƕ�");
		
		// �L�[�Œl���擾
		System.out.println(map.get("��Ж�"));
		System.out.println(map.get("����"));
		
		System.out.println();
		
		// �����̒l��ύX
		map.put("����", "�Ǘ���");
		System.out.println(map.get("��Ж�"));
		System.out.println(map.get("����"));
		
		System.out.println();
		
		// �v�f�̍폜
		map.remove("����");
		
		// �V���ȃL�[�ƒl�̒ǉ�
		map.put("ID", 1234);
		
		// �S�Ă̒l���擾���ĕ\��
		for(Object key: map.keySet()){
			System.out.println(map.get(key));
		}
	}
}