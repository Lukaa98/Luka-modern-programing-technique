public final class McIntosh extends Apple {
// data field
String name;
// toString() method.
@Override
public String toString() {
return "McIntosh [name=" + super.name + "]";
}
@Override
public int hashCode() {
final int prime = 31;
int result = super.hashCode();
result = prime * result + ((name == null) ? 0 : name.hashCode());
return result;
}
public boolean equals(McIntosh other) {
if (name == null) {
if (other.name != null)
return false;
} else if (!name.equals(other.name))
return false;
return true;
}
}
