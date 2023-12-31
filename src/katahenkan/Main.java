package katahenkan;
//自動型変換

//class Main {
//	public static void main(String[] args) {
//		int month = 12;
//		int date = 31;
//		
//		//「12月31日」となるように変数と文字列を連結して出力
//		System.out.println(month + "月" + date + "日");
//		
//		//7を2で割った値を出力
//		System.out.println(7 / 2);
//		
//		//7.0を2.0で割った値を出力
//		System.out.println(7.0 / 2.0);
//		
//		//7を2.0で割った値を出力
//		System.out.println(7 / 2.0);
//	}
//}


//強制型変換

class Main {
	public static void main(String[] args) {
		int number1 = 7;
		int number2 = 2;
		System.out.println(number1 / number2);
		
		//number1をdouble型にキャストし、number2で割った値を出力
		System.out.println((double)number1 / number2);
	}
}