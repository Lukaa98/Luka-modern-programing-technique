
public class TestCircleRectangle {
 public static void main(String[] args)  {
 Circle circle = new Circle(1);
 System.out.println("A circle " + circle.toString());
 System.out.println("The color is " + circle.getColor());
 System.out.println("The radius is " + circle.getRadius());
 System.out.println("The area is " + circle.getArea());
 System.out.println("The diameter is " + circle.getDiameter());

 Rectangle rectangle = new Rectangle(5, 4);
 System.out.println("\nA rectangle " + rectangle.toString());
 System.out.println("The area is " + rectangle.getArea());
 System.out.println("The perimeter is " +
 rectangle.getPerimeter());

 Triangle triangle = new Triangle (1, 4, 6 , 8);
 System.out.println("\nA triangle " + triangle.toString());
 System.out.println("The area is " + triangle.getArea());
 System.out.println("The perimeter is " +
 triangle.getPerimeterTriangle());

 EquilateralTriangle equilateralTriangle = new EquilateralTriangle (4);
 System.out.println("\nA EquilateralTriangle " + equilateralTriangle.toString());
 System.out.println("The area is " + equilateralTriangle.getArea());
 System.out.println("The perimeter is " +
 equilateralTriangle.getEquilateralTriangle());
 }
 }
