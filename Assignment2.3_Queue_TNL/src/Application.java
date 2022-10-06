
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		// Question 1
		System.out.println("Question 1");
		
		Queue<String> queue = new Queue<String>();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while (run == true) {
			System.out.println("\nType \"A\" to add to queue\n"
					+ "Type \"D\" to dequeue\n"
					+ "Type \"F\" to the front of the queue\n"
					+ "Type \"I\" to if the queue is empty\n"
					+ "Type \"C\" to clear the queue\n"
					+ "Type \"Q\" to see the queue\n"
					+ "Type \"E\" to end program");
			String word = scan.nextLine();
			if (word.equals("A")) {
				System.out.print("Enter something into the queue: ");
				word = scan.nextLine();
				queue.enqueue(word);
				System.out.println(word + " was added to the queue");
			}
			else if (word.equals("D"))
				System.out.println(queue.dequeue() + " was dequeued");
			else if (word.equals("F"))
				System.out.println(queue.getFront() + " is in the front");
			else if (word.equals("I"))
				System.out.println(queue.isEmpty());
			else if (word.equals("C")) {
				queue.clear();
				System.out.println("The queue was cleared");
			}
			else if (word.equals("Q"))
				System.out.println(queue.toString());
			else if (word.equals("E"))
				run = false;
			else
				System.out.println("Enter the right command");
		} 
		
		// Question 2
		System.out.println("Question 2");
		
		Queue<String> line = new Queue<String>();
		line.enqueue("Bill"); line.enqueue("Alice"); line.enqueue("Bob");
		System.out.println("Bill, Alice and Bob are in line"); System.out.println(line.toString());
		System.out.println(line.dequeue() + " was served"); System.out.println(line.toString());
		line.enqueue("Jane"); System.out.println("Jane arrives"); System.out.println(line.toString());
		line.enqueue("Hamad"); System.out.println("Hamad arrives"); System.out.println(line.toString());
		System.out.println(line.dequeue() + " and " + line.dequeue() + " was served"); System.out.println(line.toString());
		line.enqueue("Jim"); System.out.println("Jim arrives"); System.out.println(line.toString());
		System.out.println(line.dequeue() + " was served"); System.out.println(line.toString());
		System.out.println(line.dequeue() + " was served"); System.out.println(line.toString());
		
		
		
	}

}
