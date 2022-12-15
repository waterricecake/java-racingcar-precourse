package racingcar;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private List<Car> cars;
    private Integer count;
    private Integer winnerScore;
    private List<String> winners;
    GameController(List<String> players, int count){
        this.cars = new ArrayList<>();
        this.count = count;
        for(String player: players){
            cars.add(new Car(player));
        }
    }
    public List<Car> getCars(){
        return cars;
    }
    public Integer getCount(){
        return count;
    }
    public List<String> selectWinners(){
        winnerScore = 0;
        winners = new ArrayList<>();
        for(Car car: cars){
            compareCar(car);
        }
        return this.winners;
    }
    private void compareCar(Car car){
        if(car.getPosition()>winnerScore){
            winners.clear();
            winners.add(car.getName());
            winnerScore = car.getPosition();
            return;
        }
        if(car.getPosition()==winnerScore){
            winners.add(car.getName());
        }
    }
}
