package com.tutorial.printable;

import java.awt.print.PrinterJob;

//import net.sourceforge.barbecue.Barcode;
//import net.sourceforge.barbecue.BarcodeFactory;

public class PrintingExample {
	public static void main(String[] args)
    {
        try
        {
            //Barcode b = BarcodeFactory.createCodabar((int)(Math.random()*3221317)+"");
//            PrinterJob job = PrinterJob.getPrinterJob();
//            job.setPrintable(b);
//            if (job.printDialog())
//            {
//                job.print();
//            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
