


class Rectangle extends Shape {

private double width;

private double length;

public Rectangle(String name, double width, double length) {

super(name);

this.width = width;

this.length = length;

}

@Override

public double getArea() {

return width * length;

}

}
