package com.example.swingProject.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Panel Example");
		frame.setBounds(200, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		MyPanel panel = new MyPanel();
		frame.add(panel, BorderLayout.NORTH);
		frame.setVisible(true);

	}

	static class MyPanel extends JPanel {
		public MyPanel() {
			// setLayout(null);
			// JFrame frame;
			setBackground(Color.GRAY);
			setBounds(0, 0, 400, 200);
			JLabel header = new JLabel("Product Form");
			header.setBounds(100, 0, 200, 40);
			header.setFont(new Font("Vladimir script", Font.PLAIN, 30));
			header.setForeground(Color.GREEN);
			add(header);
			JLabel productNameLabel = new JLabel("Product Name: ");
			productNameLabel.setBounds(50, 40, 100, 30);
			add(productNameLabel);
			JButton button = new JButton("Click Here");
			button.setBounds(50, 100, 95, 30);
			frame.add(button);

		}

	}
}
