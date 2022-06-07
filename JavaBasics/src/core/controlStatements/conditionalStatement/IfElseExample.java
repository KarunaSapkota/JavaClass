package core.controlStatements.conditionalStatement;

import java.util.Scanner;

public class IfElseExample {
public static void main (String[] args){
int age;
System.out.println("Enter your age: ");
age=new Scanner(System.in).nextInt();
if(age<=18) {
	
	System.out.println("You are a minor. ");
}
else {
	System.out.println("You are an adult. ");
}
	
}
}
