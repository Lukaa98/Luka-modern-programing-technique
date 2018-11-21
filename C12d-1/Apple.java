import java.util.Objects;
public class Apple extends Fruit{
//data field
//toString() method.
 @Override
 public String toString() {
 return "Apple [name=" + super.name + "]";
                          }
//getApplePieRecipe(): String
  String getApplePieRecipe(){
  return super.name;
                            }
   public boolean equals(Object o){
   if(o instanceof Apple)
                                  {
  Apple other=(Apple)o;
  if(other.name.equals(this.name)) {
     return true;
                                   }
                                  }
   return false;
                                  }
   public int hashcode(){
      return Objects.hashCode(this.name);
                        }
}
