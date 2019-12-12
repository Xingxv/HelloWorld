package com.itranswarp.learnjava;

import java.util.StringJoiner;

/**
 * 核心类-StringJoiner
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String select = buildSelectSql(table, fields);
		System.out.println(select);
		System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
	}

	static String buildSelectSql(String table, String[] fields) {
		// TODO:
		StringJoiner sJoiner = new StringJoiner(", ","SELECT "," FROM "+table);
		for (String fidle : fields) {
			sJoiner.add(fidle);
		}
		return sJoiner.toString();
		
	}

}
