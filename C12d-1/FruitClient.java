import java.util.ArrayList;
//FruitClient class
public class FruitClient {
// main method-start of progra
public static void main(String[] arg)
{
// When type of the object is determined at run-time, it is known as
// dynamic binding.
// Creating object of Fruit class
Fruit fruit = new Fruit();
// assigning name to fruit class
fruit.name = "Cherry";
// printing fruit class information using toString() method of Fruit
// class
System.out.println(fruit);
// 1) polymorphisms Starts
// Creating object of Apple class and assigning it to Fruit class
// reference
Fruit apple = new Apple(); // 4)Upcasting
// assigning name to Apple class
apple.name = "Green Apple";
/*
* printing Apple class information using overriden method
*
* of toString() method of Fruit class
*/
System.out.println(apple);
System.out.println("Apple Pie Recipe:"
+ ((Apple) apple).getApplePieRecipe());
// Creating object of Orange class and assigning it to Fruit class
// reference
Fruit orange = new Orange();// 4)Upcasting
// assigning name to Apple class
orange.name = "Orange";
/*
* printing Orange class information using overriden method
*
* of toString() method of Fruit class
*/
System.out.println(orange);
System.out.println("Orange Juice Recipe:"
+ ((Orange) orange).getOrangeJuiceRecipe());
// Creating object of GoldenDelicious class and assigning it to Apple
// class reference
Apple gd = new GoldenDelicious();// 4)Upcasting
// assigning name to GoldenDelicious class
gd.name = "Golden Delicious Fruit";
// printinf information of GoldenDelicious class
System.out.println(gd);
// Creating object of McIntosh class and assigning it to Apple class
// reference
Apple mi = new McIntosh(); // 4)Upcasting
// assigning name to McIntosh class
mi.name = "McIntosh Fruit";
// //printinf information of McIntosh class
System.out.println(mi);
// down casting
if (gd instanceof Apple)
{
// down casting
GoldenDelicious newGD = (GoldenDelicious) gd;
// and setting new name to GoldenDelicious object
newGD.name = "New Golden Delicious Fruit";
System.out.println("\n" + newGD.name);
}
if (mi instanceof Apple)
{
// down casting
McIntosh newMI = (McIntosh) mi;
// and setting new name to McIntosh object
newMI.name = "New McIntosh Fruit";
System.out.println("\n" + newMI.name);
}
ArrayList<Fruit> fruits=new ArrayList<Fruit>();
fruits.add(apple);
fruits.add(orange);
fruits.add(gd);
fruits.add(mi);
for(int i=0;i<fruits.size();i++)
{
if(fruits.get(i) instanceof GoldenDelicious)
System.out.println(((GoldenDelicious)fruits.get(i)).name);
else if(fruits.get(i) instanceof McIntosh)
System.out.println(((McIntosh)fruits.get(i)).name);
else
System.out.println(fruits.get(i).name);
}
}
}
