/*
Directions
Write a “FizzBuzz” program: for the numbers from 1 to 20, if a number is divisible by 3, print out “Fizz”.
If a number is divisible by 5, print out “Buzz”. If a number is divisible by 3 and 5, print out “Fizz Buzz.”
Otherwise, just print out the number. Hint: look up the modulo operator.
Here’s what he first three lines of your program output should look like:

	1
	2
	Fizz
*/

public class FizzBuzz {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 1; i <= numbers.length; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (i % 3==0) {
                System.out.println("Fizz");

            } else if (i % 5==0) {
                System.out.println("Buzz");

            } else {
                System.out.println(String.valueOf(i));

            }

        }

    }
}

