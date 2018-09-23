package com.base.engine;

public class MainComponent {
	
	public static final int width = 800;
	public static final int height =600;
	public static final String title = "3D Engine";
	
	public MainComponent() {
		
	}
	
	public void start() {
		run();
	}

	public void stop() {
		
	}
	
	public void run() {
		while(!Window.isClosedRequested()) {
			render();
		}
	}
	
	public void render() {
		Window.render();
	}
	
	public void cleanup() {
		
	}
	
	public static void main(String[] args) {
		
		Window.createWindow(width, height, title);
		MainComponent game = new MainComponent();
		game.start();
	}
}
