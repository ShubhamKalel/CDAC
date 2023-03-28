package ass2;

public class Area {
	
	double dim1=10;
	double dim2=0;
	double circleArea() {
		return (3.14)*rad*rad; 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area a = new Area();
		a.rad=50;
		System.out.println(a.circleArea());
	}

}
