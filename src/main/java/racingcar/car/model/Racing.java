package racingcar.car.model;

import java.util.List;
import racingcar.car.view.RacingView;
import racingcar.printer.Printer;

public class Racing {

  private final int attemptCount;

  public Racing(int attemptCount) {
    this.attemptCount = attemptCount;
  }

  public Result play(Cars cars, Printer printer) {
    for (int i = 0; i < attemptCount; i++) {
      race(cars);
      printRacingProcess(cars, printer);
    }

    return new Result(cars);
  }

  private void printRacingProcess(Cars cars, Printer printer) {
    RacingView view = new RacingView(printer);
    view.printRacingProcess(cars);
  }

  private void race(Cars cars) {
    for (Car car : cars.getCars()) {
      car.run();
    }
  }
}
