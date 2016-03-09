package prob5;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(5,6);
		RectTriangle rectTriangle = new RectTriangle(6,2);
		Shape[] obj = new Shape[2];
		obj[0] = rectangle;
		obj[1] = rectTriangle;
		for(int i=0;i<2;i++){
			System.out.println("area: " + obj[i].getArea());
			System.out.println("perimeter: " + obj[i].getPerimeter());
			if(obj[i] instanceof Resizable){
				Resizable temp = (Resizable)obj[i];
				temp.resize(0.5);
				obj[i] = (Shape)temp;
				System.out.println("new area: " + obj[i].getArea());
				System.out.println("new perimeter: " + obj[i].getPerimeter());
			}
		}
	}

}
