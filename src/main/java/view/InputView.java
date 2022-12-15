package view;

import java.util.List;
import java.util.Scanner;

import static view.InputConsole.inputIntegerConsole;
import static view.InputConsole.inputStringConsole;

public class InputView {
    public static List<String> playerInputView(Scanner scanner){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return inputStringConsole(scanner);
    }
    public static Integer countInputView(Scanner scanner){
        System.out.println("시도할 회수는 몇회인가요?");
        return inputIntegerConsole(scanner);
    }
}
