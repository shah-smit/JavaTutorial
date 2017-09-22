package serialisation;

import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;

public class RestartableGooWorld extends GooWorld {

	public RestartableGooWorld(int w, int h, boolean b) {

		super(w, h, b);
	}

	public void windowClosing(WindowEvent e) {

		try {
			FileOutputStream fs = new FileOutputStream("gooables.ser");
			ObjectOutputStream os = null;
			os = new ObjectOutputStream(fs);
			os.writeObject(gooables);
			os.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		windowClosed(e);
	}

	public void load() throws FileNotFoundException, IOException,
			ClassNotFoundException {

		FileInputStream is = new FileInputStream("gooables.ser");
		ObjectInputStream os = new ObjectInputStream(is);

		gooables = (ArrayList<Gooable>) os.readObject();

		os.close();
	}
}
