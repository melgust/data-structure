package progra3b;

import java.util.Random;
import java.util.Stack;

public class DecToHex {

	public static void main(String[] args) {
		DecToHex decToHex = new DecToHex();
		decToHex.start();
	}
	
	public void start() {
		Random random = new Random();
		int number = random.nextInt(50000) + 1;
		int div = number;
		Stack<Integer> stack = new Stack<>();
		while (div > 15) {
			stack.push(div % 16);
			div = (div / 16);
		}
		stack.push(div);
		System.out.println("Numero generado " + number);
		String hex = "";
		while (!stack.empty()) {
			int value = stack.pop();
			switch (value) {
			case 15:
				hex += "F";
				break;
			case 14:
				hex += "E";
				break;
			case 13:
				hex += "D";
				break;
			case 12:
				hex += "C";
				break;
			case 11:
				hex += "B";
				break;
			case 10:
				hex += "A";
				break;
			default:
				hex += String.valueOf(value);
				break;
			}
		}
		System.err.println("Hexadecimal: " + hex);
	}

}
