package javaB.collection.hashMap;

import java.util.HashMap;

class HashMapSample{
	public static void main(String[] args){
		HashMap map = new HashMap();
		
		// mapにキーと値を追加
		map.put("会社名", "レグルカセ");
		map.put("所属", "SI事業部");
		
		// キーで値を取得
		System.out.println(map.get("会社名"));
		System.out.println(map.get("所属"));
		
		System.out.println();
		
		// 所属の値を変更
		map.put("所属", "管理部");
		System.out.println(map.get("会社名"));
		System.out.println(map.get("所属"));
		
		System.out.println();
		
		// 要素の削除
		map.remove("所属");
		
		// 新たなキーと値の追加
		map.put("ID", 1234);
		
		// 全ての値を取得して表示
		for(Object key: map.keySet()){
			System.out.println(map.get(key));
		}
	}
}