package racingcar.car.model;

import java.util.ArrayList;
import java.util.List;

public class CarNames {

  private final List<Car> carNames;

  public CarNames(String[] inputs) {
    this.carNames = buildCarNames(inputs);
  }

  private List<Car> buildCarNames(String[] inputs) {
    List<Car> names = new ArrayList<>();

    for (String input : inputs) {
      names.add(new Car(input));
    }

    return names;
  }
}
