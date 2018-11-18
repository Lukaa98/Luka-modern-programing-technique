import java.util.ArrayList;

abstract class Shape {

public String name;

public Shape(String name) {

this.name = name;

}

public abstract double getArea();

// public abstract boolean isEquilateral();

public String getName() {

return name;

}

}
