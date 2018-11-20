
import java.util.ArrayList;
import java.util.Collections;

public class SortCircle {
  public static void main(String[] args) {
    ArrayList<ComparableCircle> listCircles = new ArrayList<>();

      listCircles.add(new ComparableCircle(5));
      listCircles.add(new ComparableCircle(4));
      listCircles.add(new ComparableCircle(7));
      listCircles.add(new ComparableCircle(9));
      listCircles.add(new ComparableCircle(12));
      listCircles.add(new ComparableCircle(19));
      listCircles.add(new ComparableCircle(3));
      listCircles.add(new ComparableCircle(44));
      listCircles.add(new ComparableCircle(1));



    System.out.println("Before Sorting");
    printList(listCircles);

    Collections.sort(listCircles);

    System.out.println("After Sorting");
    printList(listCircles);
  }//end of main

  public static void printList(ArrayList <ComparableCircle> listCircle){
    for (int i = 0; i < listCircle.size(); i++){
      System.out.println(listCircle.get(i)+ " ");
    }
  }

}


/*$ java SortCircle
Before Sorting
radius: 5.0Area: 78.53981633974483
radius: 4.0Area: 50.26548245743669
radius: 7.0Area: 153.93804002589985
radius: 9.0Area: 254.46900494077323
radius: 12.0Area: 452.3893421169302
radius: 19.0Area: 1134.1149479459152
radius: 3.0Area: 28.274333882308138
radius: 44.0Area: 6082.123377349839
radius: 1.0Area: 3.141592653589793
After Sorting
radius: 1.0Area: 3.141592653589793
radius: 3.0Area: 28.274333882308138
radius: 4.0Area: 50.26548245743669
radius: 5.0Area: 78.53981633974483
radius: 7.0Area: 153.93804002589985
radius: 9.0Area: 254.46900494077323
radius: 12.0Area: 452.3893421169302
radius: 19.0Area: 1134.1149479459152
radius: 44.0Area: 6082.123377349839
*/
