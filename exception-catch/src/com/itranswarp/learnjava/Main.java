package com.itranswarp.learnjava;

/**
 * 捕获异常
 */
public class Main {

	public static void main(String[] args) {
		String a = "12";
		String b = "x9";
		// TODO: 捕获异常并处理
		try {
			int c = stringToInt(a);
			int d = stringToInt(b);
			System.out.println(c * d);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("错误NumberFormatException");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("错误Exception");
//			e.printStackTrace();
		} finally {
			System.out.println("END");
		}
	}

	static int stringToInt(String s) {
		return Integer.parseInt(s);
	}
}
