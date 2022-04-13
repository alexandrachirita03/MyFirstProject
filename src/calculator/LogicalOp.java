package calculator;

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

    public void oddNumber(int number2){
        for (int i=1; i <= number2; i++){
            if (i % 2!= 0) {
                System.out.println(i);
            }
        }
    }

    public void printSum(int number3){
       int sum = 0;
        for (int i=1; i <= number3; i++){
            sum = i + sum;
        }
        System.out.println(sum);
    }

    public void sumAndAverage(int from, int to){
        int sum = 0;
        for (int i= from; i <= to; i++){
            sum = i + sum;
        }
        System.out.println(sum);
        System.out.println(sum/(to-from+1f));
    }

    public void pattern(int n){
        for (int i = n-1; i >= 0; i--) {
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

    public void count2 (int first, int second) {
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
        while (i <= number)  {
                System.out.println(i);
                i = i + 2;
            }
        }

    public void oddNumber2(int number) {
        int i = 1;
        while (i <= number)  {
            System.out.println(i);
            i = i + 2;
        }
    }

    public int getSum (int from, int to){
        int x = from;
        int sum = 0;
        int count  = 0;
      while (x <= to){
          sum = x + sum;
          x++;
          count++;
      }
          {
            return sum;
        }
    }

    public double getAverageFrom7Numbers(int from, int to){
        int x = from;
        int sum = 0;
        double counter = 0;
        while(x <= to){
            if(x % 7 == 0){
                sum = x + sum;
            }
            x++;
            counter++;

        }
        System.out.println(counter);
        return sum/counter;

        }

    public void diplayingFibonacciSeries (int num) {
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


    }










