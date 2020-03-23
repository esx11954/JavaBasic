package javaB.argument;

class Args2{
	public static void main(String[] args){
		
		// ˆø”‚ğó‚¯æ‚Á‚½ê‡
		if(args.length > 0){
			
			String str = "";
			
			for(String s: args){
				str += s + " ";
			}
			
			System.out.println("ˆø”‚Æ‚µ‚Ä " + str + "‚ğó‚¯æ‚è‚Ü‚µ‚½");
			
		// ˆø”‚ğó‚¯æ‚ç‚È‚©‚Á‚½ê‡
		}else{
			System.out.println("ˆø”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		}
	}
}

