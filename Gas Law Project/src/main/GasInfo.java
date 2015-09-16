package main;

public class GasInfo
{
	double moles;
	double temperature;
	double volume;
	double pressure;
	double firsttemp;
	double firstvol;
	double firstpress;
	double sectemp;
	double secvol;
	double secpress;
	public double tempCalculate()
	{
		temperature = (pressure*volume)/(0.0821*moles);
		return temperature;
	}
	public double molCalculate()
	{
		moles = (pressure*volume)/(0.0821*temperature);
		return moles;
	}
	public double presCalculate()
	{
		pressure = moles*0.0821*temperature/volume;
		return pressure;
	}
	public double volCalculate()
	{
		volume = moles*0.0821*temperature/pressure;
		return volume;
	}

}
