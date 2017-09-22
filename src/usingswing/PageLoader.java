package usingswing;

import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class PageLoader {
	
	public static void main(String[] args) {
		
		JEditorPane jep = new JEditorPane();
		jep.setEditable(false);
		
		try {
			jep.setPage(args[0]);
		} catch (IOException e) {
			jep.setContentType("text/html");
			jep.setText("<html>" + e + "</html>");
		}
		
		JScrollPane scrollPane = new JScrollPane(jep);
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(scrollPane);
		f.setSize(512, 342);
		f.setVisible(true);
	}
}
