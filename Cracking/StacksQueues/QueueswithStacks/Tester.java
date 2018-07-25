package QueueswithStacks;

public class Tester {
	public static void main(String[] args) {
		System.out.println("*** Test 3.4: Queue via Stacks\n");
		System.out.println("elements we will be inserting: 1, 2, 3, 4, 5\n");
		QueuewithStack<Integer> myQueue = new QueuewithStack<>();
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(3);
		myQueue.enqueue(4);
		System.out.println("1st dequeued = " + myQueue.dequeue());
		myQueue.enqueue(5);
		System.out.println("2nd dequeued = " + myQueue.dequeue());
		System.out.println("3rd dequeued = " + myQueue.dequeue());
	}
}
