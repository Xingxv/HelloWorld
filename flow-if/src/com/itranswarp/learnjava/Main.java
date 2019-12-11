package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * 计算BMI
 * BMI = 体重(kg)除以身高(m)的平方

BMI结果：

过轻：低于18.5
正常：18.5-25
过重：25-28
肥胖：28-32
非常肥胖：高于32
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Height (m): ");
		double height = scanner.nextDouble();
		System.out.print("Weight (kg): ");
		double weight = scanner.nextDouble();
		// FIXME:
		double bmi = weight/Math.pow(height, 2);
		// TODO: 打印BMI值及结果
		System.out.printf("BMI=%.2f\n",bmi);
		if (bmi-18.5<0.00001) {
			System.out.println("过轻");
		} else if (bmi-18.5>=0.00001&&bmi-25<0.00001) {
			System.out.println("正常");
		} else if (bmi-25>=0.00001&&bmi-28<0.00001) {
			System.out.println("过重");
		} else if (bmi-28>=0.00001&&bmi-32<0.00001) {
			System.out.println("肥胖");
		} else if(bmi-32>=0.00001){
			System.out.println("非常肥胖");
		}
	}

}
