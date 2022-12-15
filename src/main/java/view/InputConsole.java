package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputConsole {
    public static List<String> inputStringConsole(Scanner scanner){
        String input = scanner.nextLine();
        return Arrays.asList(input.split(","));
    }
    public static Integer inputIntegerConsole(Scanner scanner){
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }
}
