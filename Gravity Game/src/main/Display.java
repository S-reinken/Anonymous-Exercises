package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Display extends JFrame {

	private static final long serialVersionUID = 1L;

	static Movement mover;
	static ArrayList<RectangleGenerator> rectanglefield;
	JFrame panel;
	JButton hide;
	JComboBox colors;
	static boolean bluetrue;
	
	public Display()
	{
		setLayout(null);
		panel = new JFrame();
		panel.setSize(300, 300);
		panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setVisible(true);
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		hide = new JButton("Hide");
		panel.setBackground(Color.WHITE);
		c.gridx = 1;
		panel.add(hide, c);
		panel.setBounds(10, 10, 30, 30);
		panel.setVisible(true);
		colors = new JComboBox();
		colors.addItem("WHITE");
		colors.addItem("BLACK");
		colors.addItem("GREEN");
		colors.addItem("RED");
		colors.addItem("CYAN");
		colors.addItem("GRAY");
		colors.addItem("DARK GRAY");
		colors.addItem("LIGHT GRAY");
		colors.addItem("MAGENTA");
		colors.addItem("ORANGE");
		colors.addItem("PINK");
		colors.addItem("YELLOW");
		colors.addItem("ERASER");
		colors.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent event) {
				if (colors.getSelectedItem() == "WHITE") mover.color = "white";
				if (colors.getSelectedItem() == "BLACK") mover.color = "black";
				if (colors.getSelectedItem() == "GREEN") mover.color = "green";
				if (colors.getSelectedItem() == "RED") mover.color = "red";
				if (colors.getSelectedItem() == "CYAN") mover.color = "cyan";
				if (colors.getSelectedItem() == "GRAY") mover.color = "gray";
				if (colors.getSelectedItem() == "DARK GRAY") mover.color = "darkgray";
				if (colors.getSelectedItem() == "LIGHT GRAY") mover.color = "lightgray";
				if (colors.getSelectedItem() == "MAGENTA") mover.color = "magenta";
				if (colors.getSelectedItem() == "ORANGE") mover.color = "orange";
				if (colors.getSelectedItem() == "PINK") mover.color = "pink";
				if (colors.getSelectedItem() == "YELLOW") mover.color = "yellow";
				if (colors.getSelectedItem() == "ERASER") mover.color = "blue";
			}
			
		});
		c.gridx = 0;
		panel.add(colors, c);
		setSize(600, 1000);
		setBackground(Color.BLUE);
		mover = new Movement();
		addKeyListener(mover);
		
	}
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.WHITE);
	}
	public void paint(Graphics g)
	{
		
		g.setColor(Color.BLUE);
		if (mover.yesmove==true || bluetrue == true) 
		g.fillRect(0, 0, 600, 685);
		bluetrue = false;
		//g.setColor(Color.BLACK);
		/*g.fillRect(rectanglefield.get(1).xposition1, rectanglefield.get(1).yposition1, rectanglefield.get(1).length1, rectanglefield.get(1).height);  
		g.fillRect(0, 651-68, 34, 34);
		g.fillRect(0, 651-136, 34, 34);
		g.fillRect(0, 651-204, 34, 34);
		g.fillRect(0, 651-272, 34, 34);
		g.fillRect(0, 651-340, 34, 34);
		g.fillRect(0, 651-408, 34, 34);
		g.fillRect(0, 651-476, 34, 34);
		g.fillRect(0, 651-544, 34, 34);
		g.fillRect(0, 651-612, 34, 34); */
		if (mover.color == "red") g.setColor(Color.RED);
		if (mover.color == "green") g.setColor(Color.GREEN);
		if (mover.color == "white") g.setColor(Color.WHITE);
		if (mover.color == "yellow") g.setColor(Color.YELLOW);
		if (mover.color == "gray") g.setColor(Color.GRAY);
		if (mover.color == "pink") g.setColor(Color.PINK);
		if (mover.color == "cyan") g.setColor(Color.CYAN);
		if (mover.color == "darkgray") g.setColor(Color.DARK_GRAY);
		if (mover.color == "black") g.setColor(Color.BLACK);
		if (mover.color == "lightgray") g.setColor(Color.LIGHT_GRAY);
		if (mover.color == "orange") g.setColor(Color.ORANGE);
		if (mover.color == "magenta") g.setColor(Color.MAGENTA);
		if (mover.color == "blue") g.setColor(Color.BLUE);
		g.drawString("" + mover.a, mover.xposition, mover.yposition);
	}
	public static void arraymaker()
	{
		RectangleGenerator rect1 = new RectangleGenerator();
		RectangleGenerator rect2 = new RectangleGenerator();
		RectangleGenerator rect3 = new RectangleGenerator();
		RectangleGenerator rect4 = new RectangleGenerator();
		RectangleGenerator rect5 = new RectangleGenerator();
		RectangleGenerator rect6 = new RectangleGenerator();
		RectangleGenerator rect7 = new RectangleGenerator();
		RectangleGenerator rect8 = new RectangleGenerator();
		RectangleGenerator rect9 = new RectangleGenerator();
		RectangleGenerator rect10 = new RectangleGenerator();
		rectanglefield.add(rect1);
		rectanglefield.add(rect2);
		rectanglefield.add(rect3);
		rectanglefield.add(rect4);
		rectanglefield.add(rect5);
		rectanglefield.add(rect6);
		rectanglefield.add(rect7);
		rectanglefield.add(rect8);
		rectanglefield.add(rect9);
		rectanglefield.add(rect10);
	}
	public static void main(String[] args)
	{
		bluetrue = true;
		rectanglefield = new ArrayList<RectangleGenerator>(10);
		Display application = new Display();
		application.setDefaultCloseOperation(EXIT_ON_CLOSE);
		application.setVisible(true);
		int x = 0;
		arraymaker();
		while (true) 
		{
			x++;
			application.repaint();
			if (mover.leftmove == true && x%50000 == 0) mover.xposition--;
			if (mover.rightmove == true && x%50000 == 0) mover.xposition++;
			if (mover.upmove == true && x%50000 == 0) mover.yposition--;
			if (mover.downmove == true && x%50000 == 0) mover.yposition++;
			//System.out.println(mover.xposition);
			
		}
	}
}
