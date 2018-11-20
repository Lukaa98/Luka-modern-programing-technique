/**
 * The sample program from Chapter 13 in
 *   Liang Y Daniel, Introduction to Java Programming, 11st Edition
 */

public class ComparableCircle extends Circle
    implements Comparable<ComparableCircle> {

  public ComparableCircle(double radius) {
    super(radius);
  }

  public int compareTo(ComparableCircle o) {
    if (getArea() > o.getArea())
      return 1;
    else if (getArea() < o.getArea())
      return -1;
    else
      return 0;
  }

  public String toString() {
    return "radius: " + getRadius() + "Area: " + getArea();
  }
}
