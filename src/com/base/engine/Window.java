 package com.base.engine;
 import org.lwjgl.*;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Window {
	public static void createWindow(int width, int height, String title) {
		Display.setTitle(title);
		try {
			Display.setDisplayMode(new DisplayMode(width, height));
			Display.create();
			System.out.println("window created");
		} catch (LWJGLException e) {
			System.out.println("window created EX");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void render() {
		Display.update();
	}
	
	public static boolean isClosedRequested() {
		return Display.isCloseRequested();
	}
	
	public static int getWidth() {
		return Display.getDisplayMode().getWidth();
	}
	
	public static int getHieght() {
		return Display.getDisplayMode().getHeight();
	}
	
	public static String getTitle() {
		return Display.getTitle();
	}
}
