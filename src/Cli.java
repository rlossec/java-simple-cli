import java.util.Scanner;
import java.util.Map;
import java.util.Arrays;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Objects;


public class Cli {

    // The main method is the entry point of the program. Rules regarding the main method:
    //     - public: so the JVM can access it from "outside"
    //     - static: so it can be called without creating an object (class scoped)
    //     - void: it doesn't return a value (aka procedure)
    //     - main: the required method name
    //     - String[] args: so it can receive command-line arguments
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Listen to the standard input (console)
		System.out.print("> "); // Prompt
		while (true) { // Infinite loop
			String command = scanner.nextLine(); // Get input from console as a string
			String[] parts = command.split(" ", 2);
			String keyword = parts[0];
			String arguments = "";
			if (parts.length > 1) {
				arguments = parts[1];
			}
			String output = "";
			if (keyword.equals("exit")) {
				break; // Forces exit of the while loop
			} else if (keyword.equals("date")) {
				LocalDateTime date = LocalDateTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				output = date.format(formatter);
			} else if (keyword.equals("time")) {
				LocalDateTime datetime = LocalDateTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss:ns");
				output = datetime.format(formatter);
			} else if (keyword.equals("datetime")) {
				LocalDateTime datetime = LocalDateTime.now();
				output = datetime.toString();
			}  else if (keyword.equals("useraccount")){
				output = System.getProperty("user.name");
			} else if (keyword.equals("userhome")) {
				output = System.getProperty("user.home");
			} else if (keyword.equals("os")) {	 
				String template = "%s (%s).";
				output = String.format(template, System.getProperty("os.name"), System.getProperty("os.version"));	
			} else if (keyword.equals("printenv")) {
				if (System.getenv(arguments) != null) {
					output = System.getenv(arguments);
				}
			} else if (keyword.equals("echo")) {
				output = arguments;
			} else {
				output = "Command '" + command + "' not found.";
			}
			System.out.println(output);
			System.out.print("> ");
		}
		scanner.close(); // always close a stream when no more needed
		System.out.println("Bye!");
    }

}

