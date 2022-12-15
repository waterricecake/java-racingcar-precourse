package racingcar;

import java.util.List;
import java.util.Scanner;

import static view.InputView.countInputView;
import static view.InputView.playerInputView;
import static view.OutputView.playerOutputView;
import static view.OutputView.resultOutputView;

public class Game {
    GameController gameController;
    Game(Scanner scanner){
        List<String> players = playerInputView(scanner);
        int count = countInputView(scanner);
        gameController = new GameController(players,count);
    }

    private void carRace(){
        resultOutputView();
        for(int i=0;i<gameController.getCount();i++){

        }
    }

    private void oneRace(){
        for(Car car: gameController.getCars()){
            playerOutputView(car.getName(), car.getPosition());
        }
    }
}
