import java.util.Objects;
public final class McIntosh extends Apple{
//data field
//toString() method.
@Override
public String toString() {
return "McIntosh [name=" + super.name + "]";
}
public boolean equals(Object o)
{
if(o instanceof McIntosh)
{
McIntosh other=(McIntosh)o;
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
}
