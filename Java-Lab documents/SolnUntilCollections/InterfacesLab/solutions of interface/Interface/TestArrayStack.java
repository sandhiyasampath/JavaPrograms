//Create a Stack as an interface
package uttara.solutions.Interface;

public class TestArrayStack {

	public static void main(String[] args) {
		Stack myStack = new ArrayStack();
		myStack.push(5);
		myStack.push(10);
		myStack.push(15);
		myStack.printElements(); ///-> should print 15 10 5
		System.out.println("in peek "+myStack.peek());// -> should print 15
		System.out.println("in pop "+myStack.pop());  //-> should print 15
		System.out.println("in peek "+myStack.peek()); //-> should print 10
		myStack.printElements(); //-> should print 10 5
		myStack.push(20);
		myStack.printElements();// -> should print 20 10 5



	}

}
