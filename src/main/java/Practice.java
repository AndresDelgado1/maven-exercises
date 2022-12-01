import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Something:");
        String input = in.nextLine();
        System.out.println("You Entered: " + "\"" + input + "\"");
        System.out.println(StringUtils.isNumeric(input) + ", " + "\"" + input + "\"" + " is not a number");
        System.out.println("Flipped Case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));

    }
}
