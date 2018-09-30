package com.base.engine;

public class Vector2f 
{
	private float x;
	public float getX() {
		return x;
	}

	public Vector2f(float x, float y)
	{ 
		this.x =x;
		this.y =y;
	}
	
	public String toString()
	{
		return "(" + x + " " + y + ")";
	}
	
	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	private float y;
	
	
}
	
