package com.itranswarp.learnjava;

/**
 * 抛出异常
 */
public class Main {

	public static void main(String[] args) {
		try {
			System.out.println(tax(2000, 0.1));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(tax(-200, 0.1));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(tax(2000, -0.1));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static double tax(int salary, double rate) throws IllegalAccessException {
		// TODO: 如果传入的参数为负，则抛出IllegalArgumentException
		if (salary<0||rate<0) {
			throw new IllegalAccessException();
		}
		return salary * rate;
	}
}
