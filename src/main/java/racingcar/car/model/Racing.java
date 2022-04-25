package racingcar.car.model;

public class Racing {

  private Cars cars;

  public Racing(Cars cars) {
    this.cars = cars;
  }

  public void play() {
    for (Car car : cars.getCars()) {
      car.run();
    }
  }
}
