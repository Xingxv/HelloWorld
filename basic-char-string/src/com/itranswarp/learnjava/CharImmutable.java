package com.itranswarp.learnjava;
/**
 *  字符不可变
 * @author LYW
 *
 */
public class CharImmutable {
	
	public static void main(String[] args) {
        String s = "hello";  //s指向"hello"
        String t = s;  //t指向s指向的"hello"
        s = "world";   //s指向"world"
        System.out.println(t); // t是"hello"还是"world"?  t是"hello"
    }
}
