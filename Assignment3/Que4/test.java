package Q3;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(4);
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek\n4. Display Count");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(q.isFull())
					System.out.println("Queue is full");
				else {
					System.out.print("Enter value : ");
					int value = sc.nextInt();
					q.push(value);
				}
				break;
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					q.pop();
				break;
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Peeked value : " + q.peek());
				break;
			case 4:
				q.displayCount();
				break;
			case 0:
				System.out.println("thankyou");
				break;
			}
		}while(choice != 0);
		sc.close();
	}
}
