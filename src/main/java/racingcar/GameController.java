package racingcar;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private List<Car> cars;
    private Integer count;
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
}
