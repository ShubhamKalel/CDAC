package ass2;
import java.util.*;

public class Shape {
	
	int dim1=0;
	int dim2=0;
	
	int areaRect() {
		return dim1*dim2;
	}

	double areaTriangle() {
		return (0.5)*dim1*dim2;
	}
	
	double areaCircle() {
		return (3.14)*dim1*dim1;
	}
	
	double areaSquare() {
		if(dim1 == dim2)
			return dim1*dim1;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		/*
		Shape triangle = new Shape();
		System.out.println("Enter Triangle Breadth and height : ");
		triangle.dim1=in.nextInt();
		triangle.dim2=in.nextInt();
		System.out.println(" Area of triangle : "+triangle.areaTriangle());
		
		//Shape rect = new Shape();
		rect.dim1=in.nextInt();
		rect.dim2=in.nextInt();
		System.out.println(" Area of rectangle  : "+rect.areaRect());
		
		*/
		
		Shape s = new Shape();//triangle
		System.out.println("Enter Triangle Breadth and height : ");
		s.dim1=in.nextInt();
		s.dim2=in.nextInt();
		System.out.println(" Area of triangle : "+s.areaTriangle());
		
		System.out.println("Enter Rectangle Breadth and height : ");
		s.dim1=in.nextInt();
		s.dim2=in.nextInt();
		System.out.println(" Area of rectangle  : "+s.areaRect());
		
		
	}

}
