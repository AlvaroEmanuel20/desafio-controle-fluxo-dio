package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int initialNum = input.nextInt();
		int finalNum = input.nextInt();
		
		Counter counter = new Counter(initialNum, finalNum);
		counter.count();
		
		input.close();

	}

}
