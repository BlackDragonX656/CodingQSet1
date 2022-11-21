package com.example;

public class DS1_7 {
	
	int findBigger(int a, int b, int c) {
		if(a > b) {
			if(a > c) {
				return a;
			}else {
				return c;
			}
		}else {
			if(c > b) {
				return c;
			}else {
				return b;
			}
		}
	}
}
