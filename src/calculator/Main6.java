package calculator;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main6 {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        op.printList(list);

        ArrayList<Integer> myList = new ArrayList<Integer>();

        myList.add(18);
        myList.add(30);
        myList.add(29);
        myList.add(40);
       int number = 17;
        myList.add(number);
        System.out.println(myList);





        ArrayList<Integer> arrayli = new ArrayList<Integer>();

        arrayli.add(15);
        arrayli.add(25);
        arrayli.add(35);
        arrayli.add(45);
        arrayli = op.reverseArrayList(arrayli);
        System.out.print("\nElements after reversing:");
        op.printElements(arrayli);


      ArrayList<String> fruitslist = new ArrayList<String>();

      fruitslist.add("Mango");
      fruitslist.add("Peach");
      fruitslist.add("Kiwi");
      fruitslist.add("Raspberry");
      int index = 0;
      String text = "Strawberry";
        fruitslist.add(index,text);
        System.out.println("\n " + fruitslist);



        ArrayList<Integer> listOfNumber = new ArrayList<Integer>();
        listOfNumber.add(10);
        listOfNumber.add(15);
        listOfNumber.add(20);
        listOfNumber.add(25);
        int number2 = 50;
        listOfNumber.add(0, number2);
        System.out.println("\n " + listOfNumber);


        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(15);
        list2.add(20);
        list2.add(25);
        int index1= list2.indexOf(10);
        int index2 = list2.indexOf(15);
        int index3 = list2.indexOf(20);
        int index4 = list2.indexOf(25);
        System.out.println("10 is located at "+index1+" index");
        System.out.println("15 is located at "+index2+" index");
        System.out.println("20 is located at "+index3+" index");
        System.out.println("25 is located at "+index4+" index");







    }


}
