package model;

public class KtoMConverter {
	private double miles, kilometers;
	
	public KtoMConverter()
	{
		super();
	}
	public KtoMConverter(int kilometers)
	{
		super();
		this.kilometers = kilometers;
		ConvertToMiles(this.kilometers);
	}
	public void ConvertToMiles(double kilometers)
	{
		//this.kilometers = kilometers;
		this.miles = this.kilometers * 0.621371;
	}
	public String returnMiles()
	{
		String s = "";
		return s.valueOf(this.miles);
	}
	public void setMiles(double miles)
	{
		this.miles = miles;
	}
	public void setKilometers(double kilometers)
	{
		this.kilometers = kilometers;
	}
	public String getMiles()
	{
		String s = "";
		return s.valueOf(this.miles);
	}
	public String getKilometers()
	{
		String s = "";
		return s.valueOf(this.kilometers);
	}
}
