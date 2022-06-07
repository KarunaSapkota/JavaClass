package com.example.swingProject.frames;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameClassExample {
	public static class MyFrame extends JFrame {
		public MyFrame() {
			setTitle("Library Management Application");
			setIconImage(Toolkit.getDefaultToolkit().getImage("res/logo.png"));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// frame.setSize(800, 500);
			setBounds(200, 100, 800, 500);

		}

		public static void main(String[] args) {
			MyFrame frame = new MyFrame();
			frame.setVisible(true);
		}

	}
}
