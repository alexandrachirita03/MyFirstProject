package calculator;

import java.sql.SQLOutput;
import java.util.*;

public class Main5 {

    public static void main(String[] args) {

        //  2.
        LogicalOp op = new LogicalOp();
        int[] myArray = op.populateArraytoNumber(100);
        op.printArray(myArray);

        // 3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat
        // cu toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza.


        int[] evenArray;

        evenArray = op.getEvenNumbers(new int[50]);

        System.out.println("\nNumere pare:");

        op.printArray(evenArray);


      //  4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
        //  Metoda sa calculeze si sa returneze media numerelor din array.

        int[] array2 = new int[]{50, 9, 60};

        float average = op.getAverageNumberOfArray(array2);

        System.out.println("Average is: " + String.format("%.2f", op.getAverageNumberOfArray(array2)));

     //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.
        // Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.


        String [] arrayValue = new String []{"50", "20", "15"};
        String [] name = new String [] {"Vlad", "George", "Victor"};
        System.out.println(op.checkArray(arrayValue,"25"));
        System.out.println(op.checkArray(name, "George"));

        // 6.  Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
        //Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numaru

        int[] nrArray = new int []{25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        //int arr= [1, 9, 0, 3, 4];
        int ar = op.findIndex(nrArray, 25);


        if (ar == -1) {
            System.out.println( "N am gasit");
        }
        else {
            System.out.println("index of number is: " + ar);
        }

        //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:

        char [] chars = new char []{'-','-', '-', '-', '-', '-','-','-','-' };
        op.printChars(chars);

        // 8.Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
        //Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
        int [] array = new int [] {25, 89, 7, 5, 12, 6, 9, 13, 7};
        int number = 7;
        op.printArray(op.getArray(array, number));

        //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.



        //10.Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
        // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.

        int [] firstArray = new int [] {2, 5, 8, 78, 14, 16};
        int [] secondArray = new int [firstArray.length];
        op.printArray(op.copyFirstArrayInSecondArray(firstArray, secondArray));

        //11. Creati o metoda care insereze un element pe o pozitie specifica intr-un array.
         op.insertElement(firstArray, 2, 23);
        System.out.println( "\n");
         op.printArray(firstArray);

         // 12.Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.

       int [] numbers = new int []{123, 59, 130, 450, 10006, 8, 1};
        System.out.println( "\n");
       op.getBiggestandSmallestNumberFromArray(numbers);




    }

}

