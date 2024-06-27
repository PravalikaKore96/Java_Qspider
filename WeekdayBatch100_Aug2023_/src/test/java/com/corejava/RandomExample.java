
package com.corejava;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {

		Random  ran = new Random();
		int val =  ran.nextInt(100);
		System.out.println(val);

	}

}