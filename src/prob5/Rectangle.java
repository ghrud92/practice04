package prob5;

public class Rectangle extends Shape implements Resizable{

	private double width;
	private double height;
	
	public Rectangle(double width, double height){
		super(4);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*width + 2*height;
	}

	@Override
	public void resize(double rate) {
		// TODO Auto-generated method stub
		width *= rate;
		height *= rate;
	}

}
