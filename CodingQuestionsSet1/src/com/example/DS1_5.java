package com.example;

public class DS1_5 {
	
	void swap(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	}
}
