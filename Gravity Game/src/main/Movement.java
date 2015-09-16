package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Movement extends Player implements KeyListener {

	public void keyPressed(KeyEvent event) 
	{
		String a = "" + event.getKeyChar();
		int code = event.getKeyCode();

		if (code == KeyEvent.VK_UP) upmove = true;
		if (code == KeyEvent.VK_DOWN) downmove = true;

		if (code == KeyEvent.VK_LEFT) leftmove = true;
		if (code == KeyEvent.VK_RIGHT) rightmove = true;
		
		if (code != KeyEvent.VK_ENTER && code != KeyEvent.VK_SHIFT && code != KeyEvent.VK_DOWN && code != KeyEvent.VK_UP && code != KeyEvent.VK_LEFT && code != KeyEvent.VK_RIGHT) setChar(a);
		if (code == KeyEvent.VK_ENTER) yesmove = true;
	}

	public void keyReleased(KeyEvent event) 
	{
		int x = event.getKeyCode();
		if (x == KeyEvent.VK_LEFT) leftmove = false;
		if (x == KeyEvent.VK_RIGHT) rightmove = false;
		if (x == KeyEvent.VK_UP) upmove = false;
		if (x == KeyEvent.VK_DOWN) downmove = false;
		if (x == KeyEvent.VK_ENTER) yesmove = false;
	}

	public void keyTyped(KeyEvent event) 
	{
		
		
	}

}
