package racingcar;

import java.util.List;
import java.util.Scanner;

import static utils.RandomUtils.nextInt;
import static view.InputView.countInputView;
import static view.InputView.playerInputView;
import static view.OutputView.*;

public class Game {
    GameController gameController;
    Game(Scanner scanner){
        List<String> players = playerInputView(scanner);
        int count = countInputView(scanner);
        changeLine();
        gameController = new GameController(players,count);
        carRace();
        showResult();
    }
    private void showResult(){
        String result = String.join(", ",gameController.selectWinners());
        winnersOutputView(result);
    }
    private void carRace(){
        resultOutputView();
        for(int i=0;i<gameController.getCount();i++){;
            oneRace();
            changeLine();
        }
    }
    private void oneRace(){
        for(Car car: gameController.getCars()){
            randomMove(car);
            playerOutputView(car.getName(), car.getPosition());
        }
    }
    private void randomMove(Car car){
        int carMove = nextInt(0,9);
        if(carMove>=4){
            car.movePosition(1);
        }
    }
}
