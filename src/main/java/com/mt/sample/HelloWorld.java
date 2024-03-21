package com.mt.sample;

/**
 * Hello world!
 *
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Class1. We are awesome!" + getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		String m = "MencoDev";
		return new Date();

	}

}
