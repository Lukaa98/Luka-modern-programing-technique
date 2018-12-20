//CODE STARTS HERE

public class StackClient {//Generic stack checking client class

public static void main(String[] args) {//Main method starts here

GenericStack<Integer> gstack = new GenericStack<Integer>();//Creates the generic stack of Integers

gstack.push(1);//Pushing 3 objects to generic stack of Integers

gstack.push(2);

gstack.push(3);

System.out.println("After Pushing 3 Integers : "+gstack.toString());//Printing the generic stack of Integers

gstack.pop();//Popping 3 objects to generic stack of Integers

gstack.pop();

gstack.pop();

System.out.println("After Poping 3 Integers : "+gstack.toString());//Printing the generic stack of Integers

GenericStack<Double> gsstackd = new GenericStack<Double>();//Creates the generic stack of Double

gsstackd.push(1.0);//Pushing 3 objects to generic stack of Double

gsstackd.push(2.0);

gsstackd.push(3.0);

System.out.println("After Pushing 3 Double : "+gsstackd.toString());//Printing the generic stack of Double

gsstackd.pop();

gsstackd.pop();

gsstackd.pop();

System.out.println("After Poping 3 Double : "+gstack.toString());//Printing the generic stack of Double

}

}
