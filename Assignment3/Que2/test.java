package Que2;

import java.util.Scanner;

import Que1.Stack1;

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack(5);
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek\n4. Find Max");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(st.isFull())
					System.out.println("Stack is full");
				else {
					System.out.print("Enter value : ");
					int value = sc.nextInt();
					st.push(value);
				}
				break;
			case 2:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Poped value : " + st.pop()); 
				break;
			case 3:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Peeked value : " + st.peek());
				break;
			case 4:
				int m=st.maxItem();
				System.out.println("greatest element in stack is: "+m);
				st.displayArr();
				break;
			}
		}while(choice != 0);
		sc.close();
	}
}
