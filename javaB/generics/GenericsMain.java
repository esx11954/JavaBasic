package javaB.generics;

import java.util.*;

class GenericsMain{
	public static void main(String[] args){
		
		// ArrayListのジェネリクス
		ArrayList<GenericsDto> list = new ArrayList<GenericsDto>();
		
		// Dtoオブジェクトをlistに追加
		list.add(new GenericsDto("田中", 31, "男", "ラーメン"));
		list.add(new GenericsDto("井田", 15, "女", "スイーツ"));
		list.add(new GenericsDto("佐藤", 56, "男", "焼きそば"));
		list.add(new GenericsDto("上田", 47, "女", "ピザ"));
		
		// listの全要素の全フィールドを出力
		for(GenericsDto dto: list){// 型変換をする必要がない
			System.out.println("名前..." + dto.getName());
			System.out.println("年齢..." + dto.getAge());
			System.out.println("性別..." + dto.getGender());
			System.out.println("好物..." + dto.getFavorite());
			System.out.println();
		}
		
		// HashMapのジェネリクス
		// キーをString型、値をInteger型に指定したHashMap
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// listに格納されたオブジェクトから名前、年齢をそれぞれキーと値として取り出し、mapに格納する
		for(GenericsDto dto: list){
			map.put(dto.getName(), dto.getAge());
		}
		
		// keySet()でmapからそれぞれのキーを取得し、get()で値を出力する
		for(String key: map.keySet()){
			System.out.println(key + "の年齢: " + map.get(key));
		}
	}
}