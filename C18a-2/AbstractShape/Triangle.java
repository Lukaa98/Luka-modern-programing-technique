class Triangle extends Shape {
private double size1;
private double size2;
private double size3;

public double getSize1() {
return size1;
}
public void setSize1(double aSize1) {
size1 = aSize1;
}
public double getSize2() {
return size2;
}
public void setSize2(double aSize2) {
size2 = aSize2;
}
public double getSize3() {
return size3;
}
public void setSize3(double aSize3) {
size3 = aSize3;
}
public Triangle(String name, double size1, double size2, double size3) {
super(name);
this.size1 = size1;
this.size2 = size2;
this.size3 = size3;
}
@Override
public double getArea() {
double s, area;
s = (size1 + size2 + size3) / 2;
area = Math.sqrt(s * (s - size1) * (s - size2) * (s - size3));
return area;
}
}
