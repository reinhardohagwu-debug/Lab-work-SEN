public class TimeConverter {

    //  Converts total seconds into hours, minutes and seconds
    public static int[] splitSeconds(int totalSeconds) {

        // Prevent negative values
        if (totalSeconds < 0) {
            throw new IllegalArgumentException("Seconds cannot be negative");
        }

        // Calculate hours
        int hours = totalSeconds / 3600;

        // Calculate remaining minutes
        int minutes = (totalSeconds % 3600) / 60;

        // Calculate remaining seconds
        int seconds = totalSeconds % 60;

        // Return the three values in an array
        return new int[]{hours, minutes, seconds};
    }


    //  Checks whether a year is a leap year
    public static boolean isLeapYear(int year) {

        // Named constants instead of unexplained numbers
        final int FOUR = 4;
        final int ONE_HUNDRED = 100;
        final int FOUR_HUNDRED = 400;

        // A leap year is divisible by 400,
        // or divisible by 4 but not divisible by 100.
        return (year % FOUR_HUNDRED == 0) ||
               (year % FOUR == 0 && year % ONE_HUNDRED != 0);
    }


    //  Calculates the sum of all digits in a number
    public static int digitSum(int n) {

        int sum = 0;

        // Convert to long first to handle Integer.MIN_VALUE safely
        long number = Math.abs((long) n);

        // Extract and add each digit
        while (number > 0) {

            int digit = (int) (number % 10);

            sum += digit;

            number = number / 10;
        }

        return sum;
    }


    // Main method for testing
    public static void main(String[] args) {

        // Test splitSeconds()
        int[] time = splitSeconds(3665);

        System.out.println("Hours: " + time[0]);
        System.out.println("Minutes: " + time[1]);
        System.out.println("Seconds: " + time[2]);

        // Test isLeapYear()
        System.out.println("Is 2024 a leap year? " + isLeapYear(2024));

        // Test digitSum()
        System.out.println("Digit sum of 1234: " + digitSum(1234));
    }
}
