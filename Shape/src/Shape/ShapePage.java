package Shape;

public class ShapePage {
	public static void main(String[] args)
	{
		System.out.println("Area Of Shape");
		
		System.out.println("\nSquare");
		Square p1 = new Square(9);
		System.out.println(p1);
		Square p2 = new Square(0);
		p2.setSisi(4);
		System.out.println(p2);
		
		System.out.println("\nRectangle");
		Rectangle pp1 = new Rectangle(3,5);
		System.out.println(pp1);
		Rectangle pp2 = new Rectangle(0,0);
		pp2.setPanjang(6);
		pp2.setLebar(3);
		System.out.println(pp2);
		
		System.out.println("\nCircle");
		Circle l1 = new Circle(7);
		System.out.println(l1);
		Circle l2 = new Circle(0);
		l2.setJari(8);
		System.out.println(l2);
		
		System.out.println("\nTriangle");
		Triangle s1 = new Triangle(4,5);
		System.out.println(s1);
		Triangle s2 = new Triangle(0,0);
		s2.setAlas(4);
		s2.setTinggi(5);
		System.out.println(s2);
		
		System.out.println("\nRhombus");
		Rhombus b1 = new Rhombus(8,4);
		System.out.println(b1);
		Rhombus b2 = new Rhombus(0,0);
		b2.setDiagonal1(4);
		b2.setDiagonal2(5);
		System.out.println(b2);
		
		System.out.println("\nParallelogram");
		Parallelogram j1 = new Parallelogram(4,5);
		System.out.println(j1);
		Parallelogram j2 = new Parallelogram(0,0);
		j2.setAlas(4);
		j2.setTinggi(5);
		System.out.println(j2);
	}
}
