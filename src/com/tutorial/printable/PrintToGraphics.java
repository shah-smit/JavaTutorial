package com.tutorial.printable;

//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.print.PageFormat;
//import java.awt.print.Paper;
//import java.awt.print.Printable;
//import java.awt.print.PrinterException;
//import java.awt.print.PrinterJob;
//
//import net.sourceforge.barbecue.Barcode;
//import net.sourceforge.barbecue.BarcodeException;
//import net.sourceforge.barbecue.BarcodeFactory;
//import net.sourceforge.barbecue.output.OutputException;
//
//public class PrintToGraphics implements Printable {
//	private Barcode b;
//
//	private PrintToGraphics(Barcode b) {
//
//		this.b = b;
//
//	}
//
//	@Override
//	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
//
//		int result = NO_SUCH_PAGE;
//		if (pageIndex == 0) {
//
//			result = PAGE_EXISTS;
//
//			int x = (int) pageFormat.getImageableX();
//			int y = (int) pageFormat.getImageableY();
//
//			int width = (int) pageFormat.getImageableWidth();
//			int height = (int) pageFormat.getImageableHeight();
//
//			graphics.translate(x, y);
//			try {
//				b.draw((Graphics2D) graphics, 0, 0);
//			} catch (OutputException ex) {
//
//				ex.printStackTrace();
//
//			}
//
//		}
//
//		return result;
//	}
//
//	public static void main(String args[]) {
//		PrinterJob printerJob = PrinterJob.getPrinterJob();
//		PageFormat pageFormat = printerJob.defaultPage();
//		Paper paper = new Paper();
//
//		final double widthPaper = (1.2 * 72);
//		final double heightPaper = (1.5 * 72);
//
//		paper.setSize(widthPaper, heightPaper);
//		paper.setImageableArea(0, 0, widthPaper, heightPaper);
//
//		pageFormat.setPaper(paper);
//
//		pageFormat.setOrientation(PageFormat.LANDSCAPE);
//
//		if (printerJob.printDialog()) {
//			try {
//				Barcode b = BarcodeFactory.createCode128("Hello");
//				printerJob.setPrintable(new PrintToGraphics(b), pageFormat);
//
//				printerJob.print();
//			} catch (PrinterException e) {
//				e.printStackTrace();
//			} catch (BarcodeException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
