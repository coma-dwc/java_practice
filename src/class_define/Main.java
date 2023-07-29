package class_define;
//クラスの定義
	class Main {

		public static void main(String[] args) {
			// printDataメソッドとfullNameメソッドの呼び出しを書き換え
			Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);            
			Person.printData(Person.fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
		}
}
