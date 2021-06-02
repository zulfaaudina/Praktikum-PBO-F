package Shape;

public class Parallelogram {
	int alas;
	int tinggi;
	
	public Parallelogram(int a, int t)
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
	
	public int Area()
	{
		int f = 0;
		f = getAlas()*getTinggi();
		return f;
	}
	public String toString()
	{
		String area = "";
		area = "Area Parallelogram with a = (" + getAlas() + "), t = (" +getTinggi() + ") : "+ Area();
		return area;
	}
}
