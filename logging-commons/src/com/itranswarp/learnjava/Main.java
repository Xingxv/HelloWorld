package com.itranswarp.learnjava;

import java.io.UnsupportedEncodingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 使用Commons Logging
 */
public class Main {

	static final Log log = LogFactory.getLog(Main.class);//获取类的Log

	public static void main(String[] args) {
		log.info("Start process...");
		try {
			"".getBytes("invalidCharsetName");
		} catch (UnsupportedEncodingException e) {
			// TODO: 使用log.error(String, Throwable)打印异常
			log.error("此处错误",e);
		}
		log.info("Process end.");
	}
}
