import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static view.InputConsole.inputStringConsole;

public class InputTest {
    @Test
    void inputStringConsoleTest(){
        Scanner scanner = new Scanner("pobi,woni,jun");
        List<String> testList = inputStringConsole(scanner);
        assertThat(testList).contains("pobi","woni","jun");
    }
}
