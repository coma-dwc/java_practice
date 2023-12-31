package class_scanner;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("名前： ");
		
		//変数nameを定義し、コンソールから文字列を受け取って代入
		String firstName = scanner.next();
		
		System.out.print("名字： ");
		String lastName = scanner.next();
		
		System.out.print("年齢： ");
		int age = scanner.nextInt();
		
		System.out.print("身長(m)： ");
		double height = scanner.nextDouble();
		
		System.out.print("体重(kg)： ");
		double weight = scanner.nextDouble();
		
		Person.printData(Person.fullName(firstName, lastName), age, height, weight);
	}
}