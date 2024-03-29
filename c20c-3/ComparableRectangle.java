/**
 * The sample program from Chapter 13 in
 *   Liang Y Daniel, Introduction to Java Programming, 11st Edition
 */

public class ComparableRectangle extends Rectangle
    implements Comparable<ComparableRectangle> {

  public ComparableRectangle(double width, double height) {
    super(width, height);
  }

  public int compareTo(ComparableRectangle o) {
    if (getArea1() > o.getArea1())
      return 1;
    else if (getArea1() < o.getArea1())
      return -1;
    else
      return 0;
  }

  public String toString() {
    return " width: "+ getwidth() + "height: " + getHeight() + "Area: " + getArea1();
  }
}
