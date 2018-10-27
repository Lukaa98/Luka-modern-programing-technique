public class Orange extends Fruit {
// data field
String name;
// toString() method.
@Override
public String toString() {
return "Orange [name=" + super.name + "]";
}
// getOrangeJuiceRecipe() method
String getOrangeJuiceRecipe()
{
return super.name;
}
@Override
public int hashCode() {
final int prime = 31;
int result = super.hashCode();
result = prime * result + ((name == null) ? 0 : name.hashCode());
return result;
}
public boolean equals(Orange other) {
if (name == null) {
if (other.name != null)
return false;
} else if (!name.equals(other.name))
return false;
return true;
}
}
