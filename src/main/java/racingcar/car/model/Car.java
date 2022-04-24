package racingcar.car.model;

import racingcar.car.exception.CarNameLengthException;

public class Car {

  public static final int NAME_MAX_LENGTH = 5;

  private final String name;

  public Car(String name) {
    validate(name);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  private void validate(String name) {
    validateLength(name);
  }


  private void validateLength(String input) {
    if (input.length() > NAME_MAX_LENGTH) {
      throw new CarNameLengthException();
    }
  }
}
