package javaB.interFace.exam;

// 実行クラス
class InterfaceMain{
	public static void main(String[] args){
		Dog dog;
		if(args.length != 0){
			if(args[0].equals("big")){
				 // ★ここに処理を記入
			}else if(args[0].equals("small")){
				 // ★ここに処理を記入
			}else{
				System.out.println("引数に「big」 か 「small」を入力してください");
				return;
			}
		}else{
			System.out.println("引数に何か入力してください");
			return;
		}
		
		// ★ここに処理を記入
	}
}