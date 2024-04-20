import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter Extension Name
        System.out.print("Enter Extension Name: ");
        String extensionName = scanner.nextLine();

        // Prompting user to enter Author Name
        System.out.print("Enter Author Name: ");
        String authorName = scanner.nextLine();

        // Prompting user to enter Version Name
        System.out.print("Enter Version Name: ");
        String versionName = scanner.nextLine();

        // Prompting user to enter Instruction
        System.out.print("Enter Instruction: ");
        String instruction = scanner.nextLine();

        // Printing the formatted output
        String output = String.format("Extension Name: [%s], Version Name: [%s], Author Name: [%s], Instruction: [%s]",
                extensionName, versionName, authorName, instruction);
        System.out.println(output);

        // Allowing the user to copy the output by pressing Ctrl + C
        System.out.println("Press Ctrl + C to copy the output.");
    }
}