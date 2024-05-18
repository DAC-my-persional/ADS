package Q2;

import Q2.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l= new List();
		l.AddFirst(30);
		l.AddFirst(20);
		l.AddFirst(10);
		l.dislpay();
		
		l.AddLast(40);
		l.AddLast(50);
		l.dislpay();
		
		l.DeleteFirst();
		l.DeleteLast();
		l.dislpay();
		
		l.AddPos(25, 3);
		l.dislpay();
		
		l.DeletePos(3);
		l.dislpay();	}

}
