package Shape;

public class Triangle {
	int alas;
	int tinggi;
	
	public Triangle(int a, int t)
	{
		alas = a;
		tinggi = t;
	}
	
	public int getAlas()
	{
		return alas;
	}
	public void setAlas(int alas)
	{
		this.alas = alas;
	}
	public int getTinggi()
	{
		return tinggi;
	}
	public void setTinggi(int tinggi)
	{
		this.tinggi = tinggi;
	}
	
	public double Area()
	{
		double d = 0.0;
		d = (getAlas()*getTinggi())/2;
		return d;
	}
	public String toString()
	{
		String area = "";
		area = "Area Triangle with a = (" + getAlas()+ "), t = (" + getTinggi() + ") : " + Area();
		return area;
	}
}
