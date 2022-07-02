package pkoder.dsa.linkedlist;

public class Main {
	public static void main(String [] args) {
		LinkedList l = new LinkedList();
		l.addFirst(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addLast(5);
		l.addLast(6);
		l.addLast(7);
		l.printMiddle();
		l.hasLoop();
	}
}
