public abstract class Faculty extends Person{
  public Faculty(String lname, String fname, String id){
    super(lname, fname, id);
  }
  public abstract String getPhoneNumber();
  public abstract String getAddress();
  public abstract String getId();
}
