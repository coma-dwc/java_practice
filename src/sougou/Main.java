package sougou;

class Main {
	public static void main(String[] args) {
		//変数nameに、名前を代入(文字列)
		String name = "山田太郎";
		
		//変数ageに、年齢を代入(整数)
		int age = 20;
		
		//変数heightに、身長を代入(例：1.6)(小数)
		double height = 1.6;
		
		//変数weightに、体重を代入(例：55.0)(小数)
		double weight = 55.0;
		
		//変数bmiに、BMIを計算して代入(小数)
		//BMIは体重÷身長÷診療 で算出
		double bmi = weight / height / height;
		
		//名前、年齢、身長、体重、BMIに関する情報を出力
		System.out.println("名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "mです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("BMIは" + bmi + "です");
	}
}