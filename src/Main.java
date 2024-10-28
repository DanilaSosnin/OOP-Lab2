import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static boolean isValidHexColor(String colorCode) {
        String HEX_COLOR_PATTERN = "^#([a-fA-F0-9]{6})$";
        Pattern pattern = Pattern.compile(HEX_COLOR_PATTERN);
        Matcher matcher = pattern.matcher(colorCode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputColor = sc.nextLine();
        System.out.println(inputColor + " is valid: " + isValidHexColor(inputColor));
    }
}