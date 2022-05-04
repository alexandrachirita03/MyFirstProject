package calculator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class LogicalOp {

    public int checkBiggerNumber(int first, int second) {

        if (first > second) {
            return first;
        } else {
            return second;

        }

    }

    public String verifyTextFastTrack(String first, String second) {
        if (first.equals(second)) {
            return "learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String verifyTextandNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrackIT") && number >= 4) {
            return number + text;
        } else {
            return "Oops";
        }
    }

    public String Snow(int number) {

        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm):" + number;
        } else {
            return "The forecast snow is(cm):" + number;
        }
    }

    public String verifyTheNumber(int number) {

        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3) {
            return "The number is lower than 3";
        } else {
            return "";
        }
    }

    public String theNumberIs(int number) {

        switch (number) {
            case 1:
                return "The number is 1";
            case 2:
                return "The number is 2";
            case 3:
                return "The number is 3";

            default:
                return "The number was not found";
        }
    }

    public boolean isNumberEven(int number) {
        if (number % 2 == 0) { // par
            return true;
        } else { // impar
            return false;
        }
    }

    public boolean isEligibleToVote(int number) {
        if (number >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int getHighestNumber(int first, int second, int third) {
        if (first > second) {
            return first;
        } else if (second > third) {
            return second;
        } else {
            return third;
        }
    }


    public void checkNumber(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void checkNo(int no) {
        for (int i = no; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void count(int first, int second) {
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }
    }

    public void counting(int smallest, int biggest) {
        for (int i = smallest; i <= biggest; i++) {
            System.out.println(i);
        }
    }

    public void numberEven(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void oddNumber(int number2) {
        for (int i = 1; i <= number2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void printSum(int number3) {
        int sum = 0;
        for (int i = 1; i <= number3; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
    }

    public void sumAndAverage(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
        System.out.println(sum / (to - from + 1f));
    }

    public void pattern(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }

    public void checkNumber2(int number2) {
        int i = number2;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

    }

    public void checkNo2(int no2) {
        int i = no2;
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

    public void count2(int first, int second) {
        int i = first;
        while (i <= second) {
            System.out.println(i);
            i++;
        }
    }

    public void counting2(int smallest, int biggest) {
        int i = smallest;
        while (i <= biggest) {
            System.out.println(i);
            i++;
        }
    }

    public void numberEven2(int number) {
        int i = 2;
        while (i <= number) {
            System.out.println(i);
            i = i + 2;
        }
    }

    public void oddNumber2(int number) {
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i = i + 2;
        }
    }

    public int getSum(int from, int to) {
        int x = from;
        int sum = 0;
        int count = 0;
        while (x <= to) {
            sum = x + sum;
            x++;
            count++;
        }
        {
            return sum;
        }
    }

    public double getAverageFrom7Numbers(int from, int to) {
        int x = from;
        int sum = 0;
        double counter = 0;
        while (x <= to) {
            if (x % 7 == 0) {
                sum = x + sum;
            }
            x++;
            counter++;

        }
        System.out.println(counter);
        return sum / counter;

    }

    public void diplayingFibonacciSeries(int num) {
        int count = 20;
        int firstNum = 0;
        int secondNum = 1;
        int i = 1;
        while (i <= count) {
            System.out.print(firstNum + ", ");
            int sumOfPrevTwo = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sumOfPrevTwo;
            i++;
        }

    }

    public int[] populateArraytoNumber(int max) {
        int[] myArray = new int[max];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;

        }
        return myArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    // Trebuie sa returneze vecotrul cu elementele pare, deci nu void, ci int[]
    public int[] getEvenNumbers(int[] evenArray) { // deci iti trebuie parametru un vector (int[]).

        // si trebuie sa il populezi cu toate numerele pare de la 1 la 100
        // pt asta, faci un for de la 1 la 100

        // contor pt a salva pozitia elementelor pe noul vector de numere pare evenArray[];
        int j = 0;

        for (int i = 1; i <= 100; i++) { // for de la 1 la 100, unde i va lua pe rand valori de la 1 la 100

            if (i % 2 == 0) { // aici verifici daca numarul (i) este par
                // iar daca este par, il adaugi in vectorul tau de numere pare: evenArray[]
                evenArray[j] = i; // aici o sa avem numarul i, pe pozitia j(0) in vector
                // apoi tre sa incrementam indexul j cu 1.
                j++;
            }
        }
        // dupa ce se termina forul, si se populeaza tot vectorul cu elementele pare, tre sa il returnam

        return evenArray;
    }


    public float getAverageNumberOfArray(int[] array) {
        //media e suma numerelor impartit la cate numere sunt
        //trebuie un for sa treci prin toayte elementele si sa le aduni, intr-o variabila sum
        // dupa ce iesi din for, returnezi rezultatul sum impartit la cate njumere sunt
        //iti trebuie o variabila inafara for, in care sa salvezi suma. Initial, ii dai valoarea 0
        float sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            //tre sa adaugi una cate una valoarea i-urilor in sumArray
            // asta tot in afara buclei for?
            // cum ai scris inainte
            sumArray = sumArray + array[i]; // asa aduni toate elementele din array[]
        }

        // iar aici faci o variabila average care e egala cu suma impartit la numarukl de elemente, peste

        float average = sumArray / array.length;

        // si returnezi
        return average;
        // si tipul returnal al metodei tre sa fie la fel cu avergae, adicsa float

    }

    public boolean checkArray(String[] arr, String name) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                return true;
            }

        }
        return false;

    }
    public int findIndex (int[] array, int number ) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;

    }

    public void printChars ( char [] chars){
        for ( int i = 0; i<10; i++){
            System.out.println(chars);
        }
    }

    public int [] getArray (int [] array, int number){
        int [] newArray = new int [array.length];
         int position = 0;

        for (int i = 0; i < array.length; i++ ) {
            if (number != array[i] ){
               newArray[position] = array[i];
               position++;
            }
        }

        int[] finalArray = new int [position];

        for (int i=0; i < position; i++) {
            finalArray[i] = newArray[i];
        }

        return finalArray;
    }

    public int [] copyFirstArrayInSecondArray(int[] firstArray, int[] secondArray){

                for(int i = 0; i< firstArray.length; i++){
                    secondArray[i] = firstArray[i];
                }
                return secondArray;
    }

    public void insertElement ( int [] array, int index, int number){

        array[index] = number;
    }

    public void getBiggestandSmallestNumberFromArray (int [] numbers){

        int smallest = numbers[0];
        int biggest = numbers [0];

        for( int i = 1; i < numbers.length; i++) {
            if ( numbers[i] < smallest){
                smallest = numbers[i];
            }

              if ( numbers [i] > biggest) {
                  biggest = numbers[i];
              }

        }
        System.out.println("Smallest number is " + smallest);
        System.out.println("Largest number is " + biggest);
    }

    //1. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou
     public void printList (ArrayList<Integer> list){
         for (int element:list) {
             System.out.println(element);
         }

     }

     //2. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
    // Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addNumberAtTheEndOfList (ArrayList<Integer> myList, int number){
        myList.add(number);
    }






  //  4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).


    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) {


        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {


            revArrayList.add(alist.get(i));
        }


        return revArrayList;
    }


    public void printElements(ArrayList<Integer> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }


    //5.Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
    // Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void addStringToMyList(ArrayList<String> fruitsList, int index, String text){

        fruitsList.add(index,text);

    }

   //6. Scrieti o metoda Java, care sa primeasca doi parametrii.
    // Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

   public void addNumbertoFirstPosition( ArrayList<Integer> listOfNumber, int number ) {
       listOfNumber.add(0, number);
   }

   //7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie.


    public void printIndexNumberOfElements (ArrayList<Integer> list2){
        for (int i = 0; i<list2.size(); i++)

            System.out.println("Index "+i+" are elementul "+list2.get(i));
    }
}

















