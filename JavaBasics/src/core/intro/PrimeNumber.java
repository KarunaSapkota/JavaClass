package core.intro;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[]args) {
	System.out.println("Enter the range of number: ");
	Scanner sc=new Scanner(System.in);
	int range=sc.nextInt();
	int num=2;
	while(num<=range) {
		int i=2;
		int flag=0;
		while(i<=(num/2)) {
			if(num %i==0) {
				flag=1;	
				break;
			}
			i++;
		}
		if(flag==0) {
			System.out.println(num);
		}
		
		num++;
		
	}
			
	
}
}
