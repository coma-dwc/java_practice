package jouken;

//条件分岐 if文

//class Main {
//	public static void main(String[] args) {
//		//条件式に直接trueをいれる
//		if(true) {
//			System.out.println("条件式がtrueのため、出力されます");
//		}
//		
//		//条件式に直接falseをいれる
//		if(false) {
//			System.out.println("条件式がfalseのため、出力されません");
//		}
//		
//		int x = 5;
//		//if文を用いて、変数xが2より大きいとき、「xは2より大きい」と出力する
//		if(x > 2) {
//			System.out.println("xは2より大きい");
//		}
//		
//		//if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力する
//		if(x > 8) {
//			System.out.println("xは8より大きい");
//		}
//	}
//}


//条件分岐 else,else if

//class Main {
//	public static void main(String[] args) {
//		int number = 12;
//		
//		//numberが20より小さいとき、どちらでもないときの条件分岐を追加
//		if(number < 10) {
//			System.out.println("10より小さい");
//		}
//		else if (number < 20) {
//			System.out.println("10以上、20より小さい");
//		}
//		else {
//			System.out.println("20以上");
//		}
//	}
//}


//switch文
//class Main {
//	public static void main(String[] args) {
//		int n = 1;
//		
//		//switch文を用いて、変数nの値に応じて条件分岐
//		switch (n) {
//		case 1:
//			System.out.println("大吉です");
//			break;
//		case 2:
//			System.out.println("吉です");
//			break;
//		}
//	}
//}

//class Main {
//	public static void main(String[] args) {
//		int n = 0;
//		
//		switch (n) {
//		case 1:
//			System.out.println("大吉です");
//			break;
//		case 2:
//			System.out.println("中吉です");
//			break;
//			//defalutを用いて、変数nの値がどのcaseにも合致しない場合の処理を記述
//		default:
//			System.out.println("凶です");
//			break;
//		}
//	}
//}


//while文
//繰り返し処理を用いて10から1までカウントダウン
//class Main {
//	public static void main(String[] args) {
//		int number = 10;
//		
//		//while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理を作る
//		while(number > 0) {
//			System.out.println(number);
//			number --;
//		}
//	}
//}



//for文
//for文を用いて、10回ループする繰り返し処理を記述
//class Main {
//	public static void main(String[] args) {
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + "回目のループです");
//		}
//	}
//}


//break,continue
//while文の処理で、iが5の倍数の時、繰り返し処理を終了する
class Main {
	public static void main(String[] args) {
		System.out.println("== while文==");
		int i = 1;
		while (i < 10) {
			//iが5の倍数のとき、繰り返し処理を終了
			if(i % 5 == 0) {
				break;
			}
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("==for文==");
		for(int j = 1; j < 10; j++) {
			//jが3の倍数のとき、処理をスキップ
			if(j % 3 == 0) {
				continue;
			}
			
			System.out.println(j);
		}
	}
}
