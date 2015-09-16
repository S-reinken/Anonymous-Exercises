import java.lang.Math;

class Projectile {
	
	double initialVelocity;
	double launchAngle;
	double launchHeight;
	double gravity;
	
	public void setLaunch(double a, double b, double c)
	{
		gravity = -4.9;
		initialVelocity = a;
		launchAngle = b;
		launchHeight = c;
	}
	
	public double Pcalc(double time, boolean a)
	{
		double xposition;
		double yposition;
		
		double xvelocity = Math.cos(launchAngle*(Math.PI/180))*initialVelocity;
		xposition = xvelocity*time;
		double yvelocity = Math.sin(launchAngle*(Math.PI/180))*initialVelocity;
		
		yposition = (gravity*time*time) + (yvelocity*time) + launchHeight;
		
		if (a==true) return (yposition);
		else return (xposition);
	}
	
	public double MaxCalc()
	{
		double yvelocity = Math.sin(launchAngle*(Math.PI/180))*initialVelocity;
		double mHtime = (-1*yvelocity)/(2*gravity);
		double maxHeight = (gravity*mHtime*mHtime) + (yvelocity*mHtime) + launchHeight;
		
		return (maxHeight);
	}
	
	public double gCalc()
	{
		double yvelocity = Math.sin(launchAngle*(Math.PI/180))*initialVelocity;
		double gTime = ((-1*yvelocity) - Math.sqrt((yvelocity*yvelocity) - (4*gravity*launchHeight)))/(2*gravity);
		
		return (gTime);
	}

}
