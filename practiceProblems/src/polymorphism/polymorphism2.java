package polymorphism;
import java.util.*;
class Shape 
{
	public void draw() {
		System.out.println("Drawing Shape");
	}	
	public void erase() {
		System.out.println("Erasing Shape");
	}
}
class Triangle extends Shape {
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape {
	public void draw() {
		System.out.println("Drawing Square");
	}
	public void erase() {
		System.out.println("Erasing Square");
	}
}
class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Circle");
	}
}
public class polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		c.draw();
		c.erase();
		
		t.draw();
		t.erase();
		
		s.draw();
		s.erase();

	}

}
