import java.util.Random;
import java.util.Scanner;


public class Apples {

	public static void printArray(int arr[]){
		
		for(int x:arr){
			System.out.println(x);
		}
		
		
		
	}
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b[] = new int[10];
		int sum=0;
		for(int x:a){
			System.out.println(x);
		}
		for(int i=0;i<b.length;i++){
			b[i] = input.nextInt();
		}
		printArray(b);
	}
}
