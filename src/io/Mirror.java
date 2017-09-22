package io;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Mirror {

	JTextArea text;

	public Mirror() {

		show(read("./src/io/Mirror.java"));
	}

	class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			write(text.getText(), "MeModified.java");
		}
	}

	private void show(String str) {

		text = new JTextArea();
		text.setText(str);

		JScrollPane scroller = new JScrollPane(text);
		scroller
				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroller.setPreferredSize(new Dimension(800, 800));

		JPanel panel = new JPanel();
		panel.add(scroller);

		JButton button = new JButton("Save");
		button.addActionListener(new ButtonListener());

		JFrame frame = new JFrame();
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900, 900);
		frame.setVisible(true);
	}

	private String read(String file) {

		String fileAsString = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));

			StringBuffer stringBuff = new StringBuffer();
			String line = null;
			while ((line = reader.readLine()) != null)
				stringBuff.append(line).append("\n");

			reader.close();
			fileAsString = stringBuff.toString();
		} catch (IOException e) {
			System.out.println("Could not read file");
		}
		return fileAsString;
	}

	private void write(String str, String file) {

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write(str, 0, str.length());
			out.close();
		} catch (IOException e) {
			System.out.println("Could not write to file");
		}
	}

	public static void main(String[] args) {

		new Mirror();
	}
}
