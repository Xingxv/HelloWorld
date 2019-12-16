package com.itranswarp.learnjava;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * slf4j和logback
 */
public class Main {

	static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		logger.info("Start process {}...", Main.class.getName());
		try {
			"".getBytes("invalidCharsetName");
		} catch (UnsupportedEncodingException e) {
			// TODO: 使用logger.error(String, Throwable)打印异常
			logger.error("错误",e);
		}
		logger.info("Process end.");
	}
}
