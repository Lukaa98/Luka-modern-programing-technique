public class Rectangle extends GeometricObject1{
  private double width;
  private double height;
  public Rectangle(){

  }
  public Rectangle(double width, double height){
    this.width= width;
    this.height = height;
  }
  public double getwidth(){
    return width;
  }
  public void setWidth(double width){
    this.width = width;
  }
  public double getHeight(){
    return height;
  }
  public void setHeight(double height){
    this.width = height;
  }
  @Override
  public double getArea1(){
    return  width * height;
  }
  @Override /** Return perimeter */
  public double getPerimeter1() {
    return 2 * (width+ height);
  }

}
