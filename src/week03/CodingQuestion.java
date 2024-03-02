package week03;
import java.util.*;

public class CodingQuestion {

	static int sumOfDigits(int digits) {
	    
	    // WRITE YOUR CODE HERE
	    int sum = 0;
        for(int ix = 0; Math.pow(10,ix) <= digits;ix++){
            sum+=(digits/(int)Math.pow(10,ix))-(digits/(int)Math.pow(10,ix+1))*(int)Math.pow(10,ix+1);
            System.out.println("here");
        }

        return sum;




		
/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int digits = in.nextInt();
		int sumAll = sumOfDigits(digits);
		System.out.println("The sum of all digits for the value " + digits + " is " + sumAll + ".");
		in.close();
	}
}