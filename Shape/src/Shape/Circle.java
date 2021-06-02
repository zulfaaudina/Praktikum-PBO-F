package Shape;

public class Circle {
	int jari;
	
	public Circle(int r)
	{
		jari = r;
	}
	public int getJari()
	{
		return jari;
	}
	
	public void setJari(int jari)
	{
		this.jari = jari;
	}
	
	public double Area()
	{
		double c = 0;
		double phi = 3.14;
		c = phi*(getJari()*getJari());
		return c;
	}
	public String toString()
	{
		String area = "";
		area = "Area Circle r = (" + getJari() + ") : " + Area();
		return area;
	}
}
