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
    public String verifyTextandNumber( String text, int number) {
        if (text.equals ("FastTrackIT") && number <=3) {
            return text + number;
        } else if (!text.equals ("FastTrackIT") && number >=4){
            return number + text;
        } else {
            return "Oops";
        }
    }

    public String Snow (int number) {

        if (number>8 || number==6) {
            return "The amount of snow this winter was(cm):" + number;
        } else {
            return "The forecast snow is(cm):" + number;
        }
    }

    public String verifyTheNumber (int number){

        if (number > 3 && number!=4){
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4){
            return "The number is equal to 4";
        }else if (number < 3){
            return "The number is lower than 3";
        }else {
            return "";
        }
    }

    public String theNumberIs (int number) {

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

    public boolean isEligibleToVote (int number) {
        if (number >=18){
            return true;
        }else {
            return false;
        }
    }

    public int  getHighestNumber (int first, int second, int third) {
       if (first > second){
           return first;
       } else if ( second > third) {
           return second;
       } else {
           return third;
       }
    }
}
