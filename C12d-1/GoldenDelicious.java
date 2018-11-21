import java.util.Objects;
public final class GoldenDelicious extends Apple{
//data field
//toString() method.
@Override
public String toString() {
return "GoldenDelicious [name=" + super.name + "]";
}
public boolean equals(Object o)
{
if(o instanceof GoldenDelicious)
{
GoldenDelicious other=(GoldenDelicious)o;
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
