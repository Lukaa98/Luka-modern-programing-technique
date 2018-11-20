
import java.util.ArrayList;
import java.util.Collections;

public class SortCircle {
  public static void main(String[] args) {
    ArrayList<ComparableCircle> listCircles = new ArrayList<>();
    //ArrayList<ComparableRectangle> listRectangle = new ArrayList<>();

      listCircles.add(new ComparableCircle(5));
      listCircles.add(new ComparableCircle(4));
      listCircles.add(new ComparableCircle(7));

    System.out.println("Before Sorting");
    printList(listCircles);

    Collections.sort(listCircles);

    System.out.println("After Sorting");
    printList(listCircles);

    ArrayList<ComparableRectangle> listRectangle = new ArrayList<>();

    listRectangle.add(new ComparableRectangle(4,5 ));


    listRectangle.add(new ComparableRectangle(6,7 ));
    System.out.println(" ---------------------------");

    listRectangle.add(new ComparableRectangle(2,3 ));

    System.out.println("Before Sorting");
    printList1(listRectangle);

    Collections.sort(listRectangle);

    System.out.println("After Sorting");
    printList1(listRectangle);

  }//end of main

  public static void printList(ArrayList <ComparableCircle> listCircle){
    for (int i = 0; i < listCircle.size(); i++){
      System.out.println(listCircle.get(i)+ " ");
    }
  }
    public static void printList1(ArrayList <ComparableRectangle> listRectangle){
      for (int i = 0; i < listRectangle.size(); i++){
        System.out.println(listRectangle.get(i)+ " ");
      }
  }

}

/* output
$ java SortCircle
Before Sorting
radius: 5.0Area: 78.53981633974483
radius: 4.0Area: 50.26548245743669
radius: 7.0Area: 153.93804002589985
After Sorting
radius: 4.0Area: 50.26548245743669
radius: 5.0Area: 78.53981633974483
radius: 7.0Area: 153.93804002589985
 ---------------------------
Before Sorting
 width: 4.0height: 5.0Area: 20.0
 width: 6.0height: 7.0Area: 42.0
 width: 2.0height: 3.0Area: 6.0
After Sorting
 width: 2.0height: 3.0Area: 6.0
 width: 4.0height: 5.0Area: 20.0
 width: 6.0height: 7.0Area: 42.0

*/
