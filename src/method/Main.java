package method;

//メソッド

//class Main {
//	public static void main(String[] args) {
//		hello();
//	}
//	
//	public static void hello() {
//		//"Helo World"を"Hello Java"に書き換え
//		System.out.println("Hello Java");
//	}
//}

//メソッドの定義

//class Main {
//	public static void main(String[] args) {
//		//printDataメソッドを呼び出す
//		printData();
//	}
//	
//	//printDataメソッドを定義
//	public static void printData() {
//		System.out.println("私の名前はKate Jonesです");
//	}
//}


//引数

//class Main {
//	public static void main(String[] args) {
//		//引数に「Kate Jones」を渡す
//		printData("Kate Jones");
//		
//		//引数に「Jonn Christopher Smith」を渡す
//		printData("Jone Christpher Smith");
//	}
//	
//	//引数を受け取る
//	public static void printData(String name) {
//		//「私の名前は〇〇です」と出力されるように書き換える
//		System.out.println("私の名前は" + name + "です");
//	}
//}


//複数の引数

//class Main {
//	public static void main(String[] args) {
//		//それぞれ年齢に関する引数を追加
//		printData("Kate Jones", 27);
//		printData("John Christopher Smith", 65);
//	}
//	
//	//年齢に関する引数を受け取る
//	public static void printData(String name, int age) {
//		System.out.println("私の名前は" + name + "です");
//		//「年齢は〇〇歳です」と出力
//		System.out.println("年齢は" + age + "歳です");
//	}
//}


//メソッドの戻り値

//class Main {
//	public static void main(String[] args) {
//		//fullNameメソッドの結果を変数nameに代入
//		String name = fullName("Kate", "Jones");
//		
//		//printDataの引数を書き換え
//		printData(name, 27);
//		
//		//書き換えない
//		printData("John Christopher Smith", 65);
//	}
//	
//	public static void printData(String name, int age) {
//		System.out.println("私の名前は" + name + "です");
//		System.out.println("年齢は" + age + "歳です");
//	}
//	
//	//fullNameメソッドを定義  (第1引数:forstName  第2引数:lastName 戻り値の型:文字列)
//	public static String fullName(String firstName, String lastName) {
//		return firstName + " " + lastName;
//	}
//}


//メソッドのオーバーロード

//class Main {
//	public static void main(String [] args) {
//		printData(fullName("Kate", "Jones"),27);
//		
//		//fullNameメソッドを用いて、printDataの引数を書き換え
//		printData(fullName("John", "Christpher", "Smith"),65);
//	}
//	
//	public static void printData(String name, int age) {
//		System.out.println("私の名前は" + name + "です");
//		System.out.println("年齢は" + age + "歳です");
//	}
//	
//	public static String fullName(String firstName, String lastName) {
//		return firstName + " " + lastName;
//	}
//	
//	//fullNameメソッドを定義 (第1引数:firstName 第2引数:middleName 第3引数:lastName 戻り値の型:文字列)
//	public static String fullName(String firstName, String middleName, String lastName) {
//		return firstName + " " + middleName + " " + lastName;
//	}
//}


//メソッドの組み合わせ

//class Main {
//	public static void main(String[] args) {
//		printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
//		printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
//	}
//	
//	public static void printData(String name, int age, double height, double weight) {
//		System.out.println("私の名前は" + name + "です");
//		System.out.println("年齢は" + age + "歳です");
//		System.out.println("身長は" + height + "mです");
//		System.out.println("体重は" + weight + "kgです");
//		
//		//変数bmiに、bmiメソッドを用いてBMIを代入
//		double bmi = bmi(height, weight);
//		
//		//変数bmiを用いて「BMIは〇〇です」と出力
//		System.out.println("BMIは" + bmi + "です");
//	}
//	
//	public static String fullName(String firstName, String lastName) {
//		return firstName + " " + lastName;
//	}
//	
//	public static String fullName(String firstName, String middleName, String lastName) {
//		return firstName + " " + middleName + " " + lastName;
//	}
//	
//	//bmiメソッドを定義
//	public static double bmi(double height, double weight) {
//		return weight / height / height;
//	}
//}


//真偽値の戻り値

class Main {
	public static void main(String[] args) {
		printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
		printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
	}
	
	public static void printData(String name, int age, double height, double weight) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "mです");
		System.out.println("体重は" + weight + "kgです");
		
		double bmi = bmi(height, weight);
		System.out.println("BMIは" + bmi + "です");
		
		//isHealthyメソッドの結果で条件分岐を行う
		if (isHealthy(bmi)) {
			System.out.println("健康です");
		} else {
			System.out.println("健康ではありません");
		}
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public static String fullName(String firstName, String middleName, String lastName) {
		return firstName + " " + middleName + " " + lastName;
	}
	
	public static double bmi(double height, double weight) {
		return weight / height / height;
	}
	
	//isHealthyメソッドを定義
	public static boolean isHealthy(double bmi) {
		return bmi >= 18.5 && bmi < 25.0;
	}
}
