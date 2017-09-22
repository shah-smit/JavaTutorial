package usingswing;

import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class SimpleBrowser {
	
	JEditorPane pane;

	class Hyperactive implements HyperlinkListener {

		public void hyperlinkUpdate(HyperlinkEvent e) {
		
			if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
				try {
					pane.setPage(e.getURL());
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		}
	}

	public SimpleBrowser(String home) {
		
		pane = new JEditorPane();
		pane.addHyperlinkListener(new Hyperactive());
		pane.setEditable(false);

		try {
			pane.setPage(home);
		} catch (IOException e) {
			pane.setContentType("text/html");
			pane.setText("<html>" + e + "</html>");
		}

		JScrollPane scrollPane = new JScrollPane(pane);
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add( scrollPane);
		f.setSize(512, 342);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new SimpleBrowser(args[0]);
	}
}
