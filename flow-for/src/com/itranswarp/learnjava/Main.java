package com.itranswarp.learnjava;

/**
 * for练习
 */
public class Main {

	public static void main(String[] args) {
		
		//给定一个数组，请用for循环倒序输出每一个元素
		System.out.println("倒序输出每一个元素");
		int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=ns.length; i>0; i--) {
            System.out.print("\t"+ns[i-1]);
        }
        System.out.println("");
        
        //利用for each循环对数组每个元素求和
        int[] ms = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int m : ms) {
            // TODO
        	sum = sum + m;
        }
        System.out.println(sum); // 55
        
        //利用for循环计算π：
		double pi = 0;
		double sum1 = 0;
		boolean minus = true;
		for (int i = 1,k=1; i < 50000000; i += 2,k++) {
			// TODO:
			sum1 = sum1 + Math.pow(-1, k+1)/i;
		}
		pi = 4*sum1;
		System.out.println(pi);
	}

}
