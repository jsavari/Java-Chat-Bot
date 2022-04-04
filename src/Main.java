import java.util.Scanner;
import static java.lang.System.out;

public class Main {

	static Scanner inp = new Scanner(System.in);

	public static void main(String[] args) {

		out.println("Chat Bot v1.0");
		out.print("Username: ");
		String username = inp.nextLine();
		out.println("\033[H\033[2J");
		out.println("Hey " + username + ", I'm Josh! What can I help you with?");
		while (true) {
			String msg = inp.nextLine();
			processMessage(msg);
		}

	}

	static void processMessage(String copy_msg) {
		String msg = copy_msg.toLowerCase();
		if (msg.contains("hello")) {
			out.println("Hey!");
		} else if (msg.contains("need") || msg.contains("help") || msg.contains("math")) {
			math();
		} else if (msg.contains("thanks") || 
						 	 msg.contains("thank")) {
									out.println("No problem!");			
							 }
		else if (msg.contains("@exit")) {
			out.println("Have a nice day, bye :)");
			System.exit(0);
		} else if (msg.contains("who are you") || msg.contains("tell me") || msg.contains("about") || msg.contains("yourself")) {
			out.println("I'm Josh and I'm a friendly chat bot coded in Java by my creator Jayden. I have a lot of functionality and can do many things. Oh, and do you need help with you're math homework? Just type in, I need math help, or anything similar to that. Have a great day :) ");
		}

	}

	static int math() {
		Math mathBoard = new Math();
		out.println("Alrighty, what math operation do you need help with?");
		String msg = inp.nextLine();
		String op_msg = msg.toLowerCase();
		if (op_msg.contains("subtraction") || 
				op_msg.contains("subtracting")) {
					out.println("What's you're first number? ex. 3");
					int num1 = inp.nextInt();
					out.println("What's you're second number? ex. 2");
					int num2 = inp.nextInt();
					int result = mathBoard.sub(num1, num2);
					out.println("According to my calculations, the answer is: " + result);
				}
		if (op_msg.contains("addition") || 
				op_msg.contains("adding")) {
					out.println("What's you're first number? ex. 3");
					int num1 = inp.nextInt();
					out.println("What's you're second number? ex. 2");
					int num2 = inp.nextInt();
					int result = mathBoard.add(num1, num2);
					out.println("According to my calculations, the answer is: " + result);
				}
		if (op_msg.contains("multiplication") || 
				op_msg.contains("multiplying")) {
					out.println("What's you're first number? ex. 3");
					int num1 = inp.nextInt();
					out.println("What's you're second number? ex. 2");
					int num2 = inp.nextInt();
					int result = mathBoard.mul(num1, num2);
					out.println("According to my calculations, the answer is: " + result);
				}
		if (op_msg.contains("division") || 
				op_msg.contains("dividing")) {
					out.println("What's you're first number? ex. 3");
					int num1 = inp.nextInt();
					out.println("What's you're second number? ex. 2");
					int num2 = inp.nextInt();
					int result = mathBoard.div(num1, num2);
					out.println("According to my calculations, the answer is: " + result);
				}

		// Return random number
		return 1;
	}

}
