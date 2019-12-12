package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		int choice = 0;
		for (int i=0; i<1||i>3; ) {
			Scanner scanner = new Scanner(System.in);
			i = scanner.nextInt();
			choice=i;
			if (choice<1||choice>3) {
				System.out.println("不能大于3或小于0，请重新输入");
		
			}
		}
		System.out.println("你出:");
		System.out.println(witch(choice));
		// 计算机随机数 1, 2, 3:
		int random = (int)(1+Math.random()*(3-1+1));
		System.out.println("计算机出:");
		System.out.println(witch(random));
		int isLose = (choice + 3) % 3 - random;
		switch (isLose) {
		// TODO:
		case -1:
			System.out.println("你赢了");
			break;
		case 0:
			System.out.println("平局");
			break;	
		case 1:
			System.out.println("你输了");
			break;
		}
	
	}
	
	public static String witch(int n) {
		String x;
		switch (n) {
		case 1:
			x="石头";
			break;
			
		case 2:
			x="剪刀";
			break;
			
		case 3:
			x="布";
			break;	
			
		default:
			x=""+n;
			break;
		}
		return x;
	}

}
