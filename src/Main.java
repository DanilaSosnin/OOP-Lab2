import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static boolean isValidMacAddress(String Code) {
        String MAC_ADDRESS_PATTERN = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";
        return Pattern.compile(MAC_ADDRESS_PATTERN).matcher(Code).matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputAddress = sc.nextLine();
        System.out.println(inputAddress + " is valid: " + isValidMacAddress(inputAddress));
    }
}