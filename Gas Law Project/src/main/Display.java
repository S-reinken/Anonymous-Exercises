package main;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Display extends JFrame{

	private static final long serialVersionUID = 1L;
	public Display()
	{
		super("Gas Laws");
		setSize(500, 500);
		setVisible(true);
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		final JPanel conditionpanel;
		final JPanel changepanel;
		final JButton conditionset;
		final JButton changeset;
		JTextField curtemp;
		JTextField secondtemp;
		JTextField curpress;
		JTextField secondpress;
		JTextField curvol;
		JTextField secondvol;
		JTextField temp;
		JTextField press;
		JTextField vol;
		JTextField mol;
		JLabel ct = new JLabel("Starting Temperature (K)");
		JLabel st = new JLabel("Resulting or Changed Temperature (K)");
		JLabel cp = new JLabel("Starting Pressure (atm)");
		JLabel sp = new JLabel("Resulting or Changed Pressure (atm)");
		JLabel cv = new JLabel("Starting Volume (L)");
		JLabel sv = new JLabel("Resulting or Changed Volume (L)");
		JLabel tt = new JLabel("Temperature (K)");
		JLabel pp = new JLabel("Pressure (atm)");
		JLabel vv = new JLabel("Volume (L)");
		JLabel mm = new JLabel("Moles");
		conditionpanel = new JPanel();
		changepanel = new JPanel();
		conditionset = new JButton("Identification");
		changeset = new JButton("Change in Gas Conditions");
		curtemp = new JTextField(10);
		secondtemp = new JTextField(10);
		curpress = new JTextField(10);
		secondpress = new JTextField(10);
		curvol = new JTextField(10);
		secondvol = new JTextField(10);
		temp = new JTextField(10);
		press = new JTextField(10);
		vol = new JTextField(10);
		mol = new JTextField(10);
		conditionpanel.setLayout(new GridBagLayout());
		changepanel.setLayout(new GridBagLayout());
		conditionpanel.setSize(400, 400);
		changepanel.setSize(400, 400);
		conditionset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				changepanel.setVisible(false);
				conditionpanel.setVisible(true);
				conditionset.setEnabled(false);
				changeset.setEnabled(true);
			}
		});
		changeset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				conditionpanel.setVisible(false);
				changepanel.setVisible(true);
				changeset.setEnabled(false);
				conditionset.setEnabled(true);
			}
		});
		conditionset.setVisible(true);
		changeset.setVisible(true);
		conditionpanel.setVisible(false);
		changepanel.setVisible(false);
		c.gridy = 1;
		c.gridwidth = 2;
		add(conditionpanel, c);
		add(changepanel, c);
		c.gridy = 0;
		c.gridwidth = 1;
		add(conditionset, c);
		c.gridx = 1;
		add(changeset, c);
		c.gridx = 0;
		conditionpanel.add(vv, c);
		c.gridy = 1;
		conditionpanel.add(tt, c);
		c.gridy = 2;
		conditionpanel.add(pp, c);
		c.gridy  = 3;
		conditionpanel.add(mm, c);
		c.gridx = 1;
		c.gridy = 0;
		conditionpanel.add(vol, c);
		c.gridy = 1;
		conditionpanel.add(temp, c);
		c.gridy = 2;
		conditionpanel.add(press, c);
		c.gridy = 3;
		conditionpanel.add(mol, c);
		c.gridx = 0;
		c.gridy = 0;
		changepanel.add(cv, c);
		c.gridy = 1;
		changepanel.add(ct, c);
		c.gridy = 2;
		changepanel.add(cp, c);
		c.gridx = 1;
		c.gridy = 0;
		changepanel.add(curvol, c);
		c.gridy = 1;
		changepanel.add(curtemp, c);
		c.gridy = 2;
		changepanel.add(curpress, c);
		c.gridx = 2;
		c.gridy = 0;
		changepanel.add(sv, c);
		c.gridy = 1;
		changepanel.add(st, c);
		c.gridy = 2;
		changepanel.add(sp, c);
		c.gridy = 0;
		c.gridx = 3;
		changepanel.add(secondvol, c);
		c.gridy = 1;
		changepanel.add(secondtemp, c);
		c.gridy = 2;
		changepanel.add(secondpress, c);
		setSize(950, 350);
	}
	
	public static void main(String[] args)
	{
		Display application = new Display();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
