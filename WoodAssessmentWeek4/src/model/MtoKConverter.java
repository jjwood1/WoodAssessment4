package model;

public class MtoKConverter {
	private double miles, kilometers;
	public MtoKConverter()
	{
		super();
	}
	public MtoKConverter(int miles)
	{
		super();
		this.miles = miles;
		convertToKilometers(this.miles);
	}
	public void convertToKilometers(double miles)
	{
		this.miles = miles;
		this.kilometers = this.miles * 1.60934;
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
