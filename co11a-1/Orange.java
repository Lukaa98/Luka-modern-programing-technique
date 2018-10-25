public class Orange extends Fruit{
//data field
String name;
//toString() method.
@Override
public String toString() {
return "Orange [name=" + super.name + "]";
}
//getOrangeJuiceRecipe() method
String getOrangeJuiceRecipe()
{
return super.name;
}
}
