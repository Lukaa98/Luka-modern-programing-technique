public class RightTriangle extends Shape {
  private double base;
  private double height;
  public RightTriangle(String name, double base, double height){
    super(name);
    this.base = base;
    this.height = height;
  }
  @Override
  public double getArea(){
    return base * height;
  }
}
