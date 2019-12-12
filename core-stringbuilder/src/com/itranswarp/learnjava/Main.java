package com.itranswarp.learnjava;

/**
 * 核心类-StringBuilder 
 * 使用StringBuilder构造一个INSERT语句
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String insert = buildInsertSql(table, fields);
		System.out.println(insert);
		System.out.println(
				"INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)".equals(insert) ? "测试成功" : "测试失败");
	}

	static String buildInsertSql(String table, String[] fields) {
		// TODO:
		StringBuilder sb = new StringBuilder();
//		sb.append("INSERT INTO ").append(table+" (");
//		for (int i = 0; i < fields.length; i++) {
//			sb.append(fields[i]);
//			if (i<fields.length-1) {
//				sb.append(", ");
//			}
//		}
//		sb.append(" VALUES (?, ?, ?)");
		  sb = sb.append("INSERT INTO ").append(table).append(" (" ).append(String.join(", ",fields)).append(")").append(" VALUES (?, ?, ?)");
		return sb.toString();
	}

}
