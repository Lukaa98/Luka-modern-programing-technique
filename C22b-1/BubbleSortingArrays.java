public class BubbleSortingArrays {

   public static void main(String[] args) {
       // Create an Integer array
       Integer[] intArray = { Integer.valueOf(2), Integer.valueOf(4),
               Integer.valueOf(3) };
       // Create a Double array
       Double[] doubleArray = { Double.valueOf(3.4), Double.valueOf(1.3),
               Double.valueOf(-22.1) };
       // Create a Character array
       Character[] charArray = { Character.valueOf('a'),
               Character.valueOf('J'), Character.valueOf('r') };
       // Create a String array
       String[] stringArray = { "Tom", "John", "Fred" };
       // Sort the arrays
       bubbleSort(intArray,intArray.length);
       bubbleSort(doubleArray,doubleArray.length);
       bubbleSort(charArray,charArray.length);
       bubbleSort(stringArray,stringArray.length);
       // Display the sorted arrays
       System.out.print("Sorted Integer objects: ");
       printList(intArray);
       System.out.print("Sorted Double objects: ");
       printList(doubleArray);
       System.out.print("Sorted Character objects: ");
       printList(charArray);
       System.out.print("Sorted String objects: ");
       printList(stringArray);
   }

   private static void bubbleSort(Comparable[] list,int size) {

       for(int i=0;i<size-1;i++)
       {
           if(list[i].compareTo(list[i + 1]) > 0)
           {
               swap(list,i,i+1);
           }
       }
       if(size-1>1)
       {
           bubbleSort(list, size-1);
       }

   }

   private static void swap(Comparable[] list, int i, int j) {
       Comparable tmp = list[i];
       list[i] = list[j];
       list[j] = tmp;
   }

   /** Sort an array of comparable objects using the Bubble sort algorithm */
   public static void sort(Comparable[] list) {
       Comparable currentMin;
       int currentMinIndex;
       // select subarray (the range of the array) where we bubble up the
       // greatest in the subarray
       for (int i = 0; i < list.length - 1; i++) {
           // bubble up the greast in the subarray (in the range of the array)
           for (int j = 0; j < list.length - i - 1; j++) {
               if (list[j].compareTo(list[j + 1]) > 0) {
                   Comparable tmp = list[j];
                   list[j] = list[j + 1];
                   list[j + 1] = tmp;
               }
           }
       }
   }

   /** Print an array of objects */
   public static void printList(Object[] list) {
       for (int i = 0; i < list.length; i++)
           System.out.print(list[i] + " ");
       System.out.println();
   }
}
