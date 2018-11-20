public class Circle extends GeometricObject{
  private double radius;
  public Circle(){

  }
  public Circle(double radius){
    this.radius= radius;
  }
  public double getRadius(){
    return radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
  }
  @Override
  public double getArea(){
    return Math.PI * radius *radius;
  }
  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * (Math.PI + radius);
  }

}
