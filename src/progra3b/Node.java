package progra3b;

public class Node {

	Node next;
	Person person;

	public Node() {
	}

	public Node(Person person) {
		this.person = person;
		this.next = null;
	}

}
