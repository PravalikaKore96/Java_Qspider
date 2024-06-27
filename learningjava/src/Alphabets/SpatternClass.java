package Alphabets;

public class SpatternClass {

	

	    public static void main(String[] args) {
	        int rows = 5;

	        for (int i = 1; i <= rows; i++) {
	            // Print stars for the first half
	            for (int j = 1; j <= rows; j++) {
	                if (j <= i) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to a new line
	        }

	        for (int i = rows - 1; i >= 1; i--) {
	            // Print stars for the second half (excluding the middle)
	            for (int j = 1; j <= rows; j++) {
	                if (j < i) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to a new line
	        }
	    }
	}

