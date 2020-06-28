/*
 * Rafael C. Pereira
 * Data: 20/Jun/2020
 * Exercise:
 * Ask the user 10 numbers and insert them into an array of integer and 
 * show the lowest value inserted by user.
 * 
 */


import java.util.Scanner;

public class minimumValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int value[] = new int[10];

		for(int i = 0; i < value.length; i++){
			System.out.print("Enter the " +(i+1)+"º value: ");
			value[i] = sc.nextInt();
		} 

		int min=value[0];
		for(int i = 0; i < value.length; i++){
			if(min > value[i] ) {
				min = value[i];
			}
		}
		System.out.println("The minimum value is: "+ min);
	}
}




