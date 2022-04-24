package racingcar.car.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {

  private final List<Car> cars;

  public Cars(String[] inputs) {
    this.cars = buildCarNames(inputs);
  }

  private List<Car> buildCarNames(String[] inputs) {
    List<Car> names = new ArrayList<>();

    for (String input : inputs) {
      names.add(new Car(input));
    }

    return names;
  }

  public List<Car> getCars() {
    return cars;
  }
}
