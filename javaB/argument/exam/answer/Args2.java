package javaB.argument.exam;

class Args2{
	public static void main(String[] args){
		
		// 引数を受け取った場合
		if(args.length > 0){
			
			String str = "";
			
			for(String s: args){
				str += s + " ";
			}
			
			System.out.println("引数として " + str + "を受け取りました");
			
		// 引数を受け取らなかった場合
		}else{
			System.out.println("引数を入力してください");
		}
	}
}

