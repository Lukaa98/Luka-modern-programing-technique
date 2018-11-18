

import java.util.ArrayList;

public class ShapeClient

{

public static void main(String[] args) {

ArrayList<Shape> shapeList = new ArrayList<Shape>();

Shape s1 = new Circle("circle 1", 10);

shapeList.add(s1);

Shape s2 = new Rectangle("rectangle 2", 100, 100);

shapeList.add(s2);

Shape s3 = new Triangle("Triangle 3", 12, 13, 12);// these are sides


Triangle t= (Triangle)(s3); // compared

if(t.getSize1()==t.getSize2() && t.getSize2()==t.getSize3()){
  System.out.println(" size1 size2 and size3 are equal");
  shapeList.add(s3);
}else {
  System.out.println("Triangle size are not equal");
}

if (!s1.getClass().isInstance(s2)) {

System.out.println("Actual types of s1 and s2 are different");

}

double totalArea = sumAreasOfShapes(shapeList);

System.out.println("The total area of the shapes are " + totalArea);

}

public static double sumAreasOfShapes(ArrayList<Shape> shapeList) {

double sum = 0.;

// Use the for loop

for (int i = 0; i < shapeList.size(); i++) {

sum += shapeList.get(i).getArea();

}

return sum;

}

}
