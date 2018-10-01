package com.work.tcs;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;
/**
 * 
 * @author Smit
 * {src} http://www.codejava.net/java-se/swing/jpanel-basic-tutorial-and-examples
 */
@SuppressWarnings("serial")
public class PrintPanel extends JPanel {
	private String username,escort, companyName;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEscort() {
		return escort;
	}

	public void setEscort(String escort) {
		this.escort = escort;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public PrintPanel(String username, String escort, String companyName, double width, double height){
		this.username = username;
        this.escort = escort;
        this.companyName = companyName;
        setLayout(new GridBagLayout());
        setSize((int)width,(int)height);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        add(new JLabel("Name:"), constraints);
 
        constraints.gridx = 1;
        add(new JLabel(username), constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 1;     
        add(new JLabel("Company Name"), constraints);
         
        constraints.gridx = 1;
        add(new JLabel(companyName), constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;     
        add(new JLabel("Escort"), constraints);
         
        constraints.gridx = 1;
        add(new JLabel(escort), constraints);
        
//        setBorder(BorderFactory.createTitledBorder(
//                BorderFactory.createEtchedBorder(), "Login Panel"));
        setSize((int)width,(int)height);
        
	}
	
	public static void main(String[] args){
		JFrame j = new JFrame();
		j.setSize(500, 500);
		j.add(new PrintPanel("s","s","s",432,144));
		j.setVisible(true);
	}
}
