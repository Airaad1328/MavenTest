import com.gmail.clarkin200.PasswordGenerator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input password length: ");
        int passwordLength = scanner.nextInt();

        String password = PasswordGenerator.generatePassword(passwordLength);

        System.out.println("Password is generated: " + password);
    }
}
