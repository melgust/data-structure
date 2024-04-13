package progra3b;

public class LinkedList {
	
	Node start, end;
	
	public void set(Person person) {
		Node node = new Node(person);
		if (start == null) {
			start = node;
			end = node;
		} else {
			end.next = node;
			end = node;
		}
	}
	
	public Person get(int age) throws Exception {
		if (start == null) {
			return null;
		}
		if (start.person.getAge() == age) {
			return start.person;
		}
		while (start.next != null) {
			Node tmp = start.next;
			if (tmp.person.getAge() == age) {
				return tmp.person;
			}
		}
		return null;
	}

}
