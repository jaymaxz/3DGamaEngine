package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game 
{
	public Game() {
		
	}
	
	public void input()
	{
		if(Input.getKeyDown(Keyboard.KEY_UP))
			System.out.println("keyup");
		if(Input.getKeyUp(Keyboard.KEY_UP))
			System.out.println("keyupdown");
		if(Input.getMouseDown(1))
			System.out.println("mouse" + " " + Input.getMousePosition().toString());
		if(Input.getMouseUp(1 ))
			System.out.println("mouserelease");
	}
	
	public void update()
	{
		
	}
	
	public void render()
	{
		
	}
}
