package com.example.swingProject.frames;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Library Management Application");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("res/logo.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(800, 500);
		frame.setBounds(200, 100, 800, 500);
		frame.setVisible(true);

	}
}
