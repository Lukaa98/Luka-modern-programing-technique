public class TestCircle
{
  public static void main(String[] args)
  {
    Circle myCircle = new Circle (1.0);
    int n = 5;
    CircleUtils myUtils = new CircleUtils();

    System.out.println("          printCircle(myCircle, ");
    myUtils.printCircle(myCircle, n);
    System.out.println("          printCircle(myCircle)");
    myUtils.printCircle(myCircle);

    myUtils.doubleRadius(myCircle);
    myUtils.doubleArea(myCircle);

    double area, radius;

    Circle newCircle = myUtils.getNewCircleDoubleRadius(myCircle);
    radius = newCircle.getRadius();
    System.out.println("double radius to new circle: " + radius);

    Circle newerCircle = myUtils.getNewCircleDoubleArea(myCircle);
    area = newerCircle.getArea();
    System.out.println("double area to new circle " + area);
  }
}
