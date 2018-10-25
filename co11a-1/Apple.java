public class Apple extends Fruit{
//data field
String name;
//toString() method.
@Override
public String toString() {
return "Apple [name=" + super.name + "]";
}
//getApplePieRecipe(): String
String getApplePieRecipe()
{
return super.name;
}
}
