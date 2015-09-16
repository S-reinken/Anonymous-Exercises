import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class ResultDisplay extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public ResultDisplay()
	{
		super("Projectile Motion");
		setSize(900, 250);
		setVisible(true);
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel lcons = new JLabel("Launch Constraints");
		JLabel rsult = new JLabel("Results");
		JLabel iv = new JLabel("Launch Velocity (m/s)");
		JLabel ia = new JLabel("Launch Angle (degrees)");
		JLabel ih = new JLabel("Initial Height (m)");
		final JLabel mh = new JLabel("");
		final JLabel gt = new JLabel("");
		final JLabel fd = new JLabel("");
		final JTextField anglet = new JTextField(10);
		final JTextField ivelocityt = new JTextField(10);
		final JTextField heightt = new JTextField(10);
		final JTextArea outwindow = new JTextArea(5, 45);
		outwindow.setEditable(false);
		JScrollPane scroller = new JScrollPane(outwindow);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		c.gridx=0;
		c.gridy=1;
		add(iv, c);
		c.gridy = 2;
		add(ia, c);
		c.gridy = 3;
		add(ih, c);
		c.gridx = 1;
		c.gridy = 0;
		add(lcons, c);
		c.gridy = 1;
		add(ivelocityt, c);
		c.gridy = 2;
		add(anglet, c);
		c.gridy = 3;
		add(heightt, c);
		c.gridx = 2;
		c.gridy = 0;
		add(rsult, c);
		c.gridy = 1;
		c.gridheight = 3;
		//c.ipady = 20;
		add(scroller, c);
		c.ipady = 0;
		c.gridy = 4;
		c.gridheight = 1;
		add(mh, c);
		c.gridy = 5;
		add(gt, c);
		c.gridy = 6;
		add(fd, c);
		JButton button = new JButton("Calculate");
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				double a = Double.parseDouble(anglet.getText());
				double b = Double.parseDouble(ivelocityt.getText());
				double c = Double.parseDouble(heightt.getText());
				panel(a, b, c, outwindow, mh, gt, fd);
			}
		});
		c.gridx = 1;
		c.gridy = 4;
		c.gridheight = 1;
		add(button, c);
	}
	
	private void panel(double angle, double ivelocity, double iheight, JTextArea z, JLabel a, JLabel b, JLabel c)
	{
		z.setText(null);
		Projectile projectile1 = new Projectile();
		projectile1.setLaunch(ivelocity, angle, iheight);
		double yposition = iheight;
		double xposition = 0;
		double t = 0;
		while (yposition >= 0)
		{
			yposition = projectile1.Pcalc(t, true);
			xposition = projectile1.Pcalc(t, false);
			z.append("Time: " + t + "s Distance: " + xposition + "m Height: " + yposition + "m\n");
			t++;
		}
		a.setText("Maximum Height: " + projectile1.MaxCalc() + "m");
		double gtime = projectile1.gCalc();
		b.setText("Time to ground: " + gtime + "s");
		c.setText("Final Distance in Air: " + projectile1.Pcalc(gtime, false) + "m");
		
	}

	public static void main(String[] args)
	{
		ResultDisplay application = new ResultDisplay();
		application.setDefaultCloseOperation(EXIT_ON_CLOSE);
		application.setVisible(true);

	}
}
