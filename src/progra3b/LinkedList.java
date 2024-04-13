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
		Node tmp = start.next;
		while (tmp != null) {
			if (tmp.person.getAge() == age) {
				return tmp.person;
			}
			tmp = tmp.next;
		}
		return null;
	}
	
	public Person remove(int age) {
		if (start == null) {
			return null;
		}
		if (start.person.getAge() == age) {
			Node tmp = start;
			start = start.next;
			return tmp.person;
		}
		Node before = start;
		Node tmp = start.next;
		while (tmp != null) {
			if (tmp.person.getAge() == age) {
				before.next = tmp.next;
				tmp.next = null;
				return tmp.person;
			}
			before = tmp;
			tmp = tmp.next;
		}
		return null;
	}

}
