package com.itranswarp.learnjava;

import java.io.File;
import java.io.IOException;

import sun.tools.tree.ThisExpression;

/**
 *IO-File对象
 */
public class Main {

	public static void main(String[] args) throws IOException {
		File currentDir = new File(".");
		System.out.println("Documents/");
		listDir(currentDir.getCanonicalFile(),0);
	}

	static void listDir(File dir,int level) {
		// TODO: 递归打印所有文件和子文件夹的内容
		
//		System.out.println(dir);
		File[] fs = dir.listFiles();
		if (fs != null) {
			for (File f : fs) {
				if (f.isDirectory()) {
					printSpace(level);
					System.out.println(f.getName()+"/");
					listDir(f,level+1);
				}else {
					printSpace(level);
					System.out.println(f.getName());
				}
			}
		}
	}
	static void printSpace(int level){

        for(int i = 0; i < level; i++){

            System.out.print("  ");

        }

    }
}
