package Shape;

public class Rectangle {
	int panjang;
	int lebar;
	
	public Rectangle(int x, int y)
	{
		panjang = x;
		lebar = y;
	}
	
	public int getPanjang()
	{
		return panjang;
	}
	public void setPanjang(int panjang)
	{
		this.panjang = panjang;
	}
	public int getLebar()
	{
		return lebar;
	}
	public void setLebar(int lebar)
	{
		this.lebar = lebar;
	}
	
	public int Area()
	{
		int b = 0;
		b = getPanjang()*getLebar();
		return b;
	}
	public String toString()
	{
		String area = "";
		area = "Area Rectangle with length = (" + getPanjang() + "), height = (" +getLebar() + ") : " + Area();
		return area;
	}
}
