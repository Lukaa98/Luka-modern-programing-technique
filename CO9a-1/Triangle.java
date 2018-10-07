

public class Triangle extends GeometricObject {
  private double size1;
  private double size2;
  private double base;
  private double height;
  public Triangle() {
  }

  public Triangle(
      double size1, double size2, double base, double height) {
    this.size1 = size1;
    this.size2 = size2;
    this.base = base;
    this.height = height;
  }

  public Triangle(
    double height,  double size1, double size2, double base, String color, boolean filled) {
        this.size1 = size1;
        this.size2 = size2;
        this.base = base;
        this.height = height;

    setColor(color);
    setFilled(filled);
  }

  /** Return width */
  public double getSize1() {
    return size1;
  }

  /** Set a new width */
  public void setSize1(double size1) {
    this.size1 = size1;
  }

  /** Return height */
  public double getSize2() {
    return size2;
  }

  /** Set a new height */
  public void setsize2(double size2) {
    this.size2 = size2;
  }
  /** Return height */
  public double getBase() {
    return base;
  }

  /** Set a new height */
  public void setBase(double base) {
    this.base = base;
  }
  public double getheight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }
  /** Return area */
  public double getArea() {
    return ((base*height)/2) ;
  }

  /** Return perimeter */
  public double getPerimeterTriangle() {
    return (size1 + size2 + base);
  }
}
