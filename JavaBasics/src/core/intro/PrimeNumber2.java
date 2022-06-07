package core.intro;

import java.util.Scanner;

public class PrimeNumber2 {
public static void main(String[]args) {
	System.out.println("Enter the number range: ");
	Scanner sc=new Scanner (System.in);
	int range=sc.nextInt();
	int num=2;
	while(num<=range) {
		//System.out.println(num);
		int flag=0;
		int i=2;
		while(i<=(num/2)) {
			if(num%i==0) {
				//composite
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
