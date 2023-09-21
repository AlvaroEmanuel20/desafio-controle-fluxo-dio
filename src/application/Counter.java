package application;

import exceptions.InvalidParameterException;

public class Counter {

	private int initialNum;
	private int finalNum;
	
	public Counter(int initialNum, int finalNum) {
		this.initialNum = initialNum;
		this.finalNum = finalNum;
	}

	public int getInitialNum() {
		return initialNum;
	}

	public void setInitialNum(int initialNum) {
		this.initialNum = initialNum;
	}

	public int getFinalNum() {
		return finalNum;
	}

	public void setFinalNum(int finalNum) {
		this.finalNum = finalNum;
	}
	
	public void count() {
		try {
			if (this.finalNum <= this.initialNum ) 
				throw new InvalidParameterException("The second number must be greater than the first");
			
			for (int i = 1; i <= this.finalNum - this.initialNum; i++) {
				System.out.println("Print the number: " + i);
			}
		} catch(InvalidParameterException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
}
