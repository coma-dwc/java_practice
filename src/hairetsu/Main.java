package hairetsu;
//配列

//class Main {
//	public static void main(String[] args) {
//		//変数namesに配列を代入
//		String[] names = {"山田","田中", "佐藤"};
//		
//		//インデックス番号が0の要素を出力
//		System.out.println(names[0]);
//		
//		//インデックス番号が2の要素を出力
//		System.out.println(names[2]);
//	}
//}


//配列の要素の上書き

//class Main {
//	public static void main(String[] args) {
//		//変数languagesを定義し、配列を代入
//		String[] languages = {"Ruby", "PHP", "Python"};
//		
//		//インデックス番号が1の要素を出力
//		System.out.println(languages[1]);
//		
//		//インデックス番号が1の要素をJavaで上書き
//		languages[1] = "Java";
//		
//		//インデックス番号が1の要素を出力
//		System.out.println(languages[1]);
//	}
//}


//配列と繰り返し

//class Main {
//	public static void main(String[] args) {
//		String[] names = {"山田", "田中", "佐藤"};
//		
//		//for文を用いて、「私の名前は〇〇です」と出力
//		for(int i = 0; i < names.length; i++) {
//			System.out.println("私の名前は" + names[i] + "です");
//		}
//	}
//}

//配列用のfor文　拡張for文の文法

//class Main {
//	public static void main(String[] args) {
//		String[] names = {"山田", "田中", "佐藤"};
//		
//		//配列用のfor文(拡張for文)を用いて「私の名前は〇〇です」と出力
//		for(String name: names) {
//			System.out.println("私の名前は" + name + "です");
//		}
//	}
//}


//奇数と偶数、それぞれの和を出力

class Main {
	public static void main(String[] args) {
		//変数numberに、与えられた数字の配列を代入
		int [] numbers = {1,4,6,9,13,16};
		
		int oddSum = 0;  //奇数
		int evenSum = 0; //偶数
		
		//for文を用いて、配列numbersの偶数の和と奇数の和を求める
		for(int number :numbers) {
			if(number % 2 == 0) {
				evenSum += number;
			} else {
				oddSum += number;
			}
		}
		
		System.out.println("奇数の和は" + oddSum + "です");
		System.out.println("偶数の和は" + evenSum + "です");
	}
}