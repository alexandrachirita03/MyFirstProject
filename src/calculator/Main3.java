package calculator;

import java.net.StandardSocketOptions;

public class Main3 {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();

// Exercitiul 3
        int biggest = op.checkBiggerNumber(5, 3);

        System.out.println("The bigger number is: " + biggest);

        // Exercitiul 4
        String first = "FastTrackIT";

        String second = "FastTrackIT";

        String result = op.verifyTextFastTrack(first, second);

        System.out.println(result);

        //Exercitiul 5
        String text = "FastTrackIT";
        int x = 5;
        String verify = op.verifyTextandNumber(text,x);
        System.out.println(verify);

     //Exercitiul 6

        int number = 10;
        int number3 = 9;

        String result2 = op.Snow(number);
        System.out.println(result2);

        // Exercitiul 7

        int number4 = 4;
        int number5 = 5;
        String verifyTheNumber = op.verifyTheNumber(number4);
        System.out.println(verifyTheNumber);

        // Exercitiul 8

        int number2= 2;
        String result3 = op.theNumberIs(number2);
        System.out.println(result3);


        // Exercitiul 9

        boolean isNumberEven = op.isNumberEven(6);

        System.out.println(isNumberEven);

        // Exercitiul 10

        int age = 15;
         boolean isEligibleToVote = op.isEligibleToVote(age);
         System.out.println(isEligibleToVote);

         // Exercitiul 11

        int firstNumber = 20;
        int secondNumber = 15;
        int thirdNumber = 18;
        int getHighestNumber = op.getHighestNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println(getHighestNumber);
    }




    }




