package com.example.swingProject.frames;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class AppWindow extends JFrame {
	public AppWindow() {
		setTitle("Library Management Application");
		setIconImage(Toolkit.getDefaultToolkit().getImage("res/logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(800, 500);
		setBounds(200, 100, 800, 500);
	}

	public static void main(String[] args) {
		AppWindow window = new AppWindow();
		window.setVisible(true);
	}
}
