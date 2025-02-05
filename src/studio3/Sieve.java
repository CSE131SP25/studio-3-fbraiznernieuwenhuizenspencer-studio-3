package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers should we use?");
        int n = in.nextInt();
        
		int[] numbers = new int[n];
		
		int next = 1;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers.length - (numbers.length - next);
			next++;
			
			//System.out.println(numbers[i]);
			
			int value = numbers[i];
			}
		for (int j = 1 ; 2*j < numbers.length - 1; j++) {
			numbers[(2*j)+1] = 0;
			System.out.println(numbers[j]);
			System.out.println("next loop");

		}
		for (int j = 1 ; 3*j < numbers.length - 1; j++) {
			numbers[(3*j)+1] = 0;
			System.out.println(numbers[j]);
		}
		
		}
		
	}
//j.rayes?


