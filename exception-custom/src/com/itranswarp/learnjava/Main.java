package com.itranswarp.learnjava;

/**
 * 自定义异常
 */
public class Main {

	public static void main(String[] args) {
		try {
			String token = login("admin", "pass");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String token = login("admin", "pass");
		System.out.println("Token: " + token);
	}

	static String login(String username, String password) throws LoginFailedException,UserNotFoundException {
		if (username.equals("admin")) {
			if (password.equals("password")) {
				return "xxxxxx";
			} else {
				// 抛出LoginFailedException:
				throw new LoginFailedException("Bad username or password.");
			}
		} else {
			// 抛出UserNotFoundException:
			throw new UserNotFoundException("User not found.");
		}
	}
}
