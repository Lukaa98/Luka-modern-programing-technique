

public class EquilateralTriangle extends Triangle {
  private double size1;

  public EquilateralTriangle() {
  }

  public EquilateralTriangle(double size1) {
    this.size1 = size1;

  }

  public EquilateralTriangle(  double size1, String color, boolean filled) {
        this.size1 = size1;

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


  /** Return area */
  public double getArea() {
    return (Math.sqrt(3)/4)*(size1 *size1) ;
  }

  /** Return perimeter */
  public double getEquilateralTriangle() {
    return (size1 *3);
  }
}
