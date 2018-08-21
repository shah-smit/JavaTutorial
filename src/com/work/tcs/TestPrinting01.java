package com.work.tcs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.imageio.ImageIO;
import javax.swing.JEditorPane;

import com.github.sarxos.webcam.Webcam;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.output.OutputException;

public class TestPrinting01 {

    private static PrintPanel editor;

    public static void main(String[] args) {

        try {
        	Webcam webcam = Webcam.getDefault();
            webcam.open();
            BufferedImage image = webcam.getImage();
            try {
				ImageIO.write(image, "JPG", new File("test.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           

            PrinterJob pj = PrinterJob.getPrinterJob();
            if (pj.printDialog()) {
                PageFormat pf = pj.defaultPage();
                Paper paper = pf.getPaper();
                double width = 4d * 72d;
                double height = 8d * 72d;
                double margin = 1d * 72d;
                paper.setSize(width, height);
                paper.setImageableArea(
                        margin,
                        margin,
                        width - (margin * 2),
                        height - (margin * 2));
//                editor = new JEditorPane();
                editor = new PrintPanel("s","s","s",width, height);
                System.out.println(editor.getComponents().length);
//                editor.setPage(new URL("http://shahsmit.co"));
                System.out.println("Before- " + dump(paper));
                pf.setOrientation(PageFormat.LANDSCAPE);
                pf.setPaper(paper);
                System.out.println("After- " + dump(paper));
                System.out.println("After- " + dump(pf));
                dump(pf);
                PageFormat validatePage = pj.validatePage(pf);
                System.out.println("Valid- " + dump(validatePage));

                Book pBook = new Book();
                pBook.append(new Page(), pf);
                pj.setPageable(pBook);

                try {
                    pj.print();
                } catch (PrinterException ex) {
                    ex.printStackTrace();
                }
            }

        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

    protected static String dump(Paper paper) {
        StringBuilder sb = new StringBuilder(64);
        sb.append(paper.getWidth()).append("x").append(paper.getHeight())
                .append("/").append(paper.getImageableX()).append("x").
                append(paper.getImageableY()).append(" - ").append(paper
                .getImageableWidth()).append("x").append(paper.getImageableHeight());
        return sb.toString();
    }

    protected static String dump(PageFormat pf) {
        Paper paper = pf.getPaper();
        return dump(paper);
    }

    public static class Page implements Printable {

        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
            if (pageIndex >= 1) {
                return Printable.NO_SUCH_PAGE;
            }

            Graphics2D g2d = (Graphics2D) graphics;
            // Be careful of clips...
//            g2d.setClip(0, 0, (int) pageFormat.getWidth(), (int) pageFormat.getHeight());
            g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());

            double width = pageFormat.getImageableWidth();
            double height = pageFormat.getImageableHeight();

            System.out.println("width = " + width);
            System.out.println("height = " + height);
            g2d.setColor(Color.CYAN);
            g2d.drawString("Tata Consultancy Services", 10, 20);
            
            g2d.setColor(Color.BLACK);
            g2d.drawString("Name:", 10, 50);
            g2d.drawString("Value:", 150, 50);
            
            g2d.drawString("Company Name:", 10, 70);
            g2d.drawString("Value:", 150, 70);
            
            g2d.drawString("Escort:", 10, 90);
            g2d.drawString("Value:", 150, 90);
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            
            g2d.drawString("Time In:", 10, 110);
            g2d.drawString(dtf.format(now), 150, 110);
            
//            try {
//				Barcode b = BarcodeFactory.createCodabar((int)(Math.random()*3221317)+"");
//				b.draw(g2d,0 , 0);
//			} catch (BarcodeException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (OutputException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

            g2d.setColor(Color.BLACK);
            g2d.draw(new Rectangle2D.Double(0, 0, width, height));
            
//            editor.setLocation(0, 0);
//            editor.setSize((int)width, (int)height);
//            editor.printAll(g2d);

            return Printable.PAGE_EXISTS;
        }
    }
}