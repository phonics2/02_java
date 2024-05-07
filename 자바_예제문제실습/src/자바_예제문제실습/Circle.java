package 자바_예제문제실습;

public class Circle {
	public static final double PI = 3.14;
	private double radius = 1;
	
	//필수 생성자
	public Circle(double radius) {
		this.radius = radius;
	}

	
	public static double getPi() {
		return PI;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}



	
	public void draw() {
		System.out.println("반지름 "+radius+"cm인 원을 그립니다.");
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(2.5);
		c.draw();
		
	}
}
