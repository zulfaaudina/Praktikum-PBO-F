package Shape;

public class Rhombus {
	int diagonal1;
	int diagonal2;
	
	public Rhombus(int d1, int d2)
	{
		diagonal1 = d1;
		diagonal2 = d2;
	}
	public int getDiagonal1()
	{
		return diagonal1;
	}
	public void setDiagonal1(int diagonal1)
	{
		this.diagonal1 = diagonal1;
	}
	public int getDiagonal2()
	{
		return diagonal2;
	}
	public void setDiagonal2(int diagonal2)
	{
		this.diagonal2 = diagonal2;
	}
	
	public double Area()
	{
		double e = 0.0;
		e = (getDiagonal1()*getDiagonal2())/2;
		return e;
	}
	public String toString()
	{
		String area = "";
		area = "Area Rhombus d1 = (" + getDiagonal1()+ "), d2 = (" +getDiagonal2()+ ") : " + Area();
		return area;
	}
}
