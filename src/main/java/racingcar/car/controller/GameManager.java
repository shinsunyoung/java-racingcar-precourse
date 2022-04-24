package racingcar.car.controller;

import racingcar.car.model.Cars;
import racingcar.car.model.Racing;
import racingcar.car.view.InputView;
import racingcar.printer.Printer;
import racingcar.printer.SystemPrinter;


public class GameManager {

  private final Printer printer;
  private final InputView inputView;

  public GameManager(final SystemPrinter printer) {
    this.printer = printer;
    this.inputView = new InputView(printer);
  }

  public void start() {
    play();
  }

  private void play() {
    final Cars cars = inputView.readCars();
    final Racing racing = inputView.readRacing();

    racing.play(cars.getCars(), printer);
  }

}
