package usingswing;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;

public class BetterBrowser {

	private JEditorPane pane;
	private JTextField address;
	private int currentIndex;
	private String home = "http://doc.gold.ac.uk/~mas01tb/index.html";
	private ArrayList<URL> history = new ArrayList<URL>();

	class Hyperactive implements HyperlinkListener {

		public void hyperlinkUpdate(HyperlinkEvent e) {

			if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
				newPage(e.getURL());
		}
	}

	class AddressListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			try {
				URL url = new URL(address.getText());
				newPage(url);
			} catch (IOException ex) {
				printHTML(ex.toString());
			}
		}
	}

	class BackButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			setPage(currentIndex - 1);
		}
	}

	class ForwardButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			setPage(currentIndex + 1);
		}
	}

	private void newPage(URL url) {
		try {
			pane.setPage(url);

			// clear history for this point forwards
			int i = history.size() - 1;
			while (i > currentIndex)
				history.remove(i--);

			history.add(url);
			currentIndex++;
			address.setText(url.toString());
		} catch (IOException e) {
			printHTML(e.toString());
		}
	}

	private void setPage(int desiredIndex) {

		if (desiredIndex >= 0 && desiredIndex < history.size()) {
			try {
				URL url = history.get(desiredIndex);
				pane.setPage(url);
				currentIndex = desiredIndex;
				address.setText(url.toString());
			} catch (IOException e) {
				printHTML(e.toString());
			}
		}
	}

	private void printHTML(String message) {

		pane.setContentType("text/html");
		pane.setText("<html>" + message + "</html>");
	}

	public BetterBrowser() {

		home = "http://www.goldsmiths.ac.uk/computing/";
		int width = 900;
		int height = 500;
		pane = new JEditorPane();
		pane.addHyperlinkListener(new Hyperactive());
		pane.setEditable(false);
		pane.setPreferredSize(new Dimension(width, height));

		JScrollPane scrollPane = new JScrollPane(pane);
		scrollPane
				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		JButton backButton = new JButton("<<");
		backButton.addActionListener(new BackButtonListener());

		JButton forwardButton = new JButton(">>");
		forwardButton.addActionListener(new ForwardButtonListener());

		address = new JTextField(50);
		address.setText(home);
		address.addActionListener(new AddressListener());

		currentIndex = -1;
		try {
			newPage(new URL(home));
		} catch (MalformedURLException e) {
			printHTML(e.toString());
		}

		JPanel panel = new JPanel();
		panel.add(backButton);
		panel.add(forwardButton);
		panel.add(address);

		JFrame frame = new JFrame(home);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.NORTH, panel);
		frame.getContentPane().add(BorderLayout.CENTER, scrollPane);
		frame.setSize(width, height + 50);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new BetterBrowser();
	}
}
