package com.tutorial.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TryFrame extends JFrame implements ActionListener {
	JLabel jl;
	
	
	public TryFrame(){
		JPanel jp = new JPanel();
		
		jl = new JLabel();
		jl.setText("Click button to get current time");
		jp.add(jl);
		
		JButton jb = new JButton();
		jb.setText("Button");
		jb.addActionListener(this);
		jp.add(jb);
		
		getContentPane().add(jp);
		setVisible(true);
		setSize(300,300);
		

	}
	
	public void actionPerformed(ActionEvent e){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		jl.setText(date.toString());
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TryFrame();
		
	}

}
