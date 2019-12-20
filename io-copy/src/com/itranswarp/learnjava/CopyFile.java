package com.itranswarp.learnjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * InputStream和OutputStream
 */
public class CopyFile {

	public static void main(String[] args) throws IOException {
//		if (args.length != 2) {
//			System.err.println("Usage:\n  java CopyFile.java <source> <target>");
//			System.exit(1);
//		}
		copy("E:\\git\\java\\io-copy\\bin\\copy-test.txt", "E:\\git\\java\\io-copy\\src\\copy-test.txt");
	}

	static void copy(String source, String target) throws IOException {
		// 友情提示：测试时请使用无关紧要的文件
		// TODO:
		System.out.println("开始复制");
		try (InputStream input = new FileInputStream(source); 
	             OutputStream output = new FileOutputStream(target)) {
				byte[] buffer = new byte[1024];
				int len;
				while ((len = input.read(buffer)) != -1) {
					output.write(buffer, 0, len);
					output.flush();
				}
				System.out.println("复制成功");
			}
	}
}
