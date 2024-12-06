package com.corejava.constructor;

public class Sphere 
{
	private int x;
	private int y;
	private int z;
	private int radius;
	
	public Sphere()
	{
		x=10;
		y=10;
		z=10;
		radius=10;
	}
	
	public Sphere(int x)
	{
		this.x=x;
		y=10;
		z=10;
		radius=10;
	}
	
	public Sphere(int x,int y)
	{
		this.x=x;
		this.y=y;
		z=10;
		radius=10;
	}
	
	public Sphere(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		radius=10;
	}
	
	public Sphere(int x,int y,int z,int radius)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.radius=radius;
	}
	
	public void displayData()
	{
		System.out.println("x = "+x+"\ty = "+y+"\tz = "+z+"\tradius = "+radius+"\n");
	}
}
