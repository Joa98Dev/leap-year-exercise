//Leap Year Excercise
class leapYear {
    public static void main(String[] args) {
        System.out.println(calculateLeapYear(2012));
    }
    
    //This function checks if the variable year store a leap year or not
    //Beacuse of the combination of int and String the function declared is a String
    public static String calculateLeapYear(int year) {
        
        //Checks if the year is divisible between 4 and 400
        if (year % 4 == 0 && year % 400 == 0) {
            return year + " is a leap year";
        }
        //Checks if the year is divisible between 4, but not divisible between 100
        else if (year % 4 == 0 && year % 100 != 0 ) {
            return year + " is a leap year";
        }
        //Checks if the year is divisible between 100 and 400
        else if (year % 100 == 0 && year % 400 == 0) {
            return year + " is a leap year";
        }
        //If the year does not meet the above requirements it's not a leap year
        else {
            return year + " is not a leap year";
        }
    }

}

