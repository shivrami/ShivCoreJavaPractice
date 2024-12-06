package com.corejava.practice;

public class MathEx 
{
	public static void main(String[] args) 
	{	
		System.out.println("------------------------------------");
		
		System.out.println(Math.ceil(2.01));
		System.out.println(Math.ceil(99.25));
		System.out.println(Math.ceil(-2.35));
		
		System.out.println(Math.floor(99.99));
		System.out.println(Math.floor(2.35));
		System.out.println(Math.floor(-2.35)); // -3.0
				
		System.out.println(Math.round(3.99));
		System.out.println(Math.round(3.49));
		
		System.out.println("------------------------------------");
		
		System.out.println(Math.random());
		
		System.out.println("------------------------------------");
		
		System.out.println(Math.sin(0));
		System.out.println(Math.sin(90));
		System.out.println(Math.sin(Math.toRadians(90)));
		
		System.out.println(Math.cos(0));
		System.out.println(Math.cos(90));
		System.out.println(Math.cos(Math.toRadians(90)));
		
		System.out.println(Math.tan(0));
		System.out.println(Math.tan(Math.toRadians(90)));
		
		System.out.println("------------------------------------");
		
		System.out.println(Math.toDegrees(0));
		System.out.println(Math.toDegrees(1.5707963267948966));
		
		System.out.println("------------------------------------");
		
		System.out.println(Math.toRadians(0));
		System.out.println(Math.toRadians(90));
		System.out.println(Math.toRadians(45));
		
		System.out.println("------------------------------------");
		
		System.out.println(Math.log(10));
		System.out.println(Math.log10(10));
		
		System.out.println("------------------------------------");
		
		System.out.println(Math.exp(3));
		System.out.println(Math.exp(6));
		
		System.out.println("------------------------------------");
		
		System.out.println(Math.sqrt(25));
		System.out.println(Math.sqrt(20));
		
		System.out.println("------------------------------------");
		
		System.out.println(Math.pow(2, 5));
		System.out.println(Math.pow(5, 8));
		
		System.out.println("------------------------------------");
		
		System.out.println(Math.max(500, 1000));
		System.out.println(Math.max(5, 10));
		
		System.out.println("------------------------------------");
		
		System.out.println(Math.min(10, 20));
		System.out.println(Math.min(500, 100));
		
		System.out.println("------------------------------------");
		
		int ans = Math.abs(-35);
		System.out.println(ans);
		
		System.out.println(Math.abs(-50));
		
		System.out.println("------------------------------------");
		
		System.out.println("E = "+Math.E);
		System.out.println("PI = "+Math.PI);
	}
}
