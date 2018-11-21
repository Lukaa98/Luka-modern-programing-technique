import java.util.Objects;
public class Orange extends Fruit{
//data field
//toString() method.
@Override
public String toString() {
return "Orange [name=" + super.name +"]";
}
public boolean equals(Object o)
{
if(o instanceof Orange)
{
Orange other=(Orange)o;
if(other.name.equals(this.name))
{
return true;
}
}
return false;
}
public int hashcode()
{
return Objects.hashCode(this.name);
}
//getOrangeJuiceRecipe() method
String getOrangeJuiceRecipe()
{
return super.name;
}
}
